/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditional;

import java.util.Scanner;

/**
 *
 * @author rgoldman
 */
public class Conditional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int temp;
        int population;
        int population2;
        int base = 10;
        
        System.out.println("what is your temp?");
        
        temp = scanner.nextInt();
        
        
        
        
        population = (temp > 45? (base *10): (base*3));
        
        if (temp >= 74)
        
        {
            population2 = base *15; }
            
            
            else if (temp == 47 || temp == 43)
                    
            {
                    
              population2 = base * 7; 
                    }
              
                   
              else {
                    population2 = base * 2;
                    
                    }
                    
    
        
    
        
        System.out.println("pop  is " + population2 + "and other pop is " + population);
        // TODO code application logic here
    }
    
}
