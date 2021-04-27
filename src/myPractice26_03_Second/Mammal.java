package myPractice26_03_Second;

public class Mammal extends Animal{
	
	public boolean haveBaby;
	public int height;
	
	public  Mammal() {
		super(5);
		/*
		   1) To create an object you can use just a single constructor
		   2) super() keyword must be in the first line inside the constructor
		   3) You can use super() just once in a constructor
		   4) If you make constructor call for a non-existing constructor from parent class,
		      you will get compile time error
		   5) this() ==> Calls the constructors inside the class itself
		      super() ==> Calls the constructors from parent class
		 */
		System.out.println("Mammal constructor without parameter");
	}
	
	public Mammal(boolean haveBaby) {
		super(3, 4);
		this.haveBaby = haveBaby;
	}
}
