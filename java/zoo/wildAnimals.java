package zoo.oops;
// using abstract class and methods
public abstract class wildAnimals {
public abstract void eat();
public abstract void hunt();
public abstract void liveplace();
public void caption() {
 System.out.println("Wild animals are animals that lives on its own and isn't tamed.");
}
}

class Tiger extends wildAnimals {
	
	@Override
	public void eat() {
		System.out.println("Carnivores");
	}	
	
	@Override
	public void hunt() {
		System.out.println("Chase and hunt");
	}
	
	@Override
	public void liveplace() {
		System.out.println("Den");
	}
}

class Deer extends wildAnimals {
	
	@Override
	public void eat() {
		System.out.println("Herbivores");
	}	
	
	@Override
	public void hunt() {
		System.out.println("Graze");
	}
	
	@Override
	public void liveplace() {
		System.out.println("Fields");
	}
}

class Bear extends wildAnimals {
	
	@Override
	public void eat() {
		System.out.println("Omnivores");
	}	
	
	@Override
	public void hunt() {
		System.out.println("Pluck from trees or hunt");
	}
	
	@Override
	public void liveplace() {
		System.out.println("Cave");
	}
}
