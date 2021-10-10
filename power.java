package sample;

import java.util.Scanner;

public class power {
	public static void main(String[] args) {
		System.out.println("enter upto to print power of 2 table ");
		Scanner sc=new Scanner (System.in);
		int p=sc.nextInt();
		int a=2;
		for(int i=0; i<p; i++) {
			System.out.println("2^"+i+"="+(int)Math.pow(a, i));
		}
	}

}
