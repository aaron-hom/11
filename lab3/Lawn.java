//Lawn.java
//Aaron Hom
//awhom
//Program1
//Records input variables of a house and returns information about the lot, house and lawn

import java.util.Scanner;
    class Lawn{
      public static void main(String[] args){

          double length1, width1, area1;  //initiates variables
          Scanner sc = new Scanner(System.in);  //defines new scanner
          length1 = sc.nextDouble();  //waits for user input of length or width
          width1 = sc.nextDouble();  // waits or user input of length or width
          area1 = length1*width1;  //calculates area of lot
     
      	  double length2, width2, area2;  //initiates variables 

          length2 = sc.nextDouble();  //waits for user input of length or width
          width2 = sc.nextDouble();  //waits for user input of length or width
          area2 = length2*width2;  //calculates area of lot          

          double area3, rate;  //initiates vartiables
          double sec = 0;  //gives a value for sec
	  area3 = area1 - area2;  //calculates area of lawn
	  System.out.println("The lawn area is: "+area3+" square feet");  //gives the user area of lawn
          rate = sc.nextDouble();  //waits for user to enter mowing rate
          sec = area3/rate;  //calculates time it takes to mow lawn
          int h, m, s, n;  //intiializes variables
          s = (int) Math.round(sec);  //gives a value for s
          m = s/60;  //gives a value for m
          s = s%60;  //gives a value for s
          h = m/60;  //gives a value for h
          m = m%60;  //gives a value for m
            
	  System.out.print("The mowing time is "+h+" hour"+(h==1?" ":"s "));  //gives user the mowing time
	  System.out.print(""+m+" minute"+(m==1?" ":"s " ));
          System.out.print(""+s+" second"+(s==1?".":"s."));        
        } 
    }
