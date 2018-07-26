/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jankenpo;

import java.util.Scanner;

import java.util.Random;




/**
 *
 * @author rgoldman
 */
public class Jankenpo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int response;
       
        do{
        
           
        System.out.println("Rock,paper, or scissors?");
        
       
        
        
        
         Scanner input = new Scanner(System.in);
         
         String inputString = input.nextLine();
         
         Random rand = new Random();
        
        int compItem = rand.nextInt(3);
         
        
         
         if (compItem == 0){
             
                if (inputString.equals("rock")){
                  
                  System.out.println("we are tied, both rock");
                
         }
                
         
                   else if ( inputString.equals("paper")){
                 
                  System.out.println("you win because paper covers rock");
         }
         
                  else {
                 
                 System.out.println("you lose because rock smashes scissors");
         }
         }
         
         
         else if  (compItem == 1){
                 
                 if (inputString.equals("rock")){
                  
                  System.out.println("you lose because paper covers rock");
         }
         
            else  if (inputString.equals("paper")){
                  System.out.println("we are tied, both paper");
         }
         
            else {
                 System.out.println("you win because scissors cuts paper");
                 
         } 
         }
         
            else {
             
               if (inputString.equals("rock")){
                 
                 System.out.println("you win because rock smashes scissors");
         }
         
            else if (inputString.equals("paper")){
                
                System.out.println("you lose because scissors cut paper");
         }
         
         else{
             
             System.out.println("we are tied, both scissors");
         }
                 }
                 
     
         System.out.println("want to play again?");
        response = input.nextInt(); 
         } while (response == 1);
        
         
        
         
        
        }
}
           
             
          
         
        // ODO code application logic here
    

    
    

