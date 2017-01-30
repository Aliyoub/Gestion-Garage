package co.simplon.lifegarage;

public enum Color {	
	RED("ROUGE","FFFF00"), GREEN("VERT","#008000") ,BLUE("BLEU","#0000FF");
	
	private final String colorKey;
	private final String colorValue;

	private Color(String colorKey, String colorValue) {
		this.colorValue = colorValue;
		this.colorKey = colorKey;
	}

	public String getColorKey() {
		return this.colorKey;
	}

	public String getColorValue() {
		return colorValue;
	}

}
