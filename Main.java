public class Main {
	public static void main(String[] args) {

		System.out.println("\"�������� �� ����\"");

		Location ravine = new Location("�����");
		Location field = new Location("����", TypeOfWeather.CLOUDLESS);
		Weather weather = new Weather();

		Moonlighter skuperfild = new Moonlighter("�����������", 70, field);
		//Moonlighter bob = new Moonlighter("���", 50, field);
		Hats cylinder = new Hats(skuperfild, "�������");

		skuperfild.fall(ravine);
		//bob.fall(ravine);

		Garbage stones = new Garbage("��������� �������");
		Garbage dirtClods = new Garbage("����� �����", 20);

		stones.fall(ravine);
		dirtClods.fall(ravine);

		skuperfild.feel();
		//bob.feel();
		
		skuperfild.lookAround();
		System.out.println(weather.makeLowVisibility(ravine));

		skuperfild.findHat(cylinder);

		skuperfild.feel("�����");
		skuperfild.moovUp();

		System.out.println(weather.becomeBetter(ravine));

		skuperfild.moov();
		System.out.println(skuperfild);
	}
}