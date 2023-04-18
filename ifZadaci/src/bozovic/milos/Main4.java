package bozovic.milos;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double x;
		double y = 0.0;
		
		System.out.println("Unesite vrednost za x: ");
		x = input.nextDouble();
		
		if (x <= 2 && x > -2) {
			y = 2*x;
			
		}
		else if (x >= 5 && x < 7) {
			y = 3*x - 1;
			
		}
		else   {
			y = 1/x;
			
		}
		System.out.print("y = " + y);
	}
	}


