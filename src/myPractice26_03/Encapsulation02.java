package myPractice26_03;

public class Encapsulation02 {

	public static void main(String[] args) {
		
		Encapsulation01 obje = new Encapsulation01();
		System.out.println(obje.getAddress());
		System.out.println(obje.getAge());
		System.out.println(obje.getName());

		obje.setRetired(true);
		System.out.println(obje.isRetired());
		obje.setAge(25);
		System.out.println(obje.getAge());
		obje.setName("Ahmed Shadi");
		System.out.println(obje.getName());
	}

}
