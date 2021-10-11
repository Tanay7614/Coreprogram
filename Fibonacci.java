package fibonacci;

import java.util.Scanner;

public class Fibonacci {
	 public static void main(String[] args) {
		 
			 System.out.println("Enter no");
		 Scanner sc= new Scanner(System.in);
		 int n=sc.nextInt();
		 int a=0;
		 int b=1;
		 System.out.print(a);
		 System.out.print(" "+b);
		 for (int i=0;i<n;i++) {
		    int sum=a+b;
		    System.out.print(" "+sum);
		    a=b;
		    b=sum;
		 }
		 }

}
