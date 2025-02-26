
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
		
		// Elves attack Orcs w/ x1.5 power
		if(target.getClass().getSimpleName().equals("Orc"))
		{
			target.health -= 1.5 * power;
			return true;
		}
		
		// Elves attack Dwarfs and fellow elves w/ no power
		if(target.getClass().getSimpleName().equals("Dwarf") ||
				target.getClass().getSimpleName().equals("Elf"))
		{
			target.health -= 0;
			return true;
		}
		
		// Elves attack Wizards and Humans w/ normal power
		if(target.getClass().getSimpleName().equals("Wizard") ||
				target.getClass().getSimpleName().equals("Human"))
		{
			target.health -= power;
			return true;
		}
			
		return false;
	}

	@Override
	String getRace() {
		// TODO Auto-generated method stub
		return null;
	}

}
