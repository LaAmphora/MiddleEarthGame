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
	
	
	/** Gets the name of a Middle Earth Character object*/
	public String getName() {
		return name;
	}
	
	/** Sets the name of a Middle Earth Character object
	 * @param name (String)
	 * 		This argument is the name of the character.
	 * */
	public void setName(String name) {
		this.name = name;
	}


	/** Gets the health of a Middle Earth Character object*/
	public Double getHealth() {
		return health;
	}

	
	/** Sets the health of a Middle Earth Character object
	 * @param health (Double)
	 * 		This argument is the health of the character.
	 * */
	public void setHealth(Double health) {
		this.health = health;
	}


	/** Gets the power of a Middle Earth Character object*/
	public Double getPower() {
		return power;
	}

	/** Sets the power of a Middle Earth Character object
	 * @param power (Double)
	 * 		This argument is the power of the character.
	 * */
	public void setPower(Double power) {
		this.power = power;
	}


	/**
	 * Abstract method used to attack for the subclasses.
	 * @param target
	 * 		The character that is being attacked.
	 * @return
	 */
	public abstract boolean attack(MiddleEarthCharacter target);
	
	/**
	 * Abstract method used to get the race of the subclasses.
	 * @return
	 */
	public abstract String getRace();
	
	
	/**
	 * Displays information about a Middle Earth Character.
	 * */
	public void displayInfo() {
		System.out.println(name + " Information: Health=" + health + " Power=" + power);
	}
	
}
