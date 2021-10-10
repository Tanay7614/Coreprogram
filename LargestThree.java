package sample;

import java.util.Scanner;

public class LargestThree {
	 public static void main(String[] args) {
	        System.out.println("Enter a no");
	        Scanner sc=new Scanner(System.in);
	        int a=sc.nextInt();
	        int b=sc.nextInt();
	        int c=sc.nextInt();
	        int max=a>b?a:b;
	         int max1=max>c?max:c;
	        	  System.out.println("maximum no ="+max1);  
	          
	        }
	        
            
}
