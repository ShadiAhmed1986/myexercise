package myPractice14_04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MapFileReader {

	public static void main(String[] args) {

	String csvPath = "/Users/shadiahmed/eclipse-workspace/myexercise/src/myPractice_14_04/filetoread.csv";	
	Map<String, String> dataBase = getDataBase(csvPath);
	System.out.println(dataBase);
	
	}

	public static Map<String, String> getDataBase(String csvPath) {
		
		Map<String, String> dataBase = new HashMap<>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(csvPath));
			String lines = br.readLine();
			String keyValueArr[] = lines.split(",");
			while(lines != null) {
				dataBase.put(keyValueArr[0], keyValueArr[1]);
				lines = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return dataBase;
	}

}
