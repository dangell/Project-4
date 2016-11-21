import java.util.Scanner;

/**

 *

 * Name: Dylan Angell

 * Teacher: Mr.Hardman

 * Assignment #4, Program #1

 * Date Last Modified: 11/9/16

 *

 */
public class Project4a {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter your weight");
		double userWeight = userInput.nextDouble();
		
		System.out.println("Please enter a celestial body in our solar system");
		String celestialBody = userInput.next();
		
		if(celestialBody.equalsIgnoreCase("Mercury")){
			
			double userSpaceWeight = (userWeight * 0.38);
			
			System.out.println("Your space weight on Mercury is " + userSpaceWeight + " pounds");
			
		}
		if(celestialBody.equalsIgnoreCase("Venus")){
			
			double userSpaceWeight = (userWeight * 0.91);
			
			System.out.println("Your space weight on Venus is " + userSpaceWeight + " pounds");
			
		}
		if(celestialBody.equalsIgnoreCase("Earth")){
			
			double userSpaceWeight = (userWeight * 1);
			
			System.out.println("Your space weight on Earth is " + userSpaceWeight + " pounds");
			
		}
		if(celestialBody.equalsIgnoreCase("Moon")){
			
			double userSpaceWeight = (userWeight * 0.165);
			
			System.out.println("Your space weight on the moon is " + userSpaceWeight + " pounds");
			
		}
		if(celestialBody.equalsIgnoreCase("Mars")){
			
			double userSpaceWeight = (userWeight * 0.38);
			
			System.out.println("Your space weight on Mars is " + userSpaceWeight + " pounds");
			
		}
		if(celestialBody.equalsIgnoreCase("Jupiter")){
			
			double userSpaceWeight = (userWeight * 2.34);
			
			System.out.println("Your space weight on Jupiter is " + userSpaceWeight + " pounds");
			
		}

		if(celestialBody.equalsIgnoreCase("Saturn")){
			
			double userSpaceWeight = (userWeight * 1.06);
			
			System.out.println("Your space weight on Saturn is " + userSpaceWeight + " pounds");
			
		}
		if(celestialBody.equalsIgnoreCase("Uranus")){
			
			double userSpaceWeight = (userWeight * 0.92);
			
			System.out.println("Your space weight on Uranus is " + userSpaceWeight + " pounds");
			
		}
		if(celestialBody.equalsIgnoreCase("Neptune")){
			
			double userSpaceWeight = (userWeight * 0.92);
			
			System.out.println("Your space weight on Neptune is " + userSpaceWeight + " pounds");
			
		}
		if(celestialBody.equalsIgnoreCase("Pluto")){
			
			double userSpaceWeight = (userWeight * 0.06);
			
			System.out.println("Your space weight on Pluto is " + userSpaceWeight + " pounds");
			
		}
		userInput.close();
	}

}
