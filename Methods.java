/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;
import java.util.*;

/**
 *
 * @author rgoldman
 */
public class Methods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int number;
        int number2;
        System.out.println("Enter your favorite number ...");
        number = input.nextInt();
        System.out.println("Enter your second number...");
        number2 = input.nextInt();
        favnum(number);
        System.out.println("your sum is..." + sum(number,number2));
        int testscore1;
        int testscore2;
        int testscore3;
       
        System.out.println("what is your first score?");
        testscore1 = input.nextInt();
        System.out.println("what is your second score?");
        testscore2 = input.nextInt();
        System.out.println("what is your third score?");
        testscore3 = input.nextInt();
        System.out.println("your average is ..." + average(testscore1, testscore2, testscore3));
        System.out.println("your name is.." + givename());
        
        
                
                
    }
    public static void favnum(int num){
        
        System.out.println("your favorite number is " + num);
        
    }
    public static int sum(int num1, int num2){
        
       int sum;
       sum = num1 + num2;
       
       return sum;
       /** @return
        
        */
    }
       public static double average(int num1, int num2, int num3){
           
           double average;
           
           average = (num1 + num2 + num3)/3;
           return average;
           
       }
       
       public static String givename() {
           
           System.out.println("What is your name?");
          
           String name;
           Scanner scanhere = new Scanner(System.in);
           name = scanhere.nextLine();
           return name;
           
           
       }
       }

       
        
    
    
    

