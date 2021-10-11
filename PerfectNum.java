package perfectnumber;

import java.util.Scanner;

public class PerfectNum {
	public static void main(String[] args) {
	 System.out.println("Enter no");
	 Scanner sc= new Scanner(System.in);
	 int n=sc.nextInt();
	 int p=0;
	// System.out.println(n);
	 for (int i=1; i<=n/2; i++) {
	    if(n%i == 0) {
	    	 
	    	p=i+p;
	    }	 
	 }
	 if(p==n) {
	 System.out.println(n+" is a perfect no");
	 }
	 else {
		 System.out.println(n+" is not perfect no");
		 }
	 }
}
