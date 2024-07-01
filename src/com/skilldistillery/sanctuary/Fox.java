package com.skilldistillery.sanctuary;

public class Fox extends Animal {
	private String noise;

	public Fox(String name, String noise) {
		super(name);
		this.noise = noise;
	}

	@Override
	public void makeNoise() {
		System.out.println(noise);
	}

	@Override
	public void eat(int amountOfFood) {
		System.out.println(noise + ", I love eating these " + amountOfFood
				+ " Plants, rodents, rabbits, small mammals, birds, insects, lizards, frogs, fish, and berries.");
	}
}
