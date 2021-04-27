package myPractice05_04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class LambdaWithFiles {

	public static void main(String[] args) {
		//How to read a file by using functional programming
		try {
			Files.lines(Paths.get("/Users/shadiahmed/eclipse-workspace/myexercise/src/myPractice05_04/lambdaFile.txt"))
				.forEach(t->System.out.println(t));
		} catch (IOException e) {
			System.out.println("File no Found");
		}

		System.out.println("================================================");
		//Convert all characters to upper case then read it
		try {
			Files.lines(Paths.get("/Users/shadiahmed/eclipse-workspace/myexercise/src/myPractice05_04/lambdaFile.txt"))
				.map(String::toUpperCase).forEach(t->System.out.println(t));
		} catch (IOException e) {
			System.out.println("File no Found");
		}
		
		System.out.println("================================================");
		//Check if the file has the word "Lambda"
		try {
			boolean result = Files.lines(Paths.get("/Users/shadiahmed/eclipse-workspace/myexercise/src/myPractice05_04/lambdaFile.txt"))
				.anyMatch(t->t.contains("Lambda"));
			System.out.println(result);
		} catch (IOException e) {
			System.out.println("File no Found");
		}
		
		System.out.println("================================================");
		//Check if the file has the word "NUMBER" ignore cases
		boolean result2;
		try {
			result2 = Files.lines(Paths.get("/Users/shadiahmed/eclipse-workspace/myexercise/src/myPractice05_04/lambdaFile.txt"))
					.map(t->t.toUpperCase()).anyMatch(t->t.contains("NUMBER"));
			System.out.println(result2);
		} catch (IOException e) {
			System.out.println("File no Found");
		}
		
		System.out.println("================================================");
		//Print all distinct words in the text on the console
		try {
			Files.lines(Paths.get("/Users/shadiahmed/eclipse-workspace/myexercise/src/myPractice05_04/lambdaFile.txt"))
				.map(t->t.split(" "))
					.flatMap(Arrays::stream)
						.map(t->t.replaceAll("\\W","")).distinct().forEach(System.out::println);
		} catch (IOException e) {
			System.out.println("File no Found");
		}
		
		
	}

}
