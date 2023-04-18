package bozovic.milos;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		double x;
		double y = 0.0;
		
		System.out.println("Unesite vrednost za x: ");
		x = input.nextDouble();
		
		if (x < 0) {
			y = -1;
			
		}
		else if (x == 0) {
			y = 0;
			
		}
		else if (x > 0) {
			y = +1;
			
		}
		System.out.print("y = " + y);
	}
	

}

