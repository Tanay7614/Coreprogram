package alphabet;

import java.util.Scanner;

public class Alphabet {
	public static void main(String[ ] arg)
	{
	int i=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a character : ");
	char ch=sc.next( ).charAt(0);	 
	//char ch=sc.nextChar();
	switch(ch)
	{
	 case  'a' :
	 case 'e'  :
	 case 'i'   :
	 case 'o'  :
	 case 'u'  :
	 case  'A' :
	 case 'E'  :
	 case 'I'   :
	 case 'O'  :
	 case 'U'  :i++;
	}
	if(i==1)
	System.out.println("Entered character "+ch+" is  Vowel");
	else 
		if((ch>='b'&&ch<='d')||(ch>='f'&&ch<='h')||(ch>='j'&&ch<='n')||(ch>='p'&&ch<='t')||(ch>='v'&&ch<='z'))
		System.out.println("Entered character "+ch+" is Consonent");
		else
		System.out.println("it is an alphabet");		
	

	 }
}
