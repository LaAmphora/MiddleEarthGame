package middleearth.app.council;

import middleearth.app.manager.CharacterManager;

public class MiddleEarthCouncil {

	private static MiddleEarthCouncil instance;
	private CharacterManager manager = new CharacterManager();
	
	// constructor that prevents the class
	// from being invoked outside
	private MiddleEarthCouncil () {
		
	}
	
	public static MiddleEarthCouncil getInstance() {
		if(instance == null) {
			instance = new MiddleEarthCouncil ();
		}
		return instance;
	}
	
	public CharacterManager getCharacterManager() {
		return manager;
	}
	
}
