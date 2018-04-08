public class Hats implements Body {

	public boolean owner = false;
	private String name;
	private Moonlighter moonlighter;
	private Location location;
	

	public Hats(Moonlighter moonlighter, String name) {
		moonlighter.deleteHat();
		this.moonlighter = moonlighter;
		this.name = name;
		moonlighter.setHat(this);
		this.location = moonlighter.getLocation();
	}	


	@Override
	public void lie() {
		System.out.print(this.name);
	}
	
	@Override
	public void fall(Location location) {
		this.location = location;
		if (this.owner) {
			System.out.println(this.name + " упал с головы " + this.moonlighter.getName2());
			this.moonlighter.deleteHat();
		}
		
	}

	public void setOwner(Moonlighter moonlighter) {
		this.owner = true;
		this.moonlighter = moonlighter;
	}

	public void deleteOwner() {
		this.owner = false;
		this.moonlighter = null;
	}

	public Location getLocation() {
		return this.location;
	}

	public String getName() {
		return this.name;
	}
}




