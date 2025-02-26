package middleearth.app.characters;

public class Wizard extends MiddleEarthCharacter {

	public Wizard(String name, Double health, Double power) {
		super(name, health, power);
	}
	
	/**
	 * Performs an attack on a target based on the rules of a wizard
	 * attack on the targets race.
	 * @param target (MiddleEarthCharacter)
	 * 		The argument is the character to be attacked.
	 * */
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		
		// Wizards attack Dwarfs w/ x1.5 power
		if(target.getClass().getSimpleName().equals("Dwarf"))
		{
			target.health -= 1.5 * power;
			return true;
		}
		
		// Wizards attack Humans and fellow Wizards w/ no power
		if(target.getClass().getSimpleName().equals("Human") ||
				target.getClass().getSimpleName().equals("Wizard"))
		{
			target.health -= 0;
			return true;
		}
		
		// Wizards attack Elfs and Orcs w/ normal power
		if(target.getClass().getSimpleName().equals("Elf") ||
				target.getClass().getSimpleName().equals("Orc"))
		{
			target.health -= power;
			return true;
		}
			
		return false;
	}

	/**
	 * Returns the race of the MiddleEarthCharacter, which is the simple name of
	 * the MiddleEarthCharacter. This is for the Wizard.
	 */
	@Override
	public String getRace() {
		return this.getClass().getSimpleName();
	}

}
