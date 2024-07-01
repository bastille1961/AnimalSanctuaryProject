package com.skilldistillery.sanctuary;

public class Yak extends Animal {

	private static String noise;

	public Yak(String name, String noise) {
		super(name);
		this.setNoise(noise);
	}

	public void makeNoise() {
		System.out.println(getNoise());

	}

	public void eat(int amountOfFood) {
		System.out.println(getNoise() + ", I love eating these " + amountOfFood
				+ "grasses, herbs, wild flowers, mosses, tubers, and lichens.");
	}

	public static String getNoise() {
		return noise;
	}

	public static void setNoise(String noise) {
		Yak.noise = noise;
	}
}
