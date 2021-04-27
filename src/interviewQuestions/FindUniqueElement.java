package interviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class FindUniqueElement {
	
	/*
	   Create a method to return just non-repeated element or elements
	 	[3, 2, 5, 5, 1, 3, 1] ==> [2]
	 	[3, 2, 5, 5, 7, 3, 1] ==> [2, 7, 1]
	 */

	public static void main(String[] args) {
		int arr[]= {2,7,1,4,4,4,6,6,5,3,6};
		
	    List<Integer>list=new ArrayList<Integer>();
	  
		 
       for(int i=0; i<arr.length; i++) {
	  
	      for(int k=i+1; k<arr.length;k++) {
		  
		      if(arr[i]==arr[k])  {
			       if(!list.contains(arr[i])) {
				   	   list.add(arr[i]);
			      }
		      }
	       }  
       }
       System.out.println(list);//common element printed
       
       List<Integer>list1=new ArrayList<Integer>();
       
       for(int i=0; i<arr.length; i++) {
	     list1.add(arr[i]);
	  
  }
       System.out.println(list1);// array converted to list
       list1.removeAll(list);//we remove all the common elements
       System.out.println(list1);
	}
}
