package scalar;
import java.util.*;
public class printStar {
    // Method to print the star pattern
    public void printPattern(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i + j >= n)
                    System.out.print("*");
                else
                    System.out.print(" "); // Use print instead of println
            }
            System.out.println(); // Move to the next line after each row
        }
    }
    public static void main(String []args){
        printStar obj=new printStar();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n value");
        int n=sc.nextInt();
        obj.printPattern(n);
    }
}
