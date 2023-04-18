package bozovic.milos;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		
		
	Scanner input = new Scanner(System.in);
	
	    //Unos podataka
	System.out.print("Unesite godinu: ");
	int x = input.nextInt();
	
	
	if (x % 4 == 0 && x % 100 != 0 || x % 400 == 0) {
        // Štampanje rezultata
		System.out.println("Godina je prestupna");
	}
	else {
		// Štampanje rezultata
		System.out.println("Godina nije prestupna.");
	}
	input.close();
	}
	}

