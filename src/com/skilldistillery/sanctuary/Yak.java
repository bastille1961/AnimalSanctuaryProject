package com.skilldistillery.sanctuary;

public class Yak extends Animal {
	private String noise;

	public Yak(String name, String noise) {
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
				+ " grasses, herbs, wild flowers, mosses, tubers, and lichens.");
	}
}
