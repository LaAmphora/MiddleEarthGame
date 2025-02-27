package middleearth.app.council;

import middleearth.app.manager.CharacterManager;

public class MiddleEarthCouncil {

	private static MiddleEarthCouncil instance;
	private CharacterManager manager = new CharacterManager();
	
	// constructor that prevents the class
	// from being invoked outside
	private MiddleEarthCouncil () {
		
	}
	
	/**
	 * Creates the only instance of MiddleEarthCharacter
	 * according to the Singleton Design pattern.
	 * */
	public static MiddleEarthCouncil getInstance() {
		if(instance == null) {
			instance = new MiddleEarthCouncil ();
		}
		return instance;
	}
	
	/**
	 * Retrieves the manager so that the user can apply
	 * different operations to the characters array.
	 * */
	public CharacterManager getCharacterManager() {
		return manager;
	}
	
}
