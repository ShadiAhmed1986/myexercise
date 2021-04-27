package myPractice26_03_Second;

public class Dog extends Mammal{
	
	public boolean smellWell;
	
	public int height = 25;

	public Dog() {
		super();// if you type super() it's fine. 
		        // If you don't type Java puts it automatically
		
		System.out.println("Dog constructor without parameter...");
	}
	
	public Dog(boolean smellWell) {
		super(true);
		//If you don't type any parent constructor call inside the first line
		//Java uses the parent constructor without parameter automatically
		
		/*
		   super() is for "parent constructor call"
		   super. is for "parent variables call"
		 */
		
//		super.haveBaby = true;
//		super.height = 11;
//		super.weight = 22;
		
		//super.height; ==>> returns the height value from parent classes (Animal)
		//this.height; ==>> returns the height value from the class itself (Dog)
		
		//If you have multiple variables whose names are same in different parent classes
		//super keywords selects the closest one
		
		this.smellWell = smellWell;
	}
}
