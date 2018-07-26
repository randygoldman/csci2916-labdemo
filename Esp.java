/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esp;

import java.util.Scanner;

import java.util.Random;

/**
 *
 * @author rgoldman
 */
public class Esp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int correct = 0;
        String userString;
        String computerString;
        int num;
        int i;
        
        for ( i = 0; i < 10; i++){
            
            
            questionUser();
            num = generate();
            userString = getInputString();
            computerString = convertNumToString(num);
            System.out.println("computer chose" + computerString);
            if (compareStrings(userString, computerString)){
                correct++;
            }  
            
            
        }System.out.println("You got " + correct + " right");
        // TODO code application logic here
    }
    
    public static int generate(){
    
      Random rand = new Random();
        
        int colornum = rand.nextInt(5);
        
        return colornum;
    
    
}    public static String convertNumToString(int num){
    
    if (num == 0){
        return "Red";
    }
        else if (num == 1){
            return "Green";
            
        }
        else if (num == 2){
            return "Blue";
        }
        else if (num == 3){
            return "Orange";
            
        }
        else {
            return "Yellow";
        }
}
      public static void questionUser(){
          System.out.println("I am thinking of a color");
          System.out.println("Is it Red,Green,Blue,Orange, or Yellow?");
                  
      }
      
      public static String getInputString(){
          
          Scanner input = new Scanner(System.in);
         
         String inputString = input.nextLine();
         
          while (! ((inputString.equals("Yellow")|| inputString.equals("Blue") || inputString.equals("Red") || inputString.equals("Green"))
                 || inputString.equals("Orange"))){
             System.out.println("invalid color, Try again");
             inputString = input.nextLine();
         }
             
   
      return inputString;
      }
      
      
      public static boolean compareStrings(String stringOne, String stringTwo){
          
          return stringOne.equals(stringTwo);
}
          
      
}
    

