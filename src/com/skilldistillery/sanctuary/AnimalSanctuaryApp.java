package com.skilldistillery.sanctuary;

import java.util.Scanner;

public class AnimalSanctuaryApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Sanctuary sanctuary = new Sanctuary();

		System.out.println("Welcome to the Animal Sanctuary Builder!");
		System.out.println("Please select 5 animals to add to the sanctuary:");

		for (int i = 0; i < 5; i++) {
			System.out.println("Select animal " + (i + 1) + ":");
			System.out.println("1. Fox");
			System.out.println("2. Alligator");
			System.out.println("3. Wallaby");
			System.out.println("4. Yak");
			System.out.println("5. Moose");
			int choice = scanner.nextInt();
			scanner.nextLine();

			System.out.print("Enter name for the animal: ");
			String name = scanner.nextLine();

			Animal animal = null;
			switch (choice) {
			case 1:
				animal = new Fox(name, "What does the fox say? Ring-Ding-ding-ding-dingeringeding!!");
				break;
			case 2:
				animal = new Alligator(name, "Hissssssss!!");
				break;
			case 3:
				animal = new Wallaby(name, "Chatter-Cluck");
				break;
			case 4:
				animal = new Yak(name, "Grunt");
				break;
			case 5:
				animal = new Moose(name, "Bellow!");
				break;
			default:
				System.out.println("Invalid choice. Please select again.");
				i--;
				continue;
			}

			System.out.print("Enter enclosure number (1-5) for the animal: ");
			int enclosureNumber = scanner.nextInt();
			scanner.nextLine();

			if (sanctuary.isEnclosureAvailable(enclosureNumber)) {
				animal.setEnclosure(enclosureNumber);
				sanctuary.addAnimal(animal);
			} else {
				System.out.println(
						"Enclosure " + enclosureNumber + " is not available. Please select another enclosure.");
				i--;
			}
		}

		System.out.print("Enter the name of the sanctuary attendant: ");
		String attendantName = scanner.nextLine();
		Attendant attendant = new Attendant(attendantName);
		sanctuary.setAttendant(attendant);

		sanctuary.displayInfo();

		scanner.close();
	}
}
