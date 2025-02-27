package middleearth.app.characters;

public abstract class MiddleEarthCharacter {
	
	private String name;
	private Double health;
	private Double power;

	
	/**
	 * This is a parameterized constructor that allows the user to create
	 * a Middle Earth Character with a name, health, and power.
	 * @param name (String)
	 * 		This argument is the name of the character.
	 * @param helath (Double)
	 * 		This argument is the health of the character.
	 * @param power (Double)
	 * 		This argument is the power of the character.
	 * */
	public MiddleEarthCharacter(String name, Double health, Double power) {
		this.name = name;
		this.health = health;
		this.power = power;
	}
	
	
	
	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}


	public Double getHealth() {
		return health;
	}


	public void setHealth(Double health) {
		this.health = health;
	}


	public Double getPower() {
		return power;
	}


	public void setPower(Double power) {
		this.power = power;
	}



	public abstract boolean attack(MiddleEarthCharacter target);
	
	public abstract String getRace();
	
	
	/**
	 * Displays information about a Middle Earth Character.
	 * */
	public void displayInfo() {
		System.out.println(name + " Information: Health=" + health + " Power=" + power);
	}
	
}
