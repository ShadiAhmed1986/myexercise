package myPractice26_03;

public class Runner {

	public static void main(String[] args) {
		
		/*
		   We can access only own methods and parent's methods by creating an object from own class
		   We can't access sibling's methods
		 */
		
		Bird bird = new Bird();
		bird.drink();//Animal class
		bird.eat();//Animal class
		bird.tweet();//Bird class
		bird.notBreastFeed();//NotMammal class
		
		Dog dog = new Dog();
		dog.drink();//Animal class
		dog.eat();//Animal class
		dog.bark();//dog class
		dog.giveBirth();//Mammal class
		System.out.println(dog.getDogName());
		
		Cat cat = new Cat();
		cat.drink();//Animal class
		cat.eat();//Animal class
		cat.giveBirth();//MAmmal classs
		cat.meow();//Cat class
		
		
	}

}
