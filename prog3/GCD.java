//GCD.java
//Aaron Hom
//awhom
//Program3
//Takes user input of 2 positive integers and finds the greatest common denominator

import java.util.Scanner; //activate scanner
class GCD{ //initiate class 
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in); //initiate scanner
       System.out.print("Enter a positive integer: "); //print text
       int a, b; //initiate variables
       while(true){ //starts  while loop (loops as long as statement is true)	
	   while(!sc.hasNextInt()){ //starts another while loop (loops as long as statement is not an int)
	       sc.next(); //deletes previously entered value
	       System.out.print("Please enter a positive integer: "); //prints text
           }
	   a = sc.nextInt(); //waits for user input
	   if(a < 0){ //tests if a is negative
	       System.out.print("Please enter a positive integer: "); //prints text
	   }else{ 
	       break; //breaks to outside statement bracket
	   }
       }
       System.out.print("Enter another positive integer: "); //prints text
       while(true){ //starts while loop (loops as long as statement is true)
	   while(!sc.hasNextInt()){ //starts another while loop (loops as long as statement is not true)
	       sc.next(); //deletes previously entered value
               System.out.print("Please enter a positive integer: "); //prints text
           }
	   b = sc.nextInt(); //waits for user input
	   if(b < 0){ //tests if b is negative
	       System.out.print("Please enter a positive integer: "); //prints text
 	   }else{  
	       break; //breaks to outside statement bracket
	   }
       }
       int r = 1; //initailizes variable 
       int a2 = a,b2 = b; //variables created to hold the orignial values of a and b
       while(r > 0){ //starts while loop (loops as long as r is greater than 0)
	   r = a % b; //r is "a modulus b"
	   a = b; //sets a equal to b value
	   b = r; //sets b equal to r value
	   if(r == 0){ //tests if r equals 0
	       System.out.println("The GCD of "+a2+" and "+b2+" is "+a); //prints the GCD of a and b      
         }
      }
   }
}
