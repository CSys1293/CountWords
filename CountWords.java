import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		//authors: Claudia, Priya, Clara, Robert
		//Use new method to obtain count
        
        //take sentence and pulg into new method
        
        //Use a formula/method to separate the sentence into individual words
        
        //build a counter to convert the strings to an int

		Scanner scan = new Scanner (System.in);
		
		System.out.print("Please enter a sentence: ");
		String sentence = scan.nextLine();
		
		int numWords = count(sentence);
		System.out.println("There are " + numWords + " words in the sentence.");
		
		scan.close();
	}

 
public static int count(String str){
		
		
	//	if (s == null || s.isEmpty()) {
		
		int count = 0;
		for(int i = 0; i< str.length(); i++) {
			if (str.charAt(i) != ' ' ){
				count++;
				while(str.charAt(i) != ' ' && i < str.length()-1){
					i++;
				}
			}
				
			
			
			
		}
		
		return count;	

	}

}
