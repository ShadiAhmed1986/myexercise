package myPractice02;

public class Q_07 {

	/* There is a lonely monkey in the island
     * He needs to eat 4 bananas every day
     * There are just 165 bananas in that island
     * 
     * Create following variables and find how many day monkey can survive.
     * Use do while loop, increment and decrement and if statements
     * 
       int numbersOfBananas = 165;
       
       int survivalDays = 0;
       
       boolean monkeyAlive = true;
     */
	
	public static void main(String[] args) {
		
		int numbersOfBananas = 165;
	       
	    int survivalDays = 0;
	       
	    boolean monkeyAlive = true;
	
	    do {
	    	//Decrementing 4 bananas every day
	    	numbersOfBananas -= 4;
	    	//if the bananas after decrementing are more than or equal to 4 ==> monkey alive
	    	if(numbersOfBananas >= 4) {
	    		monkeyAlive = true;
	    	}else {
	    		monkeyAlive = false;
	    	}
	    	survivalDays++;//incrementing the survived days
		} while (monkeyAlive);//monkey eats bananas until he is alive
	    
	    System.out.println("The monkey survives " +survivalDays+ " days ! "
	    		+ "\nNumber of bananas left after surviving " +survivalDays+ " days : " + numbersOfBananas);
	}
}
