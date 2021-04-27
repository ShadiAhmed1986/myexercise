package myPractice26_03_Second;

public class Animal {
	
	public int height;
	public int weight;

	public Animal() {
		System.out.println("Animal constructor without parameter ");
	}
	
	public Animal(int a) {
		System.out.println("Animal constructor with int parameter");
	}
	
	public Animal(int height, int weight) {
		this.height = height;
		this.weight = weight;
	}
}
