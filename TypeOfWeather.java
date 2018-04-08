enum TypeOfWeather {
	FOG("Туман"),
	SHOWER("Ливень"),
	TORNADO("Торнадо"),
	CLOUDLESS("Хорошая погода");

	private String translation;

	TypeOfWeather(String translation) {
		this.translation = translation;
	}

	public String getTranslation() {
		return translation;
	}
	
}