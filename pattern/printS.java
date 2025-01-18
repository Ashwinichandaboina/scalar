package scalar;

import java.util.Scanner;

public class printS{
    public static void main(String []args){
        // printStar obj=new printStar();
        System.out.println("enter the n value");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=n;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(i==0||i==n||i==max/2){
                    System.out.print("*");
                }
                else if(i<=max/2 && j==0)
                    System.out.print("*");
                else if(i>max/2 && j==n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println("");
        }
    }
}





