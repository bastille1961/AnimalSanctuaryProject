package com.skilldistillery.sanctuary;

public class Alligator extends Animal {
	private String noise;

	public Alligator(String name, String noise) {
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
				+ " Golfers, joggers, swimmers, people cooling their feet in the canal and an occasional wild creature.");
	}
}