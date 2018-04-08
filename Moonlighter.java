import java.util.Random;

public class Moonlighter extends BodyWithMass{

	private int health = 100;
	private Location location;
	private String name2;
	private Hats hat;
	

	public Moonlighter(String name, int mass, Location location) {
		this.name = name;
		this.name2 = name + 'а';
		this.mass = mass;
		this.location = location;
	}
	
	public Moonlighter(String name, Location location) {
		this.name = name;
		this.name2 = name + 'а';
		this.mass = 50;
		this.location = location;
	}

	@Override
	public void lie() {
		System.out.println("Он лежал ничком, разбросав в стороны руки. ");
	}

	@Override
	public void fall(Location location) {
		if (this.location != location) {
		this.hat.fall(location);
		System.out.print("Перекувырнувшись несколько раз через голову, ");
		this.location = location;
		location.moonPeople.addElement(this);
		}
		System.out.println(this.name + " скатился в " + location.getLocationName() + ". ");
		this.lie();
	}

	public String toString() {
		if (this.health >= 50) {
			return (this.name + " отлично себя чувствует, его здоровье = " + this.health);
		} else {
			return (this.name + " кричит: \"Мне больно!!! Помогите!\", его здоровье = " + this.health);
		}
	}
	
	public void sufferedDamage(int Damage) {
		this.health -= Damage;
	}
	
	public void feel() {
		System.out.println("Ощупывая себя со всех сторон " + this.name + " убедился, что" + this.ribs());
	}

	public void feel(String smth) {
		System.out.print("Oщупывая " + smth + " тростью " + this.name);
	}
	
	private String ribs() {
		if(this.health >=50) {
			return " не переломал ребер.";
		} else {
			return " его ребра сломаны.";
		}
	}

	public void moov() {
		if(this.health >=50) {
			System.out.println(this.name + " отправился в путь.");
		} else {
			System.out.println(this.name + " пополз за помощью.");
		}
	}

	public void moovUp() {
		System.out.println(" cтал карабкаться вверх.");
		Random random = new Random();
		int i = random.nextInt(2);
		while(i>0) {
			this.fall(this.location);
			i = random.nextInt(1);
		}
		if(this.health <=50) {
			this.fall(this.location);
		}
		System.out.println("Наконец ему удалось выбраться.");
	}
	
	public void lookAround() {
		System.out.print(this.name + " стал осматриваться по сторонам, но ");
	}

	public String getName2(){
		return this.name2;
	}

	public void setHat(Hats hat) {
		this.hat = hat;
		this.hat.setOwner(this);
		System.out.println(this.name + " водворил свой головной убор на принадлежащее ему место. ");
	}

	public void deleteHat() {
		if (this.hat != null) {
			this.hat.deleteOwner();	
			this.hat = null;
		}
	}
	
	public Location getLocation() {
		return this.location;
	}

	public void findHat(Hats hat) {
		System.out.print(this.name + " ищет " + hat.getName() + ". ");
		hat.lie();
		if (this.location.equals(hat.getLocation())) {
			setHat(hat);
		}
	}
}