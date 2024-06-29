package com.skilldistillery.sanctuary;

public class Animal {
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void makeNoise() {
		System.out.println("Animal making noise ...");
	}
	
	public void eat(int amountOfFood) {
		System.out.println("I'm eating " + amountOfFood + " foods.");
	}
	
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.makeNoise();
		animal.eat(9);	
	}

}
