package com.skilldistillery.sanctuary;

public class Moose extends Animal {
	private String noise;

	public Moose(String name, String noise) {
		super(name);
		this.noise = noise;
	}

	public void makeNoise() {
		System.out.println(noise);
	}

	@Override
	public void eat(int amountOfFood) {
		System.out.println(
				noise + ", I love eating these " + amountOfFood + "decidious shrubs and aquatic plants; I can submerged"
						+ "underwater and eat for up to 50 seconds while holding my breath.");
	}
}