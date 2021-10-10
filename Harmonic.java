package harmonic;

import java.util.Scanner;

public class Harmonic {
	public static void main(String[] args) {
		 System.out.println("enter a no");
		 Scanner sc= new Scanner(System.in);
		 int p=sc.nextInt();
		 for(int i=1;i<=p;i++) {
			 System.out.print("1/"+i+" + ");
		 }
	}
}
