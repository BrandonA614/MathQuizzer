import java.util.Random;
import java.util.Scanner;


public class MathQuizzer
	{
		// Random Number Gen	
		static int counter;

		public static void main(String[] args)
			{
				
//				Scanner userInput = new Scanner(System.in);
//				System.out.println("How many questions would you like to answer?");
//				Scanner intInput = new Scanner(System.in);
//				int amount = intInput.nextInt(); 
//		
				
//				
//				System.out.println("Given int randomNumber = (int)(Math.random() * " + RandomNumber + ") + " + randomNumberTwo + "");
//				Scanner answerInput = new Scanner(System.in);
//				int answerAmount = answerInput.nextInt(); 
//				Scanner answerInputTwo = new Scanner(System.in);
//				int answerAmountTwo = answerInputTwo.nextInt(); 
//				
//				if(RandomNumber + randomNumberTwo == answerAmount + answerAmountTwo){
//					System.out.println("You got it right!");
//					
//				}else 
//					System.out.println("You got it wrong!");
				//MathQuizOne();
				System.out.println("How many questions would you like to answer?");
				Scanner amount = new Scanner(System.in);
				int input = amount.nextInt();
				
//				MathQuizTwo();
				
				
				for(int i=1; i<input + 1; i++){
		              MathQuizOne();
//					  MathQuizTwo();
				}
				
			}

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

