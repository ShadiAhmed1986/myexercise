package myPractice28_03;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator01 {
	
	/*
	   What is the output ?
	 */

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);

		ListIterator<Integer> it = list.listIterator();

		int idx = 0;

		while(it.hasNext()) {	

			Integer el = it.next();
			if(idx>2) {
				break;
			}
			it.set(el = el*2);
			System.out.print(el + " ");
			idx++;
		}
	}
}
