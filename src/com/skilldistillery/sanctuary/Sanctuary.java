package com.skilldistillery.sanctuary;

public class Sanctuary {
	private Animal[] animals;
	private int animalCount;
	private Attendant attendant;
	private boolean[] enclosures;

	public Sanctuary() {
		animals = new Animal[5];
		animalCount = 0;
		enclosures = new boolean[5];
	}

	public void addAnimal(Animal animal) {
		if (animalCount < animals.length) {
			animals[animalCount] = animal;
			enclosures[animal.getEnclosure() - 1] = true;
			animalCount++;
		} else {
			System.out.println("Sanctuary is full. Cannot add more animals.");
		}
	}

	public boolean isEnclosureAvailable(int enclosureNumber) {
		return enclosureNumber >= 1 && enclosureNumber <= 5 && !enclosures[enclosureNumber - 1];
	}

	public Animal[] getAnimals() {
		return animals;
	}

	public void setAnimals(Animal[] animals) {
		this.animals = animals;
	}

	public void setAttendant(Attendant attendant) {
		this.attendant = attendant;
	}

	public void displayInfo() {
		System.out.println("Sanctuary Attendant: " + (attendant != null ? attendant.getName() : "None"));
		System.out.println("Animals in the sanctuary:");
		for (Animal animal : animals) {
			if (animal != null) {
				System.out.println("- " + animal.getName() + " in enclosure " + animal.getEnclosure());
			}
		}
	}
}
