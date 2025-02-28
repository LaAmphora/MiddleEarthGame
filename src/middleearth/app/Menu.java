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
	
	/**
	 * This is a method used to display the Main Menu 
	 * of the Middle Earth Game. All choices are displayed in
	 * the console, obtaining user input.
	 */
	public void displayMenu() {
		while (true) {
			
			//menu options displayed in console
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
					System.out.print("Enter a character name: "); //getting user input for adding a character
					String name = scanner.nextLine();
					System.out.print("Enter the character's race: ");
					String race = scanner.nextLine().trim().toLowerCase();
					System.out.print("Enter power: ");
					Double power = scanner.nextDouble();
					System.out.print("Enter health: ");
					Double health = scanner.nextDouble();
					
					switch(race) { //from user input, create subclass of specified character
					
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
					MiddleEarthCouncil.getInstance().getCharacterManager().displayAllCharacters(); //using display all characters from character manager
					break;
				
				//update a character
				case 3:
					System.out.print("Enter the character's name you want to update: "); //getting user input for character to update
					String oldName = scanner.nextLine().trim();
					
					MiddleEarthCharacter character = MiddleEarthCouncil.getInstance().getCharacterManager().getCharacter(oldName); //finding character based on name given
					if (character == null) {
						System.out.println("Character was not found.");
						break;
					}
					
					System.out.println("Updating " + character.getName() + "...");
					
					System.out.println("Enter new name: "); //new name to be set for character
					String newName = scanner.nextLine().trim();
					
					int newHealth = (int)(double)(character.getHealth()); //need to cast because parameter is int of updateCharacter
					while(true)
					{
						System.out.println("Enter new health: "); //new health to be set for character
						try {
							newHealth = scanner.nextInt();
							break;
						} catch (Exception e) { //if input is not an int then catch it and print error message
							System.out.println("Health value must be integer. Try again. ");
							scanner.next();
						}
					}
					
					
					int newPower = (int)(double)(character.getPower()); //need to cast because parameter is int of updateCharacter
					while(true)
					{
						System.out.println("Enter new power: "); //new power to be set for character
						try {
							newPower = scanner.nextInt();
							break;
						} catch (Exception e) { //if input is not an int then catch it and print error message
							System.out.println("Power value must be integer. Try again.");
							scanner.next();
						}
					}
					
					boolean isUpdated = MiddleEarthCouncil.getInstance().getCharacterManager().updateCharacter(character, newName, newHealth, newPower);
					
					if (isUpdated) { //if character was updated, success!
						System.out.println("Update was successful.");
					}
					break;
				
				//delete a character
				case 4:
					System.out.print("Enter the name of the character you want to delete: "); //name of character to be deleted from character array
					String delName = scanner.nextLine().trim();
					
					MiddleEarthCharacter delCharacter = MiddleEarthCouncil.getInstance().getCharacterManager().getCharacter(delName); //getting the character from name given
					
					if(delCharacter == null) //if character was not found, exit case
					{
						break;
					}
					
					MiddleEarthCouncil.getInstance().getCharacterManager().deleteCharacter(delCharacter); //character was found, deletion successful
					break;
					
				//execute all characters attacks
				case 5:
					System.out.println("Enter the name of the character that is attacking: "); //name of character that is attacking
					String attackingName = scanner.nextLine().trim();
					MiddleEarthCharacter attackingChar = MiddleEarthCouncil.getInstance().getCharacterManager().getCharacter(attackingName); //obtaining the character using name given
					
					if(attackingChar == null) //if character not found, break
					{
						break;
					}
					
					System.out.println("Enter the name of the target character: "); //obtaining name of character to be targeted
					String attackedName = scanner.nextLine().trim();
					MiddleEarthCharacter targetChar = MiddleEarthCouncil.getInstance().getCharacterManager().getCharacter(attackedName);
					
					if(targetChar == null) //if character not found, break
					{
						break;
					}
					
					boolean attackStatus = attackingChar.attack(targetChar);
					if (attackStatus) { //if attack was successful, print, else, print failed
						System.out.println(attackingName + " attacked " + attackedName + " successfully!");
					} else {
						System.out.println("Attack failed.");
					}
					break;
					
				//exit program
				case 6:
					System.out.println("Exiting... Goodbye!");
					scanner.close();
					return;
					
				//default case for error checking
				default:
					System.out.println("Invalid input. Please try again."); //for invalid inputs, (inputs that are not 1-6)

			}
			
		}
	}

}
