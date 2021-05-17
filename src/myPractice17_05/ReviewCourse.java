package myPractice17_05;

public class ReviewCourse {
	
	private String season;
    private String courseName;
    private int averageScore;
    private int numberOfStudents;
    
	public ReviewCourse(String season, String courseName, int averageScore, int numberOfStudents) {
		super();
		this.season = season;
		this.courseName = courseName;
		this.averageScore = averageScore;
		this.numberOfStudents = numberOfStudents;
	}
	
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getAverageScore() {
		return averageScore;
	}
	public void setAverageScore(int averageScore) {
		this.averageScore = averageScore;
	}
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}
	
	@Override
	public String toString() {
		return season + " - " + courseName + " - " + averageScore + " - " + numberOfStudents;
	}

}
