class Weather implements PoorConditionsForTravel{
	
	
	@Override
	public String becomeBetter(Location location) {
		Location lll = new Location("");
		lll.setWeatherInLocation(location.getWeatherInLocation());
		location.setWeatherInLocation(TypeOfWeather.CLOUDLESS);
		switch (lll.getWeatherInLocation()) {
			case FOG: {
				return (lll.getWeatherInLocationRus() + " стал прозрачнее.");
			}
			case SHOWER: {
				return (lll.getWeatherInLocationRus() + " прекратился, и на небе появилась радуга.");
			}
			case TORNADO: {
				return (lll.getWeatherInLocationRus() + " больше не поднимает пыль.");
			}
			case CLOUDLESS: {
				return (lll.getWeatherInLocationRus() + " для путешествия теперь");
			}
			default: {
				return ("теперь отличная погода для путешествия.");
			}
		}
	}

	@Override
	public String makeLowVisibility(Location location) {
		switch (location.getWeatherInLocation()) {
			case FOG: {
				return ("из-за тумана ровным счетом ничего не было видно.");
			}
			case SHOWER: {
				return (location.getWeatherInLocationRus() + " не давал возможности видеть дальше собственного носа.");
			}
			case TORNADO: {
				return (location.getWeatherInLocationRus() + " поднимал пыль с земли, ухудшая видимость.");
			}
			case CLOUDLESS: {
				return ("солнце слишком ярко било в глаза, сложно было рассмотреть окружение.");
			}
			default: {
				return (" внезапно все потемнело.");
			}
		}
	}
}