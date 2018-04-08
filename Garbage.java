import java.util.Random;

public class Garbage extends BodyWithMass {

	public Garbage(String name, int mass) {
		this.name = name;
		this.mass = mass;
	}

	public Garbage(String name) {
		this.name = name;
		mass = 10;
	}

	@Override
	public void lie() {
		System.out.println(this.name + " прекратили свое движение.");
	}
	
	@Override
	public void fall(Location location) {
		System.out.println(this.name + " катились в " + location.getLocationName() + ".");
		Moonlighter[] moon = new Moonlighter[location.moonPeople.size()];
		//System.out.println(location.moonPeople.size());
		//System.out.println(moon.length);
		this.tryToHurt(location.moonPeople.toArray(moon));
		this.lie();
	}

	public int hashcode() {
		Random random = new Random();
		return this.mass*(random.nextInt(2)+1);
	}

	//public void tryToHurt(Moonlighter moonlighter) {
	//	System.out.println(this.name + " колотили " + moonlighter.getName2() + " по спине.");
	//	moonlighter.sufferedDamage(this.hashcode());
	//}

	public void tryToHurt(Moonlighter[] mmm) {
		int sum = 0;
		for( int i = 0; i<mmm.length; i++) {
			mmm[i].sufferedDamage(this.hashcode());
			System.out.println(this.name + " колотили " + mmm[i].getName2() + " по спине.");
		}
	}
}




