package bozovic.milos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	/* Za uneti broj ispitati da li je
	 *  pozitivan, negativan ili
	 * jednak nuli
	 */ 
		
		Scanner sc = new Scanner(System.in);

		int broj;
		System.out.println("Unesite broj: ");
		broj  = sc.nextInt();		
				
		if(broj>0)
		{	
			System.out.println("Broj je pozitivan!");
		}
		else if(broj<0)
		{
			System.out.println("Broj je negativan");
			}
		else if(broj == 0)
		{
			System.out.println("Uneti broj je nula.");
			}
		else
		{
			System.out.println("Pogrešan unos!");
			}
			}
		}
