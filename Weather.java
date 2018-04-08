class Weather implements PoorConditionsForTravel{
	
	
	@Override
	public String becomeBetter(Location location) {
		Location lll = new Location("");
		lll.setWeatherInLocation(location.getWeatherInLocation());
		location.setWeatherInLocation(TypeOfWeather.CLOUDLESS);
		switch (lll.getWeatherInLocation()) {
			case FOG: {
				return (lll.getWeatherInLocationRus() + " ���� ����������.");
			}
			case SHOWER: {
				return (lll.getWeatherInLocationRus() + " �����������, � �� ���� ��������� ������.");
			}
			case TORNADO: {
				return (lll.getWeatherInLocationRus() + " ������ �� ��������� ����.");
			}
			case CLOUDLESS: {
				return (lll.getWeatherInLocationRus() + " ��� ����������� ������");
			}
			default: {
				return ("������ �������� ������ ��� �����������.");
			}
		}
	}

	@Override
	public String makeLowVisibility(Location location) {
		switch (location.getWeatherInLocation()) {
			case FOG: {
				return ("��-�� ������ ������ ������ ������ �� ���� �����.");
			}
			case SHOWER: {
				return (location.getWeatherInLocationRus() + " �� ����� ����������� ������ ������ ������������ ����.");
			}
			case TORNADO: {
				return (location.getWeatherInLocationRus() + " �������� ���� � �����, ������� ���������.");
			}
			case CLOUDLESS: {
				return ("������ ������� ���� ���� � �����, ������ ���� ����������� ���������.");
			}
			default: {
				return (" �������� ��� ���������.");
			}
		}
	}
}