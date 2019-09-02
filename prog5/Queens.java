//Queens.java
//Aaron Hom & Zimraan Hamid
//awhom & zjhamid
//pa5
//Finds the solution to the eight queens problem


import java.lang.Integer;
import java.util.Scanner;


class Queens {
    public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	boolean allout = false;
	int x;
	int c;
	int y;
	int n;
	int d = 0;
	int [] g;
	int firstnumber;




	try {
	    String trying = args[0];
	}
	catch (ArrayIndexOutOfBoundsException e){
	    System.out.print("Usage: Queens [-v] number\nOption: -v verbose output, print all solutions\n");
	    return;
	}

	if (args.length == 1){
	    try{
		firstnumber = Integer.parseInt(args[0]);
	    }
	    catch (NumberFormatException e){
		System.out.print("Usage: Queens [-v] number\nOption: -v verbose output, print all solutions\n");
		return;
	    }
	}
	if (args.length == 0){
	    System.out.print("Usage: Queens [-v] number\nOption: -v verbose output, print all solutions\n");
	}

	if (args[0].equals("-v")){
	    allout = true;

	}

	if (args.length == 1 || args.length == 2){
	    firstnumber = Integer.parseInt(args[0]);
	    int u = firstnumber;
	    g = new int [firstnumber+1];
	    g[0]=0;





	    n = factor (firstnumber);
	    for (int r=1; r<g.length; r++){
		g[r]=r;

	    }
	    for (int h=1; h<=n; h++){
		nextPermutation(g);
		d++;
		if (isSolution(g)){
		    //
		}



	    }
	    System.out.print(u + "-Queens has " + d + " solutions\n");
	}

	else {
	    System.out.print("Usage: Queens [-v] number\nOption: -v verbose output, print all solutions\n");
	}




    }


    static void nextPermutation(int[] A) {

	int pivot = 5;
	int successor = 5;
	int temp = 5;

	for (int z=A.length-2; z>0; z--) {
	    if (A[z] < A[z+1]) {
		pivot = z;
		break;
	    }
	}
	if (pivot == 5) {
	    reverse(A,A.length-1);
	    return;
	}
	for (int z=A.length-1; z>0; z--) {
	    if (A[z] > A[pivot]) {
		successor = z;
		break;
	    }

	    temp = successor;
	    successor = pivot;
	    pivot = temp;

	    reverse(A, pivot+1);
	    return;

	}
    }

    static boolean isSolution(int[] A) {
	int c;
	int d;
	int e;


	for (int x=2; x<A.length; x++) {
	    for (int y=1; y<x; y++) {
		c = x-y;
		d = A[x] - A[y];
		e = A[y] - A[x];

		if (d == c || e == c) {
		    return false;
		}


	    }


	}

	return true;
    }

    static void swap (int []b, int c, int d) {

	int hold = b[c];
	b[c] = b[d];
	b[d] = hold;
    }

    static void reverse(int[] d, int e ) {

	int f;
	f = d.length-1;
	while (e<f) {
	    swap(d, e, f);
	    e++;
	    f--;
	}

    }
    static int factor (int x) {
	int factors =1;
	int a;

	for (a=1; a<x+1; a++) {
	    factors *=a;
	}
	return factors;
    }



    static void printout (int[] p) {

	for (int x=0; x<p.length; x++) {

	    System.out.println(p[x]);

	}

    }

}



