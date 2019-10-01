/**
 *  Competence P2
 * 
 * @author D. A. Waldvogel
 * @version Version 1.0
 * @date 16.02.2019
 * 
 */
package ch.tbz.modul404.p2_benutzereingaben;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Menu {
	
	public void menue (Calculator calc) {
		int choice = -1;
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println(" Menue-Auswahl");
			System.out.println(" [1] Celsius          -> Fahrenheit");
			System.out.println(" [2] Fahrenheit       -> Celsius   ");
			System.out.println(" [3] Integer          -> Bin�r     ");
			System.out.println(" [4] Bin�r            -> Integer   ");
			System.out.println(" [5] Diff Date d1 d2  -> Anzahl Tage");
			
			System.out.println(" [0] beenden  ");
			// implement the error handling in the following code			
			choice = Integer.parseInt(sc.nextLine());		
			switch (choice) {
			case 1:
				// implement the error handling in the following code
				System.out.println("Temperatur in Celsius eingeben");
				double celsius = Double.parseDouble(sc.nextLine());
				System.out.println(celsius + " Grad Celsius sind: "+ calc.celsiusToFahrenheit(celsius) + " Grad Fahrenheit");	
			    break;			
			case 2:	
				// implement the error handling in the following code
				System.out.println("Temperatur in Fahrenheit eingeben");
				double fahrenheit = Double.parseDouble(sc.nextLine());
				System.out.println(fahrenheit + " Grad Fahrenheit sind:" + calc.fahrenheitToCelsius(fahrenheit) +" Grad Celsius");
			    break;				
			case 3:	
				// Integer to binary
				// complete the program and implement the error handling 
				//			
			   break;			 
			case 4:	
				// binary to integer
				// complete the program and implement the error handling				
			   break;			
			case 5:	
				// number of days between two dates
				// complete the program and implement the error handling	
				// the code below is just a small help, please do it better WAL
						
				String date1 = "2019/01/14";
				String date2 = "2019/01/17";
				// custom date format
				
				Date d1 = null;
				Date d2 = null;
				
			     SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

				try {
					d1 = sdf.parse(date1);
					d2 = sdf.parse(date2);
				} catch (ParseException e) {
					e.printStackTrace();
				} catch (NumberFormatException e) {
					System.out.println("hey");
				}
							
				System.out.println("Anzahl Tage zwischen " + sdf.format(d2) + " und " + sdf.format(d1) + " ist: " + calc.diffDate(d1,d2));
			break;					
			
			}
	
		} while( choice != 0);
		
		sc.close();
		
	}
	
}
