package com.zoo.oops;

public class Animals {
	// abstract datatype
	String animalName;

	// primitive datatype
	int noOfAnimals;
	float openDuration;
	boolean caged;
	double totalRatio;
	char typeOfAnimal;

	// default constructor
	public Animals() {
		animalName = "Tiger";
		noOfAnimals = 3;
		openDuration = 7.5f;
		caged = false;
		totalRatio = 82.15;
		typeOfAnimal = 'W';
	}

	// parameterized or overload constructor
	public Animals(String panimalName, int pnoOfAnimals, float popenDuration, boolean pcaged, double ptotalRatio, char ptypeOfAnimal) {
			animalName = panimalName;
			noOfAnimals = pnoOfAnimals;
			openDuration = popenDuration;
			caged = pcaged;
			totalRatio = ptotalRatio;
			typeOfAnimal = ptypeOfAnimal;
	}
	
	// parameterized or overload constructor
		public Animals(String panimalName, int pnoOfAnimals) {
				animalName = panimalName;
				noOfAnimals = pnoOfAnimals;
		}

	public void acceptDetails() {
		animalName = "Tiger";
		noOfAnimals = 3;
		openDuration = 7.5f;
		caged = false;
		totalRatio = 82.15;
		typeOfAnimal = 'W';
	}

	public void displayDetails() {
		System.out.println(animalName);
		System.out.println(noOfAnimals);
		System.out.println(openDuration);
		System.out.println(caged);
		System.out.println(totalRatio);
		System.out.println(typeOfAnimal);
	}

	@Override
	public String toString() {
		return "Animals [animalName=" + animalName + ", noOfAnimals=" + noOfAnimals + "]";
	}
	}
