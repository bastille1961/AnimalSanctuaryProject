package com.skilldistillery.sanctuary;

public class Wallaby extends Animal {
	private String noise;

	public Wallaby(String name, String noise) {
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
				noise + ", I love eating these " + amountOfFood + " grasses, vegetables, leaves, and other foliage.");
	}
}