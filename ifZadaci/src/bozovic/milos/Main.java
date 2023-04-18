package bozovic.milos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		char a = sc.next().charAt(0);
		
		
		if(a >= 'A' && a<= 'Z')
		{	
		System.out.println("Uneti karakter je veliko slovo.");
		}
		else if (a >= 'a' && a <= 'z')
		{
	System.out.println("Uneti karakter je malo slovo.");
	}
		else if (a >= '0' && a<= '9') {
	System.out.println("Uneti karakter je broj.");
       }
       else {
    	  System.out.println("Uneta karakter je specijalni simbol."); 
       }
	}
       
	}



