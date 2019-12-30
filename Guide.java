package com.zoo.oops;

public class Guide {
public static void main(String[] args) {
	
	//creatinginstances();
	//creatingMoreObjects();
	//usingArray();
}

private static void creatingMoreObjects() {
	//System.out.println("**********");
	Animals animal1 = new Animals("Lion", 4, 6.5f, false, 97.34, 'W');
    //animal1.displayDetails();
	//System.out.println(animal1);
}

private static void usingArray() {
	//Arrays are static collections.
		Animals animals[] = new Animals[2];
		animals[0] = new Animals("bear", 2);
		animals[1] = new Animals("giraffe", 1);
		
//		System.out.println("Basic for loop");
//		//basic for loop
//		for(int i = 0; i<animals.length; i++)
//		{
//			System.out.println(animals[i]);
//		}
		
		System.out.println("Enhanced for loop");
		//enhanced for loop
		for(Animals animal2 : animals) {
			System.out.println(animal2);
		}
}

private static Animals creatinginstances() {
	//creating objects
	Animals animal= null;
	//initialising
	animal = new Animals();
	//animal.acceptDetails();
	animal.displayDetails();
}
}