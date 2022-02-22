import java.util.Random;
import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scann = new Scanner(System.in);
//		random random = new random();
//		random(); 
				
		while(true) {
			System.out.println("Welcome to game of HiLo!");
		    System.out.println("Enter the Number '1' for random guess game");
		    System.out.println("Enter the Number '2' for ---------- guess game");
		    System.out.println("Enter the number '3' to exit the game");
		    System.out.print("Input from User: \'");
		    int no1 = scann.nextInt();
		    System.out.println("");
		    	    	
	    switch(no1) 
	    {
    		case 1:random random = new random();
    		break;
	    	case 2:
	    		
             break;
	    	case 3:
	    		System.out.println("Thank You for playing with us");
	    		System.exit(0);
	    	default:System.out.println("Invalid Choice");    	
	    }	    		
	    }
	}
		
	
	
//	public static void random() 
//	{
//		Random rand = new Random();
//		int randomNumber = rand.nextInt(100)+1;{
//			System.out.println("\nRandom Number is:"+randomNumber);	
//			while(true) 
//			{
//				System.out.print("\nEnter your guess between(1-100):\t");
//				Scanner scan = new Scanner(System.in);
//				int playerGuess = scan.nextInt();
//		
//			    if(randomNumber == playerGuess) 
//			    {
//				   System.out.println("You have correctely guessed it: ");
//				   break;
//				}
//				else if(randomNumber > playerGuess)
//				{
//					System.out.println("Guess again the number is higher!\n");
//				}
//		
//				else
//				{
//					System.out.println("Guess again the number is Lower!");
//				}
//			}
//		}	
//	}

}

class random{
	
	Random rand = new Random();
	int randomNumber = rand.nextInt(100)+1;{
		System.out.println("Random Number is:"+randomNumber+"\n");
		int Count = 0;
		while(true) 
		{
			System.out.print("Enter your guess between(1-100):\t");
			Scanner scan = new Scanner(System.in);
			int playerGuess = scan.nextInt();
			Count++;
	
		    if(randomNumber == playerGuess) 
		    {
			   System.out.println("You have correctely guessed it ");
			   System.out.println("and you took: "+Count+" chancess to guess\n");
			   break;
			}
			else if(randomNumber > playerGuess)
			{
				System.out.println("Guess again the number is higher!\n");
			}
	
			else
			{
				System.out.println("Guess again the number is Lower!\n");
			}
		}
	}	
}
	

