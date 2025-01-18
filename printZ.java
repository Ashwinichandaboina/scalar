package scalar;

import java.util.Scanner;

public class printZ {
        public static void main(String []args){
            // printStar obj=new printStar();
            System.out.println("enter the n value");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int max=n;
            for(int i=0;i<=n;i++){
                for(int j=0;j<=n;j++){
                    if(i==0||i==n){
                        System.out.print("*");
                    }
                    else if(i+j==max)
                        System.out.print("*");
                    else if(i+j<=max)
                        System.out.print(" ");
                    else
                        continue;
                }

                System.out.println("");
            }
        }
    }




