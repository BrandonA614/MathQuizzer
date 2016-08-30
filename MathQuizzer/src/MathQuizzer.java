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
				
				//For loop with user input for length COMPLETE
				for(int i=1; i<input + 1; i++){
					
//		              MathQuizOne();
		              MathQuizTwo();
				}
				
				
			}
		
		
		
		//First Quiz COMPLETE 
			public static void MathQuizOne(){
				
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
					System.out.println("Your score is currently " + counter);
				}else{ 
					System.out.println("You got it wrong!");
					counter--;
					System.out.println("Your score is currently " + counter);
				}
			}
			
			//Always Outputs double "RandomNumber"
			public static void MathQuizTwo(){
				int RandomNumber = new Random().nextInt(5) + 1;
				int randomNumberTwo = new Random().nextInt(RandomNumber) + 1;
				
				System.out.println("");
				System.out.println("Given int random number = (int)(Math.random() * X) + Y)");
				System.out.println("");
				
				System.out.println("What would X and Y be if I was looking for a range between " + RandomNumber +" and "  + randomNumberTwo);
				System.out.println("");
				
				Scanner answerInput = new Scanner(System.in);
				int answer = answerInput.nextInt();
				Scanner answerInputTwo = new Scanner(System.in);
				int answerTwo = answerInputTwo.nextInt();
				
				if(answer + answerTwo == RandomNumber + randomNumberTwo){
					System.out.println("You got it right!");
					counter++;
					System.out.println("Your score is currently " + counter);
				}else {
					System.out.println("You got it wrong!");
					counter--;
					System.out.println("Your score is currently " + counter);
				}
				
				
			}
	}

