//Prob2.java
import java.util.Scanner;
class Prob2{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        double x, y, z;
        x = sc.nextDouble();
        y = sc.nextDouble();
        z = Math.sqrt(x) + Math.sqrt(y);
        System.out.println(z);
    }
}
