package com.skilldistillery.sanctuary;

public abstract class Animal {
	private String name;
	private int enclosure;

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEnclosure() {
		return enclosure;
	}

	public void setEnclosure(int enclosure) {
		this.enclosure = enclosure;
	}

	public abstract void eat(int amountOfFood);

	public void makeNoise() {

	}
}