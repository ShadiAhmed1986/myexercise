package myPractice01_04;

public class HighestScoreKubraHoca2 {
	
    public static void main(String[] args) {
    	
        /*
           Given a string of words, you need to find the highest scoring word.
    Each letter of a word scores points according to its position in the alphabet: 
    For example : a = 1, b = 2, c = 3 etc.
    You need to return the highest scoring word as a string.
    If two words score the same, return the word that appears earliest in the original string.
    All letters will be lowercase and all inputs will be valid.
         */
    	
    System.out.println(highScore("ali eve gel"));
        
    }
    public static String highScore(String s) {
    	
        String[] words = s.split(" ");
        
        int max = 0;
        String str = "";
        
        for (String w : words) {
        	
            char[] temporary = w.toCharArray();
            int sum = 0;
            for (int i = 0; i < temporary.length; i++) {
                sum = sum + temporary[i];
            }
           
            if (sum > max) {
            	max=sum;
                str = w;                
            }
            
        }
        return str;
    }
}

