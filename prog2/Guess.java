//Guess.java
//Aaron Hom
//awhom
//Program 2
//Generates a random number that the user has 3 chances to guess

import java.util.Scanner; //activates scanner
class Guess{
    public static void main(String[] args){
        int intGuessed;  //defines the number that the user guesses
        int random = (int)(Math.random()*10+1);  //chooses random number between 1-10
        System.out.println("I'm thinking of an integer in the range 1 to 10. You have three guesses.");  //prints text
        Scanner sc = new Scanner(System.in);  //initiates scanner
        
        System.out.print("\nEnter your first guess: ");  //prompts user to enter first guess
        intGuessed = sc.nextInt();  //waits for input
	if(intGuessed>random && intGuessed <= 10){  //if number guessed is higher than random number and less than/equal to 10, then... 
	    System.out.println("Your guess is too high.");  //prints text
	}else if(intGuessed>random && intGuessed>10){  //if number guessed is higher than random number and greater than 10, then...
	    System.out.println("Your guess is too high and not within the range of 1-10.");  //prints text
	}else if(intGuessed==random){  //if number guessed is the random number, then...
	    System.out.println("You win!");  //prints text
            System.exit(0);  //ends program
	}else if(intGuessed<random){  //if number guessed is lower than random number, then...
	    System.out.println("Your guess is too low.");  //prints text
           }

	System.out.print("\nEnter your second guess: ");  //prompts user to enter second guess 
        intGuessed = sc.nextInt();  //waits for input
	if(intGuessed>random && intGuessed <= 10){  //if number guessed is higher than random number and less than/equal to 10, then...
            System.out.println("Your guess is too high.");  //prints text
        }else if(intGuessed>random && intGuessed>10){  //if number guessed is higher than random number and greater than 10, then...
	    System.out.println("Your guess is too high and not within the range of 1-10.");  //prints text
	}else if(intGuessed==random){  //if number guessed is the random number, then...
            System.out.println("You win!");  //prints text
            System.exit(0);  //ends program
	}else if(intGuessed<random){  //if number guessed is lower than random number, then...
            System.out.println("Your guess is too low.");  //prints text
           }
    
        System.out.print("\nEnter your third guess: ");  //prompts user to enter third guess
        intGuessed = sc.nextInt();  //waits for input
	if(intGuessed>random && intGuessed <= 10){  //if number guessed is higher than random number and less than/equal to 10, then... 
	    System.out.println("Your guess is too high.");  //prints text
	    System.out.println("\nYou lose. The number was "+random+"."); //prints text    
	}else if(intGuessed>random && intGuessed>10){  //if number guessed is higher than random number and greater than 10, then...
	    System.out.println("Your guess is too high and not within the range of 1-10.");  //prints text
	    System.out.println("\nYou lose. The number was "+random+".");  //prints text
	}else if(intGuessed==random){  //if number guessed is the random number, then...
	    System.out.println("You win!");  //prints text
	    System.exit(0);  //ends program
	}else if(intGuessed<random){   //if number guessed is lower than random number, then...
	    System.out.println("Your guess is too low.");  //prints text
	    System.out.println("\nYou lose. The number was "+random+".");  //prints text 
      }
   }
}




