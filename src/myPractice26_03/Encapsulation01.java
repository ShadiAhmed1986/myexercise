package myPractice26_03;

public class Encapsulation01 {

	public String gender = "Male";
	
	private String name = "Shadi Ahmed";
	private int age = 35;
	private boolean retired = false;
	
	private char initial = 'S';
	private String address = "Milton Keynes";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isRetired() {
		return retired;
	}
	public void setRetired(boolean retired) {
		this.retired = retired;
	}
	public char getInitial() {
		return initial;
	}
	public void setInitial(char initial) {
		this.initial = initial;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
