package middleearth.app;

import middleearth.app.characters.Elf;
import middleearth.app.characters.Wizard;
import middleearth.app.council.MiddleEarthCouncil;
import middleearth.app.characters.Human;
import middleearth.app.characters.Orc;

public class MiddleEarthApp {

	public static void main(String[] args) {
		
//		Elf elf = new Elf("Gabi", 10.0, 0.5);
//		elf.displayInfo();
//		
//		Human human = new Human("Jessica", 9.0, 1.0);
//		human.displayInfo();
//		
//		MiddleEarthCouncil.getInstance().getCharacterManager().addCharacter(human);
//		MiddleEarthCouncil.getInstance().getCharacterManager().updateCharacter(human, null, 9, 1);
//		
//		human.displayInfo();
//		
//		//tests for delete character and displayAllCharacters in middleEarthCouncil
//		MiddleEarthCouncil.getInstance().getCharacterManager().addCharacter(elf);
//		MiddleEarthCouncil.getInstance().getCharacterManager().displayAllCharacters();
//		MiddleEarthCouncil.getInstance().getCharacterManager().deleteCharacter(elf);
//		MiddleEarthCouncil.getInstance().getCharacterManager().displayAllCharacters();
		
		Menu menu = new Menu();
		menu.displayMenu();
		
//		human.attack(elf);
//		
//		elf.displayInfo();
//		
//		Wizard wizard = new Wizard("Kenzie", 4.0,7.0);
//		wizard.displayInfo();
//		System.out.println("Kenzie's race is a: " + wizard.getRace());
//		System.out.println("Gabi's race is a: " + elf.getRace());
//		System.out.println("Jessica's race is a: " + human.getRace());


	}

}
