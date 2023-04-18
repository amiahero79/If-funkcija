package bozovic.milos;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	
		
		System.out.println("Unesite broj: ");
		double x = sc.nextDouble();		
		double y = 0.0;		
		if (x<0) {
		y =	-5;
			
			System.out.println("y = " + y);
		}
		 if (x>=0 && x<1) {
		 y = x + 2;	
		
			System.out.println("y = " + y);
			}
		 if (x>=1 && x < 5) {
		y = 3*x - 1;
		
			System.out.println("y = " + y);
			}
		 if (x >= 5) {
		y = 2*x;
		
			System.out.println("y = " + y);
			}
			}
		


	}


