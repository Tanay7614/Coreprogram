package even;

import java.util.Scanner;

public class evenodd {
	public static void main(String[] args) {
	 System.out.println("enter a no");
	Scanner sc = new Scanner(System.in);
	 int p=sc.nextInt();
	 if(p%2==0) {
		 System.out.println("No is even no");
	 }
	 else {
		 System.out.println("No is odd");
	 }
}
}