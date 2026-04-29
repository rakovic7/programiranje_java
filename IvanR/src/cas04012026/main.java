package cas04012026;

import java.util.Scanner;

public class main { 



    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);

        System.out.print("Unesi broj: ");
        
        int broj = input.nextInt();

        if (jePalindrom(broj)) {
        	
            System.out.println("Jeste palindrom");
            
        } 
        
        else {
        	
            System.out.println("Nije palindrom");
            
        }
    }
    
    
    public static boolean jePalindrom(int n) {
    	
        if (n < 10) {
        	
            return true;
            
        }

        
        int br_cif = (int) Math.log10(n);
        
        int djelilac = (int) Math.pow(10, br_cif);
        
        int prva = n / djelilac;
        
        int zadnja = n % 10;
        
        if (prva != zadnja) {
        	
            return false;
            
        }

        int novi = (n % djelilac) / 10;

        return jePalindrom(novi);
    }
}