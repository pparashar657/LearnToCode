package classes;

public enum Temp {
    SIX("06:00"),
    SEVEN("07:00");

	private final String value;
	
	Temp(String value) {
    	this.value = value;
	}
	
	public String getValue() {
        return this.value;
    }
    
}
