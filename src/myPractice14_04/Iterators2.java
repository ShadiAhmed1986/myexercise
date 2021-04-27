package myPractice14_04;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterators2 {
	
	/*
    Create an integer list which has 5 elements
	 Multiply just first 3 elements by 2
	 Print the list elements on the console in reverse order
	 Print the list on the console in reverse order
*/

	public static void main(String[] args) {
		
		List<Integer> list5 = new ArrayList<>();
        list5.add(12);
        list5.add(13);
        list5.add(14);
        list5.add(15);
        list5.add(16);
        System.out.println(list5);
        
        ListIterator<Integer> it1 = list5.listIterator();
        while(it1.hasNext()) {
        	int el = it1.next();
        	if(it1.nextIndex()>3) {
            	continue;
            }
        	it1.set(el = el * 2);
        }
        System.out.println(list5);
        
        while(it1.hasPrevious()) {
        	int el = it1.previous();
        	System.out.print(el + " ");
        }
	}

}
