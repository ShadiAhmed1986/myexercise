package myPractice17_05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ReviewLambdaWithObjects {

	public static void main(String[] args) {
		
		ReviewCourse courseTurkishDay= new ReviewCourse("Summer", "Turkish Day", 97, 128);
		ReviewCourse courseTurkishNight= new ReviewCourse("Winter", "Turkish Night", 98, 154);
		ReviewCourse courseEnglishDay = new ReviewCourse("Spring", "English Day", 95, 132);
		ReviewCourse courseEnglishNight = new ReviewCourse("Winter", "English Night", 93, 144);
		
		List<ReviewCourse>list = new ArrayList<>();
		list.add(courseTurkishDay);
		list.add(courseTurkishNight);
		list.add(courseEnglishDay);
		list.add(courseEnglishNight);
		
		System.out.println(list);
		
		System.out.println(checkIfAllAvg(list));
		System.out.println(checkIfContainsDay(list));
		System.out.println(CheckIfAnyNumber(list));
		System.out.println(checkIfNonehundred(list));
		sortElements(list);
		System.out.println();
		sortElementsreversedOrder(list);
		System.out.println();
		sortByNameReversed(list);
		

	}
	
	//Check if all average scores are less than 98
	public static boolean checkIfAllAvg(List<ReviewCourse>list) {
		return list.stream().allMatch(t->t.getAverageScore()>98);
	}
	
	//Check if all course names contain “Day” word
	public static boolean checkIfContainsDay(List<ReviewCourse>list) {
		return list.stream().allMatch(t->t.getCourseName().contains("Day"));
	}
	
	//Check if any number of students is 154
	public static boolean CheckIfAnyNumber(List<ReviewCourse>list) {
		return list.stream().anyMatch(t->t.getNumberOfStudents()== 154);
	}
	
	//Check if no number of students is 100
	public static boolean checkIfNonehundred(List<ReviewCourse>list) {
		return list.stream().noneMatch(t->t.getNumberOfStudents()==100);
	}
	
	//Sort the elements in natural order according to the average score
	public static void sortElements(List<ReviewCourse>list){
		list.stream()
		.sorted(Comparator.comparing(ReviewCourse::getAverageScore))
		.forEach(t->System.out.print(t + " "));
	}
	
	//Sort the elements in reverse order according to the number of students
	public static void sortElementsreversedOrder(List<ReviewCourse>list) {
		list.stream()
		.sorted(Comparator.comparing(ReviewCourse::getNumberOfStudents)
				.reversed()).forEach(t->System.out.print(t + " "));
	}
	
	//Sort the elements in reverse order according to the course name
	public static void sortByNameReversed(List<ReviewCourse>list) {
		list.stream()
		.sorted(Comparator.comparing(ReviewCourse::getCourseName)
				.reversed())
		.forEach(t->System.out.print(t + " "));
	}

}
