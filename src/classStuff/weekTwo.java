package classStuff;

import java.util.*;
public class weekTwo {

	public static void main(String[] args) {
				/*
				 * logical operators
				 * <
				 * >
				 * <=
				 * >=
				 * ==
				 * !=
				 * !, &&, ||
				 */
				
				//if statement
//				int a =5, b = 6;
//				
//				if (a < b)
//					System.out.println("too high");
//				else if (a > b) {
//					System.out.println("too low");
//				}
//				else
//					System.out.println("correct");
//				
//				
//				switch (a) { //nobody uses this because you are limited
//				case 4: //the case is value
//					System.out.println("4");
//				case 6: 
//					System.out.println("6");
//				default:
//					System.out.println("No match");
					
				//}
//				Scanner kb = new Scanner(System.in);
//				Scanner kb2 = new Scanner(System.in);
//				//accepting ints
//				System.out.println("how old are you?");
//				int age = kb.nextInt();
//				System.out.println("You are " + age + " years old.");
//				
//				//accepting doubles
//				System.out.println("What's your GPA?");
//				double GPA = kb.nextDouble();
//				System.out.println("Your GPA is " + GPA);
//				
//				//words
//				System.out.println("What is your first name?");
//				String name = kb.next();
//				System.out.println("Oh hello " + name);
//				
//				//anomoly
//				System.out.println("What is your address?");//once you do this you cant go back
//				String addy = kb2.next(); //make a second scanner
//				System.out.println(addy);
//				
//				System.out.println("What is your last?");
//				String last = kb.next();
//				System.out.println("Oh hello " + last);
				
				Scanner kb = new Scanner(System.in);
				int rand = (int) (Math.random() * 100 + 1);
				
				while(true) {
				System.out.println("Please guess my number");
				int guess = kb.nextInt();
				
				if (rand < guess) {
					System.out.println("Too High");
				}
				else if (rand > guess ) {
					System.out.println("Too Low");
				}
				else {
					System.out.println("You got it!!");
				}
				}
			//for(int j = 0; j < 5; j++) { //each of these is a step. the variable j can only exist in this structure
				//System.out.println("Hello"); 
			//}
			//Scanner kb = new Scanner(System.in);
			//boolean run = true;//relies solely on global variables
			//while (run) {
				//System.out.println("enter a number. press 0 to exit");
				//int num = kb.nextInt();// all for loops can be a while loop
				//if(num)
			//}
					

	}

}
