package com.skilldistillery.sanctuary;

public class Moose extends Animal {
	private String noise;

	public Moose(String name, String noise) {
		super(name);
		this.noise = noise;
	}

	@Override
	public void makeNoise() {
		System.out.println(noise);
	}

	@Override
	public void eat(int amountOfFood) {
		System.out.println(
				noise + ", I love eating these " + amountOfFood + " deciduous shrubs and submerged aquatic plants.");
	}
}