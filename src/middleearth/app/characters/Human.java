package middleearth.app.characters;

public class Human extends MiddleEarthCharacter {

	public Human(String name, Double health, Double power) {
		super(name, health, power);
	}

	/**
	 * Performs an attack on a target based on the rules of a human
	 * attack on the targets race.
	 * @param target (MiddleEarthCharacter)
	 * 		The argument is the character to be attacked.
	 * */
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		
		double health = target.getHealth();
		
		// Humans attack Wizards w/ x1.5 power
		if(target.getClass().getSimpleName().equals("Wizard"))
		{
			health -= 1.5 * getPower();
			target.setHealth(health);
			return true;
		}
		
		// Humans attack Orcs and fellow Humans w/ no power
		if(target.getClass().getSimpleName().equals("Orc") ||
				target.getClass().getSimpleName().equals("Human"))
		{
			health -= 0;
			return true;
		}
		
		// Humans attack Elves and Dwarfs w/ normal power
		if(target.getClass().getSimpleName().equals("Elf") ||
				target.getClass().getSimpleName().equals("Dwarf"))
		{
			health -= getPower();
			target.setHealth(health);
			return true;
		}
			
		return false;
	}

	/**
	 * Returns the race of the MiddleEarthCharacter, which is the simple name of
	 * the MiddleEarthCharacter. This is for the Human.
	 */
	@Override
	public String getRace() {
		return this.getClass().getSimpleName();
	}

}
