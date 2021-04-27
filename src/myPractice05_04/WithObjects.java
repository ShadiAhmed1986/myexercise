package myPractice05_04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class WithObjects {

	public static void main(String[] args) {
		//Create 4 objects by using Course class
		Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
		Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
		Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
		Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);
						
		//Add them into a list
		List<Course> list = new ArrayList<>();
		list.add(courseTurkishDay);
		list.add(courseTurkishNight);
		list.add(courseEnglishDay);
		list.add(courseEnglishNight);

		
		System.out.println(checkAvgScores(list));
		System.out.println(checkNameContainingDay(list));
		System.out.println(checkAnyStudentNumber(list));
		System.out.println(checkNonStudentnumber(list));
		sortByAvgScore(list);
		System.out.println("==========");
		sortReversedByNumOfStudents(list);
		System.out.println("==========");
		sortReversedByCourseName(list);
	}
	
	//Check if all average scores are less than 98
	public static boolean checkAvgScores(List<Course> list) {
		return list.stream().allMatch(t->t.getAverageScore() < 98);	
	}
	
	//Check if all course names contain “Day” word
	public static boolean checkNameContainingDay(List<Course> list) {
		return list.stream().allMatch(t->t.getCourseName().contains("Day"));
	}
	
	//Check if any number of students is 154
	public static boolean checkAnyStudentNumber(List<Course> list) {
		return list.stream().anyMatch(t->t.getNumberOfStudents()==154);
	}
	
	//Check if no number of students is 100
	public static boolean checkNonStudentnumber(List<Course> list) {
		return list.stream().noneMatch(t->t.getNumberOfStudents()==100);
	}
	
	//Sort the elements in natural order according to the average score
	public static void sortByAvgScore(List<Course> list) {
		list.stream()
			.sorted(Comparator.comparing(Course::getAverageScore))
				.forEach(System.out::println);
	}
	
	//Sort the elements in reverse order according to the number of students
	public static void sortReversedByNumOfStudents(List<Course> list) {
		list.stream()
			.sorted(Comparator.comparing(Course::getNumberOfStudents).reversed())
				.forEach(System.out::println);
	}
	
	//Sort the elements in reverse order according to the course name
	public static void sortReversedByCourseName(List<Course> list) {
		list.stream()
			.sorted(Comparator.comparing(Course::getCourseName).reversed())
				.forEach(System.out::println);
	}
	
	
	
}
