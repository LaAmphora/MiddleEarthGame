package middleearth.app;

import java.util.Scanner;

import middleearth.app.characters.Dwarf;
import middleearth.app.characters.Elf;
import middleearth.app.characters.Human;
import middleearth.app.characters.MiddleEarthCharacter;
import middleearth.app.characters.Orc;
import middleearth.app.characters.Wizard;
import middleearth.app.council.MiddleEarthCouncil;

public class Menu {
	
	private Scanner scanner = new Scanner(System.in);
	
	public void displayMenu() {
		while (true) {
			
			System.out.println("\n*************************\nThe Middle Earth Madness\n*************************");
			System.out.println("1. Add a new character\n2. View all characters\n"
					+ "3. Update a character\n4. Delete a character\n5. Execute all characters' attack actions"
					+ "\n6. Exit");
			System.out.print("Enter your choice (1-6): ");
			
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			
				//add a new character
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
					break;
					
				//view all characters
				case 2:
					MiddleEarthCouncil.getInstance().getCharacterManager().displayAllCharacters();
					break;
				
				//update a character
				case 3:
					System.out.print("Enter the character's name you want to update: ");
					String oldName = scanner.nextLine().trim();
					
					MiddleEarthCharacter character = MiddleEarthCouncil.getInstance().getCharacterManager().getCharacter(uName);
					if (character == null) {
						System.out.println("Character was not found.");
					}
					
					System.out.println("Updating " + character.getName() + "...");
					
					System.out.println("Enter new name: ");
					String newName = scanner.nextLine().trim();
					
					System.out.println("Enter new health: ");
					int newHealth = scanner.nextInt();
					
					System.out.println("Enter new power: ");
					int newPower = scanner.nextInt();
					
					boolean isUpdated = MiddleEarthCouncil.getInstance().getCharacterManager().updateCharacter(character, newName, newHealth, newPower);
					
					if (isUpdated) {
						System.out.println("Update was successful.");
					}
					break;
				
				//delete a character
				case 4:
					System.out.print("Enter the name of the character you want to delete: ");
					String delName = scanner.nextLine().trim();
					
					MiddleEarthCharacter delCharacter = MiddleEarthCouncil.getInstance().getCharacterManager().getCharacter(delName);
					boolean wasDeleted = MiddleEarthCouncil.getInstance().getCharacterManager().deleteCharacter(character);
					break;
					
				//execute all characters attacks
				case 5:
					
					
				//exit program
				case 6:
					System.out.println("Exiting... Goodbye!");
					scanner.close();
					return;

			}
			
		}
	}

}
