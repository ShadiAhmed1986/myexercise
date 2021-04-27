package myPractice19_03;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAGivvenArray {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
			System.out.println("please enter array length");
			int num=scan.nextInt();
			System.out.println("please enter array elemets");
			
		
			int arr[]=new int[num];
			
			
			
			for(int i=0; i<num; i++) {
			
				arr[i]=scan.nextInt();
				
			}
			System.out.println(Arrays.toString(arr));
			
			
			int arr2[]=new int[num];
			
			for(int i=0; i<arr.length;i++) {
				
				 arr2[i]=arr[arr.length-i-1];
				
			}System.out.println(Arrays.toString(arr2));
			
			scan.close();
		}

}
