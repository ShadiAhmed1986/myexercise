package myPractice13_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class BookSearch {

	public static void main(String[] args) {
	

		HashMap<String, String> hm = new HashMap<>();
		hm.put("Miguel de Cervantes","Don Quixote/El gallardo español/La casa de los celos");
		hm.put("Marcel Proust","Search of Lost Time"); 
		
		System.out.println("Enter a book name !");
		Scanner scan = new Scanner(System.in);
		String usersearch = scan.nextLine();
		
		System.out.println(bookName(hm,usersearch));
	}

	
	public static List<String> bookName(HashMap<String, String> hm,String usersearch){
		
		List<String> book = new ArrayList<>();
		
		for (int i = 0; i < hm.size(); i++) {
			if(hm.containsKey(usersearch)) {
				String bookNames = hm.get(usersearch);
				String splittedname[] = bookNames.split("/");
				for (String w : splittedname) {
					book.add(w);
				}
			}
		}
		return book;

	}
}
