public class Main {
	public static void main(String[] args) {

		System.out.println("\"Незнайка на Луне\"");

		Location ravine = new Location("овраг");
		Location field = new Location("поле", TypeOfWeather.CLOUDLESS);
		Weather weather = new Weather();

		Moonlighter skuperfild = new Moonlighter("Скуперфильд", 70, field);
		//Moonlighter bob = new Moonlighter("Боб", 50, field);
		Hats cylinder = new Hats(skuperfild, "Цилиндр");

		skuperfild.fall(ravine);
		//bob.fall(ravine);

		Garbage stones = new Garbage("Маленькие камешки");
		Garbage dirtClods = new Garbage("Комья грязи", 20);

		stones.fall(ravine);
		dirtClods.fall(ravine);

		skuperfild.feel();
		//bob.feel();
		
		skuperfild.lookAround();
		System.out.println(weather.makeLowVisibility(ravine));

		skuperfild.findHat(cylinder);

		skuperfild.feel("землю");
		skuperfild.moovUp();

		System.out.println(weather.becomeBetter(ravine));

		skuperfild.moov();
		System.out.println(skuperfild);
	}
}