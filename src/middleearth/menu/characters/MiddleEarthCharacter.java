package middleearth.menu.characters;

public abstract class MiddleEarthCharacter {
	
	String name;
	Double health;
	Double power;

	
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
	
	
	abstract boolean attack(MiddleEarthCharacter target);
	
	abstract String getRace();
	
	
	void displayInfo() {
		System.out.println(name + " Information: Health=" + health + " Power=" + power);
	}
	
}
