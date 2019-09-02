//Roots.java
//Aaron Hom & Zimraan Hamid
//awhom & zjhamid
//pa4
//Determines the real roots of a polynomial within a specific range

import java.util.Scanner;

class Roots {

    public static void main(String[] args) {

        //initalize variables
        double resolution = 0.01;
        double tolerance = 0.0000001;
        double threshold = 0.001;
        double root;
        double a;
        double b;
        boolean gotRoot = false;

        //initialize scanner
        Scanner sc = new Scanner(System.in);

        //Prompts user to enter degree
        System.out.print("Enter the degree: ");
        int degree = sc.nextInt();

        //Creates an array with r numbers
        int r = degree + 1;
        System.out.print("Enter "+r+" coefficients: ");
        double[] C;
        C = new double[r];

        //Prompts user to enter c amount of coefficients to store in array numCo
        for (int i=0; i<r; i++) {
            C[i] = sc.nextDouble();
        }

        //Prompts user to enter endpoints
        System.out.print("Enter the left and right endpoints: ");
        double point1 = sc.nextInt();
        double point2 = sc.nextInt();
        System.out.printf("\n");

        //Finds roots (if any) and prints
        double[] P = diff(C);
        for (a=point1;a<point2;a=a+resolution) {
            b = a+resolution;
            if (poly(C,a)*poly(C,b)<0 || poly(P,b)*poly(P,a) < 0) {
                root = findRoot(C, a, b, tolerance);
                System.out.print("Root found at ");
                System.out.printf("%.5f\n", root);
                gotRoot = true;
            }
        }

        //If no roots were found, print:
        if (gotRoot == false) {
            System.out.println("No roots were found in the specified range.");
        }
    }
    //Returns sum of all coefficients and their respective power of x
    static double poly(double[] C, double x) {
        double sum = 0;
        for (int i=0; i < C.length; i++) {
            sum+=C[i]*Math.pow(x,i);
        }
        return sum;
    }

    //Finds the derivative of of the C function
    static double[] diff(double[] C) {
        int b = C.length-1;
        double[] D = new double[b];
        for (int i = 0; i<b; i++) {
            D[i]=C[i]*(b-1);
        }
        return D;
    }
    //Returns approximation of root of polynomial
    static double findRoot(double[] C, double a, double b, double tolerance) {
        double base = a;
        double width = b-a;
        while (width > tolerance) {
            base = (a+b)/2;
            if (poly(C,a)*poly(C, base) <= 0) {
                b = base;
                width = b-a;
            } else {
                a = base;
                width = b - a;
            }
        }
        return base;
    }
}
