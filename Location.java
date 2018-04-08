import java.util.Random;
import java.util.Vector;

public class Location {
	
	private TypeOfWeather weatherInLocation;
	private String name;
	Vector<Moonlighter> moonPeople = new Vector();

	public Location(String name) {
		this.name = name;
		Random r = new Random();
		TypeOfWeather[] lala = TypeOfWeather.values();
		this.weatherInLocation = lala[(r.nextInt(4))];
	}
	
	public Location(String name, TypeOfWeather newWeather) {
		this.name = name;
		this.weatherInLocation = newWeather;
	}

	//***** set and get

	public void setWeatherInLocation(TypeOfWeather newWeather) {
		this.weatherInLocation = newWeather;
	}

	public String getWeatherInLocationRus() {
		return this.weatherInLocation.getTranslation();
	}

	public TypeOfWeather getWeatherInLocation() {
		return this.weatherInLocation;
	}

	public String getLocationName() {
		return this.name;
	}

	//***** equals

	public boolean equals(Location location) {
		if (this == location) {
			System.out.println(" оказался неподалеку");
			return true;
		} else {
			System.out.println(" где-то в другом месте");
			return false;
		}
	}
}