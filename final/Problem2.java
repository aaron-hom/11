//Problem2.java
class Problem2{
    public static void main(String[] args){
	int[][] table = {{3, 9, 6, 12}, {23, -25, 54}, {0, -12, 27, 8, 16}};
	System.out.println(getMax(table));
    }
    static int getMax(int[][] A){
	    int max = A[0][0];
	    for(int row = 0; row < A.length; row++){
		for(int col = 0; col < A[row].length; col++){
		    if(A[row][col] > max){
			max = A[row][col];
		    }
		}
	    }
	    return max;
        }
    }
