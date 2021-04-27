package myPractice14_04;

import java.util.HashMap;
import java.util.Scanner;

public class HashMaps {

	public static void main(String[] args) {
		
		HashMap<String, String> hm1 = new HashMap<>();
		hm1.put("Kitap1", "Milk");
		hm1.put("Kitap2", "Cheese");
		hm1.put("Kitap3", "Meat");
		hm1.put("Kitap4", "Water");
		hm1.put("Kitap5", "Honey");
		
		System.out.println("Please enter a word !");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		if(hm1.keySet().contains(str) || hm1.values().contains(str)) {
			System.out.println(hm1.get(str));;
		}
	}

}
