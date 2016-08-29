import java.util.Random;
import java.util.Scanner;


public class MathQuizzer
	{
		// Random Number Gen	
		static int counter;

		public static void main(String[] args)
			{
				//Startup
				
				System.out.println("How many questions would you like to answer?");
				Scanner amount = new Scanner(System.in);
				int input = amount.nextInt();
				
				
				
//				MathQuizTwo();
				
				//For loop with user input for length COMPLETE
				for(int i=1; i<input + 1; i++){
		              MathQuizOne();
//					  MathQuizTwo();
				}
				
				
			}
		
		
		//First Quiz COMPLETE -- may need to work on counter, definitely recheck.
			public static void MathQuizOne(){
				int counter = 0;
				//Number Gens
				int RandomNumber = new Random().nextInt(5) + 1;
				int randomNumberTwo = new Random().nextInt(5) + 1;
				
				//Asks for Input and Outputs inital Questions
				System.out.println("Given int randomNumber = (int)(Math.random() * " + RandomNumber + ") + " + randomNumberTwo + "");
				Scanner answerInput = new Scanner(System.in);
				int answerAmount = answerInput.nextInt(); 
				Scanner answerInputTwo = new Scanner(System.in);
				int answerAmountTwo = answerInputTwo.nextInt(); 
				
				//Outputs Whether the player was correct or incorrect
				if(RandomNumber + randomNumberTwo == answerAmount + answerAmountTwo){
					System.out.println("You got it right!");
					counter++;
				}else 
					System.out.println("You got it wrong!");
				counter--;
				
				System.out.println("Your score is currently " + counter);
			}
			
			//Can't seem to get the values to match up. Possible that it cant understand 
			//strings when checking if they are equal in the if statement. Re-look / Research.
			
			public static void MathQuizTwo(){
				int RandomNumber = new Random().nextInt(5) + 1;
				int randomNumberTwo = new Random().nextInt(5) + 1;
				
				
				System.out.println("Given " + RandomNumber +" " + randomNumberTwo );
				Scanner answerInput = new Scanner(System.in);
				String answer = answerInput.nextLine();
				
				
				if(answer == "int randomNumber = (int)(Math.random() * " + RandomNumber + ") +" + randomNumberTwo){
					System.out.println("You got it right!!");
					counter++;
				}else {
					System.out.println("You got it wrong :(" );
					counter--;
				}
				
				
			}
	}

