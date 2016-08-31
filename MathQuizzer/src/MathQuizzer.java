import java.util.Random;
import java.util.Scanner;


public class MathQuizzer
	{
	

		static int counter;
		static int i;
		public static void main(String[] args)
			{
				//Startup
				System.out.println("How many questions would you like to answer?");
				Scanner amount = new Scanner(System.in);
				int input = amount.nextInt();
				
				//For loop with user input for length COMPLETE
				for(i=0; i < input ; i++){
					
					  MathQuizzes();
				}
				
				
			}
		
		public static void MathQuizzes(){
			if(i % 2 == 0){

				MathQuizOne();
			}else
			MathQuizTwo();
			
		}
		
		//First Quiz COMPLETE 
			public static void MathQuizOne(){
				
				//Number Gens
				int RandomNumber = new Random().nextInt(6) + 1;
				int randomNumberTwo = new Random().nextInt(6) + 1;
				
				//Asks for Input and Outputs initial Questions
				System.out.println("Given ** Random().nextInt(* " + RandomNumber + ") + " + randomNumberTwo + "");
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
			
			//Complete
			public static void MathQuizTwo(){
				
				
				int RandomNumberQuizTwo = new Random().nextInt(10) + 1;
				int randomNumberQuizTwoTwo = new Random().nextInt(RandomNumberQuizTwo) + 1;
				//Initial Question
				System.out.println("");
				System.out.println("Given int random number = (int)(Math.random() * X) + Y)");
				System.out.println("");
				System.out.println("What would X and Y be if I was looking for a range between " + RandomNumberQuizTwo +" and "  + randomNumberQuizTwoTwo);
				System.out.println("");
				
				//Scans for User Input for their answers
				Scanner answerInput = new Scanner(System.in);
				int answer = answerInput.nextInt();
				Scanner answerInputTwo = new Scanner(System.in);
				int answerTwo = answerInputTwo.nextInt();
				//Basically outputs right or wrong and score
				if(answer + answerTwo == RandomNumberQuizTwo + randomNumberQuizTwoTwo){
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

