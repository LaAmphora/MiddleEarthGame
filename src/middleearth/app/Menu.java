package middleearth.app;

import java.util.Scanner;

import middleearth.app.characters.Dwarf;
import middleearth.app.characters.Elf;
import middleearth.app.characters.Human;
import middleearth.app.characters.Orc;
import middleearth.app.characters.Wizard;
import middleearth.app.council.MiddleEarthCouncil;

public class Menu {
	
	private Scanner scanner = new Scanner(System.in);
	
	public void displayMenu() {
		while (true) {
			
			System.out.println("\n*************************\nThe Middle Earth Madness\n*************************");
			System.out.println("1. Add a new character\n2. View all characters\n"
					+ "3. Update a character\n4. Delete a character\n5. Execute all characters"
					+ "\n6. Exit");
			System.out.print("Enter your choice (1-6): ");
			
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
				case 1:
					System.out.print("Enter a character name: ");
					String name = scanner.nextLine();
					System.out.print("Enter the character's race: ");
					String race = scanner.nextLine().trim().toLowerCase();
					System.out.print("Enter power: ");
					Double power = scanner.nextDouble();
					System.out.print("Enter health: ");
					Double health = scanner.nextDouble();
					
					switch(race) {
					
						case "elf":
							MiddleEarthCouncil.getInstance().getCharacterManager().addCharacter(new Elf(name, health, power));
							break;
						case "dwarf":
							MiddleEarthCouncil.getInstance().getCharacterManager().addCharacter(new Dwarf(name, health, power));
							break;
						case "human":
							MiddleEarthCouncil.getInstance().getCharacterManager().addCharacter(new Human(name, health, power));
							break;
						case "orc":
							MiddleEarthCouncil.getInstance().getCharacterManager().addCharacter(new Orc(name, health, power));
							break;
						case "wizard":
							MiddleEarthCouncil.getInstance().getCharacterManager().addCharacter(new Wizard(name, health, power));
							break;
						default:
							System.out.println("Invalid race! Choose an elf, dwarf, human, orc, or wizard.");
					
					}				

			}
			
		}
	}

}
