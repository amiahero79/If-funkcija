package bozovic.milos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	/* Za uneti broj ispitati da li je broj 
	 * pozitivan, negativan 
	*	ili jednak nuli
*/
		
	// 1. deo: Unos podataka	
	Scanner sc = new Scanner(System.in);
	
	int broj;
	
	System.out.print("Unesite vrednost za promenljivu broj: ");
	 broj = sc.nextInt();
	
	 // 2- deo: Obrada podataka
	 
	 
	 if(broj>0)
	 {	 
		System.out.println("Broj je pozitivan. ");
		 
		 
	 }
	 if(broj<0)
	 {
		 System.out.println("Broj je negativan. ");
	 } 
	 if(broj==0)
	 {
		 System.out.println("Broj je jednak nuli. ");
	 }
	}
	}


