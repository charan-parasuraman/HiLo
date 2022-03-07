
import java.util.Random;
import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scann = new Scanner(System.in);
//		random random = new random();
//		random(); 
		HiLo Hilo= new HiLo();
				
		while(true) {
			System.out.println("Welcome to game of HiLo!");
		    System.out.println("Enter the Number '1' for Random guess game");
		    System.out.println("Enter the Number '2' for Linear guess game");
		    System.out.println("Enter the number '3' for Binary method the game");
		    System.out.println("Enter the number '4' for Random method the game - auto mode");
		    System.out.println("Enter the number '5' for Linear guess game- using Array");
		    System.out.println("Enter the number '6' to exit the game");
		    System.out.print("Input from User: \'");
		    int no1 = scann.nextInt();
		    System.out.println("");
		    	    	
	    switch(no1) 
	    {
    		case 1:random random = new random();
    		break;
	    	case 2:
	    		Assignment3Linear linear = new Assignment3Linear();
	    	    Scanner input = new Scanner(System.in);
	    	    //Roles of player in the game
	    	    System.out.print("\nNote : \nNumber is selected by Player-1(user) & The Guesses are made by the Player-2(computer)");
	    	    System.out.print("\nTherefore, Please enter a Number Between 1 to 1000 Inclusive of them \n");
	    	    int num = input.nextInt();
	    	    //Number Taken as Input
	    	    System.out.print("The number selected by you = "+num+"\n");
	    	    //Initialized the Comparisons/Count of Guesses  
	    	    int count = 0;
	    	    int min = 1;
	    	    int max = 1000;
	    	    if(num>max || num<min){
	    	      System.out.print("Invalid Input,Please enter a number between 1 to 1000");
	    	    }else{
	    	    	linear.hiLoGame(count,min,max,num);
	    	    }
             break;
	    	case 3:
    			BinarySearch binary = new BinarySearch();
    			int high=1000-1,low=0,i,mid,Target_no,minn=1,maxx=1000,counter=0;
    	        System.out.println("Lets play a HI/Lo game!!");
    	        System.out.println("Random Number is:"+binary.randomNumber+"\n");

    	        Scanner sc = new Scanner(System.in);
    	        System.out.print("Enter your guess:");
    	        int guess= sc.nextInt();
    	        binary.binary_search(binary.randomNumber,high,low,counter,guess);
    		break;
    		case 4:
    			Hilo.random();
    		break;
    		case 5:
    			Hilo.linear();
    		break;
	    	case 6:
	    		System.out.println("Thank You for playing with us");
	    		System.exit(0);
	    	default:System.out.println("Invalid Choice");    	
	    }	    		
	    }
	}
		
	public static void linear() {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[1000];                            
		for (int i= 0; i<arr.length;i++)
		{
			arr[i]= (int)(Math.random()*999)+1;             
		}
		
		System.out.println("Random Numbers");
		
		int y = 0;
		for (int j=0;j<arr.length;j=j+1)                      // To Print out a unsorted array in a 10 column box
				{
			        System.out.print(arr[j]+" ");
					y++;   
					if( y > 9 )
					{
						y = 0;
						System.out.println('\n');
					}
				}

		Random rand = new Random();
		int randomNumber = rand.nextInt(9)+1;
		int i;
		for(i=0;i<arr.length-1;i++) {
			if(arr[i]==randomNumber) {
				System.out.println(randomNumber+ " is found and the position is: "+(i+1));
				System.out.println("");
				
			}
		}	
		if(i==arr.length-1) {
			System.out.println(randomNumber+" Not found or index exceded \n");
			System.out.println("");
		}
	}
			
	public static void random() 
	{
		Random rand = new Random();
		int randomNumber = rand.nextInt(999)+1;{
			System.out.println("\nRandom Number is:"+randomNumber);
			int Count = 0;
			while(true) 
			{
				 
				int randomNum = rand.nextInt(999)+1;
				System.out.print("The System guess between(1-100) is: "+randomNum+"\t");
				Count++;
		
			    if(randomNumber == randomNum) 
			    {
				   System.out.println("You have correctely guessed it ");
				   System.out.println("and the system took: "+Count+" chancess to guess\n");
				   break;
				}
				else if(randomNumber > randomNum)
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

}

class random{
	
	Random rand = new Random();
	int randomNumber = rand.nextInt(999)+1;{
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

class BinarySearch{
	
	static Random rand = new Random();
    static int randomNumber = rand.nextInt(999)+1;
    //System.out.println("Random Number is:"+randomNumber+"\n");
    public static void binary_search( int randomNumber,int high,int low,int counter, int guess){
        int mid;
        Scanner sc = new Scanner(System.in);
        counter++;
        mid=(low+high)/2;
        if(randomNumber==guess){
            System.out.println("Yaay!! Number found");
            System.out.println("The correctly guessed number is: "+guess);
            System.out.println("Number of attempts:"+counter);
            System.out.println("");
        }
        else if(randomNumber>guess) {
            System.out.println("This guess is incorrect. The actual number is greater than your guess.");
            if (randomNumber<mid){
            high = mid ;
            System.out.print("Try another number between "+low+" and "+high+": ");
            guess= sc.nextInt();
            binary_search(randomNumber,high,low,counter,guess);}
            else{
                low=mid;
                System.out.print("Try another number between "+low+" and "+high+": ");
                guess= sc.nextInt();
                binary_search(randomNumber,high,low,counter,guess);
            }
        }
        else{
            System.out.println("This guess is incorrect. The actual number is lesser than your guess");
            if (randomNumber<mid){
                high = mid ;
                System.out.print("Try another number between "+low+" and "+high+": ");
                guess= sc.nextInt();
                binary_search(randomNumber,high,low,counter,guess);}
            else{
                low=mid;
                System.out.print("Try another number between"+low+" and "+high+": ");
                guess= sc.nextInt();
                binary_search(randomNumber,high,low,counter,guess);
            }

        }

    }
	
}


class Assignment3Linear{
	static void hiLoGame(int count,int min, int max, int num){
	    //Linear Search loop
	    for(int i=min; i<=max; i++)
	    {
	      //Found Condition - to Stop loop
	      if(i == num)
	      {
	        System.out.print("\nFound at "+i+"th Guess, The Number = "+num+"\n");
	        count++;
	        break;
	      }
	      //Comparisons Conditions
	      else
	      {
	        //Low Condition
	        if(i<num)
	        {
	          System.out.print("\nComputer Guessed "+i+" Which is Lo");
	          count++;
	        }
	        //High Condition (not Req in case of Linear Inputs)
	        //In Linear Search Hi-Lo Game there is no case where number Guessed will be higher than selected number as the loop till then will already have passed through selected number Hence the else if High part is useless
	        else if(i>num)
	        {
	          System.out.print("\nComputer Guessed "+i+" Which is Hi");
	          count++;
	        }
	      }
	    }
	    //Analysis
	    System.out.print("\nTotal number of Guesses  => "+count);
	    //Observations
	    System.out.print("\nSince the Linear Search Guess by computer gives input linearly as 1,2,3...n. Therefore, the selected number will be encountered at last and\nHence NO high condition will be guessed or taken as input.");
	    System.out.print("\nGuesses Made = Selected Number = "+num +" as the linear search looks for all the numbers as of lined up in row in ascending order ");
	    System.out.print("\nAll in all the Best case for Linear Search Guess is when the Selected Number is (1) and worst case is when the selected number is N in the selection from (1-N)");
	    System.out.print("\nHence the Average Time complexity comes out to be N/2 as taking average of summation of 1+2+..+n/n gives N/2, Where N = Highest Possible Input");
	    System.out.println("\n");

	  }
	
}
	

