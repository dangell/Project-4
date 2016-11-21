import java.util.Scanner;

/**

 *

 * Name: Dylan Angell

 * Teacher: Mr.Hardman

 * Assignment #4, Program #2

 * Date Last Modified: 11/14/16

 *

 */
public class Project4b {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		
		double userNum;
		double userNumSquareRoot;
		
		do{
			
			System.out.println("Please enter a number");
			 userNum = userInput.nextDouble();
			 userNumSquareRoot = Math.sqrt(userNum);
			if(userNum < 0){
				
				System.out.println("Please enter a number greater than 0");
				
			}
			
			
		}while(userNum < 0);
		
		
		System.out.println("The square root of " + userNum + " is " + userNumSquareRoot);
		userInput.close();
	}

}
