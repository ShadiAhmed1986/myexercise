package myPractice26_03_Third;

public class Audi extends Car{
	
	public void price() {
		System.out.println("Audi is expensive");
	}

	@Override
	public void numOfTyres() {
		super.numOfTyres();
		System.out.println("Audi has 4 wheels");
	}

	@Override
	public void move() {
		System.out.println("Moves very fast");
		super.move();
	}

	@Override
	public void engine() {
		System.out.println("Powerfull engine");
		super.engine();
	}

	@Override
	public int spend() {
		System.out.println("But spends a lot of fuel");

		return super.spend();
	}
	
	
}
