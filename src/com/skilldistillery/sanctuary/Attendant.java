package com.skilldistillery.sanctuary;

import java.util.Random;

public class Attendant {
	private String name;

	public Attendant(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void makeRounds(Animal[] animals) {
		Random random = new Random();
		int rounds = random.nextInt(3) + 1;

		System.out.println("Dum de dum, I love taking care of my Animal friends...");

		for (int round = 1; round <= rounds; round++) {
			System.out.println("Starting round " + round + " of feeding:");

			for (Animal animal : animals) {
				if (animal != null) {
					int foodAmount = random.nextInt(20) + 1; // Random amount of food between 1 and 20
					System.out.println("I will feed " + animal.getName() + " " + foodAmount + " foods");
					animal.makeNoise();
					animal.eat(foodAmount);
				} else {
					System.out.println("This enclosure is empty, on to the next one.");
				}
			}
		}

		System.out.println("Everyone's fed now, I can take a break.");
	}
}