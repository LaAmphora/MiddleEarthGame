
package middleearth.app.characters;

public class Elf extends MiddleEarthCharacter {
	
	public Elf(String name, Double health, Double power) {
		super(name, health, power);
	}

	/**
	 * Performs an attack on a target based on the rules of an elf
	 * attack on the target's race.
	 * @param target (MiddleEarthCharacter)
	 * 		The argument is the character to be attacked.
	 * */
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		
		double health = target.getHealth();
		
		// Elves attack Orcs w/ x1.5 power
		if(target.getClass().getSimpleName().equals("Orc"))
		{
			health -= 1.5 * getPower();
			target.setHealth(health);
			return true;
		}
		
		// Elves attack Dwarfs and fellow elves w/ no power
		if(target.getClass().getSimpleName().equals("Dwarf") ||
				target.getClass().getSimpleName().equals("Elf"))
		{
			health -= 0;
			return true;
		}
		
		// Elves attack Wizards and Humans w/ normal power
		if(target.getClass().getSimpleName().equals("Wizard") ||
				target.getClass().getSimpleName().equals("Human"))
		{
			health -= getPower();
			target.setHealth(health);
			return true;
		}
			
		return false;
	}

	/**
	 * Returns the race of the MiddleEarthCharacter, which is the simple name of
	 * the MiddleEarthCharacter. This is for the Elf.
	 */
	@Override
	public String getRace() {
		return this.getClass().getSimpleName();
	}

}
