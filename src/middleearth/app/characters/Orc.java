package middleearth.app.characters;

public class Orc extends MiddleEarthCharacter{

	public Orc(String name, Double health, Double power) {
		super(name, health, power);
	}

	/**
	 * Performs an attack on a target based on the rules of a orc
	 * attack on the targets race.
	 * @param target (MiddleEarthCharacter)
	 * 		The argument is the character to be attacked.
	 * */
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		
		// Orcs attack Humans w/ x1.5 power
		if(target.getClass().getSimpleName().equals("Human"))
		{
			target.health -= 1.5 * power;
			return true;
		}
		
		// Orcs attack Elves and fellow Orcs w/ no power
		if(target.getClass().getSimpleName().equals("Orc") ||
				target.getClass().getSimpleName().equals("Elf"))
		{
			target.health -= 0;
			return true;
		}
		
		// Orcs attack Wizards and Dwarfs w/ normal power
		if(target.getClass().getSimpleName().equals("Wizard") ||
				target.getClass().getSimpleName().equals("Dwarf"))
		{
			target.health -= power;
			return true;
		}
			
		return false;
	}

	/**
	 * Returns the race of the MiddleEarthCharacter, which is the simple name of
	 * the MiddleEarthCharacter. This is for the Orc.
	 */
	@Override
	public String getRace() {
		return this.getClass().getSimpleName();
	}

}
