package middleearth.app.characters;

public class Dwarf extends MiddleEarthCharacter{

	public Dwarf(String name, Double health, Double power) {
		super(name, health, power);
	}

	/**
	 * Performs an attack on a target based on the rules of a dwarf
	 * attack on the target's race.
	 * @param target (MiddleEarthCharacter)
	 * 		The argument is the character to be attacked.
	 * */
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		
		double health = target.getHealth();
		
		// Dwarfs attack Elf w/ x1.5 power
		if(target.getClass().getSimpleName().equals("Elf"))
		{
			health -= 1.5 * getPower();
			target.setHealth(health);
			return true;
		}
		
		// Dwarfs attack Wizards and fellow Dwarfs
		if(target.getClass().getSimpleName().equals("Dwarf") ||
				target.getClass().getSimpleName().equals("Wizard"))
		{
			health -= 0;
			return true;
		}
		
		// Dwarfs attack Orcs and Humans w/ normal power
		if(target.getClass().getSimpleName().equals("Human") ||
				target.getClass().getSimpleName().equals("Orc"))
		{
			health -= getPower();
			target.setHealth(health);
			return true;
		}
			
		return false;
	}

	/**
	 * Returns the race of the MiddleEarthCharacter, which is the simple name of
	 * the MiddleEarthCharacter. This is for the Dwarf.
	 */
	@Override
	public String getRace() {
		return this.getClass().getSimpleName();
	}

}
