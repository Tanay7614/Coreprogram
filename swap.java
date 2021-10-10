import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        System.out.println("Enter a X value");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(" X ="+x);
	 System.out.println("Enter a Y value");
	 int y=sc.nextInt();
	 System.out.println(" Y ="+y);
     x=x+y;
     y=x-y;
    x=x-y;
    System.out.println("x="+x);
  System.out.println("Y="+y);     
    
}
}


