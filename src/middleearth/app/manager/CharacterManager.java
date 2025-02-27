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
	
	/**
	 * Retrieves a character based on the character's name.
	 * @param name (String)
	 * 		The argument is the name of the character to be retrieved.
	 * */
	public MiddleEarthCharacter getCharacter(String name) {
		
		// search for character name among the characters array
		for(int i = 0; i < size; i++)
		{
			if(characters[i].getName() == name)
			{
				return characters[i];
			}
		}
		
		// if the character not found
		System.out.println(name + " not found.");
		return null;
	}
	
	public boolean updateCharacter(MiddleEarthCharacter character, String name, int health, int power)
	{
		return false;
	}
	
}
