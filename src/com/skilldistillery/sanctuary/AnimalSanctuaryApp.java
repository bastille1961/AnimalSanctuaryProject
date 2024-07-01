package com.skilldistillery.sanctuary;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AnimalSanctuaryApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Sanctuary sanctuary = new Sanctuary();

		System.out.println("Welcome to the Animal Sanctuary Builder!");
		System.out.println("Please select 5 animals to add to the sanctuary:");

		for (int i = 0; i < 5; i++) {
			boolean validSelection = false;
			while (!validSelection) {
				System.out.println("Select animal " + (i + 1) + ":");
				System.out.println("1. Fox");
				System.out.println("2. Alligator");
				System.out.println("3. Wallaby");
				System.out.println("4. Yak");
				System.out.println("5. Moose");

				int choice = 0;
				try {
					choice = scanner.nextInt();
					scanner.nextLine();

					System.out.print("Enter name for the animal: ");
					String name = scanner.nextLine();

					Animal animal = null;
					switch (choice) {
					case 1:
						animal = new Fox(name, "What does the fox say? Ring-Ding-ding-ding-dingeringeding!!");
						validSelection = true;
						break;
					case 2:
						animal = new Alligator(name, "Hissssssss!!");
						validSelection = true;
						break;
					case 3:
						animal = new Wallaby(name, "Chatter-Cluck");
						validSelection = true;
						break;
					case 4:
						animal = new Yak(name, "Grunt");
						validSelection = true;
						break;
					case 5:
						animal = new Moose(name, "Bellow!");
						validSelection = true;
						break;
					default:
						System.out.println("Invalid choice. Please select a number between 1 and 5.");
						break;
					}

					if (validSelection) {

						System.out.print("Enter enclosure number (1-5) for the animal: ");
						int enclosureNumber = scanner.nextInt();
						scanner.nextLine(); // Consume newline character

						if (sanctuary.isEnclosureAvailable(enclosureNumber)) {
							animal.setEnclosure(enclosureNumber);
							sanctuary.addAnimal(animal);
						} else {
							System.out.println("Enclosure " + enclosureNumber
									+ " is not available. Please select another enclosure.");
							validSelection = false;
						}
					}
				} catch (InputMismatchException e) {
					System.out.println("Invalid input. Please enter a number between 1 and 5.");
					scanner.nextLine();
				}
			}
		}

		System.out.print("Enter the name of the sanctuary attendant: ");
		String attendantName = scanner.nextLine();
		Attendant attendant = new Attendant(attendantName);
		sanctuary.setAttendant(attendant);

		sanctuary.displayInfo();

		boolean validResponse = false;
		while (!validResponse) {
			System.out.println("Do you want the attendant to start feeding the animals? (yes/y/no/n)");
			String startFeeding = scanner.nextLine().trim().toLowerCase();

			if (startFeeding.equals("yes") || startFeeding.equals("y")) {
				attendant.makeRounds(sanctuary.getAnimals());
				validResponse = true;
			} else if (startFeeding.equals("no") || startFeeding.equals("n")) {
				System.out.println("Feeding rounds have been skipped.");
				validResponse = true;
			} else {
				System.out.println("Incorrect response, try again.");
			}
		}

		scanner.close();
	}
}
