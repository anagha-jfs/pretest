package zoo.oops;

public class Guide {
public static void main(String[] args) {
		//creatingInstances();
		//addinganotherInstance();
		//usingArrays();
	//usingAbstractClass();
	
	}

private static void usingAbstractClass() {
	wildAnimals W1 = new Tiger();
	W1.caption();
	System.out.println("************");
	System.out.println("Tiger");
	W1.eat();
	W1.hunt();
	W1.liveplace();
	System.out.println("************");
	wildAnimals W2 = new Deer();
	System.out.println("Deer");
	W2.eat();
	W2.hunt();
	W2.liveplace();
	System.out.println("************");
	wildAnimals W3 = new Bear();
	System.out.println("Bear");
	W3.eat();
	W3.hunt();
	W3.liveplace();
}

private static void usingArrays() {
	// Arrays are static collections.
			System.out.println("**********");
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
			// enhanced for loop
			for (Animals animal2 : animals) {
				System.out.println(animal2);
			}
}

private static void addinganotherInstance() {
	// adding another object
			System.out.println("**********");
			Animals animal1 = new Animals("Lion", 4, 6.5f, false, 97.34, 'W');
			// animal1.displayDetails();
			System.out.println(animal1);
}

private static void creatingInstances() {
	// creating objects
	Animals animal;
	// initialising
	animal = new Animals();
	// animal.acceptDetails();
	animal.displayDetails();
}
}