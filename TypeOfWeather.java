enum TypeOfWeather {
	FOG("�����"),
	SHOWER("������"),
	TORNADO("�������"),
	CLOUDLESS("������� ������");

	private String translation;

	TypeOfWeather(String translation) {
		this.translation = translation;
	}

	public String getTranslation() {
		return translation;
	}
	
}