package middleearth.app;

import middleearth.app.characters.Elf;
import middleearth.app.characters.Human;

public class MiddleEarthApp {

	public static void main(String[] args) {
		
		Elf elf = new Elf("Gabi", 10.0, 0.5);
		elf.displayInfo();
		
		Human human = new Human("Jessica", 9.0, 1.0);
		human.displayInfo();
		
		human.attack(elf);
		
		elf.displayInfo();

	}

}
