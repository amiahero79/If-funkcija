package bozovic.milos;

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	    //Unos podataka
	System.out.print("Unesite ocenu x: ");
	int x = input.nextInt();
	
	
	if (x >= 0 && x <= 49) {
       x = 1;
	}
	else if (x >= 50 && x <= 60) {
	   x = 2;
	}
	else if (x >= 61 && x <= 70) {
		   x = 3;
		}
	else if (x >= 71 && x <= 80) {
		   x = 4;
		}
	else if (x >= 81 && x <= 90) {
		   x = 5;
			System.out.print("x = " + x);
		}

	else
	{
		
		System.out.print("Uneta vrednost za x je greška");
	}
	
	}
	
}

