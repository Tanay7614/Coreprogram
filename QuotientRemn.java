package remain;
import java.util.Scanner;
public class QuotientRemn {
	
	    public static void main(String[] args) {
	        System.out.println("Enter a no");
	        Scanner sc=new Scanner(System.in);
	        int d=sc.nextInt();
	        System.out.println("Enter a disior");
	        int div=sc.nextInt();
	        int q=d/div;
	        int rem=d%div;
	        System.out.println("quotient="+q);
	        System.out.println("remainder="+rem);
	    }
	}




