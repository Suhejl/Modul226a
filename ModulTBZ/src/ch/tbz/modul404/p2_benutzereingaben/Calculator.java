/**
 *  Competence P2
 * 
 * @author D. A. Waldvogel
 * @version Version 1.0
 * @date 16.02.2019
 * WAL: in this file you don't have to make any changes
 */

package ch.tbz.modul404.p2_benutzereingaben;

import java.util.Date;

public class Calculator {
	
    public double fahrenheitToCelsius(double fahrenheit) {
		return   (fahrenheit - 32) / 1.8;	
	}
    
	
    public double celsiusToFahrenheit(double celsius) {	
		return (celsius * 1.8 + 32);
	}
	
  
    public int binaryToInteger(String binary) {
        char[] numbers = binary.toCharArray();
        Integer result = 0;
        int count = 0;
        for(int i=numbers.length-1;i>=0;i--){
             if(numbers[i]=='1') {
            	 result+=(int)Math.pow(2, count);
             }
             count++;
        }
        return result;
        // return Integer.parseInt(binary, 2));
        
    }
    
    
    public  String toBinary(int n, int l ) throws Exception {
	       double pow =  Math.pow(2, l);
	       StringBuilder binary = new StringBuilder();
	        if ( pow < n ) {
	            throw new Exception("The length must be big from number ");
	        }
	       int shift = l- 1;
	       for (; shift >= 0 ; shift--) {
	           int bit = (n >> shift) & 1;
	           if (bit == 1) {
	               binary.append("1");
	           } else {
	               binary.append("0");
	           }
	       }
	       return binary.toString();
	    // return Integer.toString(zahl,2));
	   }
       
     public int diffDate(Date d1, Date d2) {
    	 
    	 long diff = d2.getTime() - d1.getTime();

         return (int) (diff / 1000 / 60 / 60 / 24);
  
     }
     
   
     
}