package myPractice28_03;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ReviewIterator04 {
	
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

        ListIterator<Integer> it5 = list5.listIterator();
        
        while(it5.hasNext()) {
        	Integer el = it5.next();
        	if(it5.nextIndex() > 3) {
        		continue;
        	}
        	it5.set(el = el *2);
        }
        System.out.println(list5);
        
        while(it5.hasPrevious()) {
        	Integer el = it5.previous();
        	System.out.print(el + " ");
        }
	}

}
