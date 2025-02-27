package middleearth.app.manager;

import middleearth.app.characters.MiddleEarthCharacter;

public class CharacterManager {

	private MiddleEarthCharacter[] characters;
	private int size;
	
	
	public CharacterManager() {
		super();
		this.characters = new MiddleEarthCharacter[3];
		this.size = 0;
	}
	

	/**
	 * Adds a character to the characters array.
	 * @param c (MiddleEarthCharacter)
	 * 		The argument in the character to be added to the array;
	 * */
	public boolean addCharacter(MiddleEarthCharacter c) {
		// if the # of characters is less than the length
		// of the character array then add character
		if(size < characters.length) {
			characters[size] = c;
			size++;
			System.out.println(c.getName() + " added.");
			return true;
		}
		else {
			// if adding a new character exceeds the space of the current
			// characters array, double the space of the array and
			// then add the new character
			MiddleEarthCharacter[] copy = new MiddleEarthCharacter[characters.length*2];
			System.arraycopy(characters, 0, copy, 0, size);
			characters = copy;
			System.out.println(c.getName() + " added.");
			return true;
		}
	}
	
}
