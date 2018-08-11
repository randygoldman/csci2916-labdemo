/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizgrading;

/**
 *
 * @author rgoldman
 */

 import java.util.Scanner;

import java.io.*;


public class QuizGrading {
    
    
    String [] correctanswers;
    String [] studentanswers;
    int lengtharray;
    static String teachersName = "Randy";
    
   public QuizGrading(String [] right, String [] input ){
       
       correctanswers = right;
       studentanswers = input;
       lengtharray = right.length;
   }
   
   public  int totalCorrect(){
       int numbercorrect = 0;
       for (int j = 0; j < lengtharray; j++ ){
           
       if (correctanswers[j].equals(studentanswers[j])){
           
           numbercorrect += 1;
           
       }    
       
   }
        return numbercorrect;
   }
   
    public int totalIncorrect(){
       int numberincorrect = 0;
       for (int j = 0; j < lengtharray; j++ ){
           
       if (!(correctanswers[j].equals(studentanswers[j]))){
           
           numberincorrect += 1;
           
       }    
       
   }
        return numberincorrect;
   }

    public int [] questionsMissed(){
        
         int numberincorrect= totalIncorrect();
        int [] missedquestions = new int [numberincorrect];
        for (int j = 0, k = 0; j < lengtharray; j++){
            
            if (!(correctanswers[j].equals(studentanswers[j]))){
           
           missedquestions[k++]= j + 1;
           
           }
       }     
        return missedquestions;
    }
    
    public boolean failed(){
        return totalCorrect() < .66*lengtharray;
        
    }
    
    public static String convert(int [] array){
        String result = "";
        for (int j = 0; j < array.length; j++){
           result += array[j] + " ";
           
        } return result;
    
    }
    
    public static boolean valid(String string){
        return string.matches("[ABCD]");
        
    }
    public String toString(){
        String result = "Teachers Name: " + teachersName + "\n";
        result += "correct answers:" + totalCorrect() + "\n";
        result += "incorrect answers:" + totalIncorrect() + "\n";
        result += "You " + (failed()? "failed": "passed") + " the exam\n";
        result += (totalIncorrect() == 0? "you got everything right": "you missed the following:\n" + convert(questionsMissed())) + "\n";
        
        return result;
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String [] correctanswers = {"B","D","A","C","A","C","D","B","C","A","D","A","B","D","A"};
        int currentlength = correctanswers.length;
        String [] studentanswers = new String [currentlength];
        
        for (int j = 0; j < currentlength; j++){
        
          
        
        System.out.println("Question " + (j+1) + ":" );
              String entry = input.nextLine().toUpperCase();
             while( !(valid(entry))){
                 
                 System.out.println("please answer with A,B,C, or D");
                 entry = input.nextLine().toUpperCase();
             }
              studentanswers[j] = entry;
                  
              }
        QuizGrading quizgrader = new QuizGrading(correctanswers, studentanswers);
        System.out.println(quizgrader);
        // TODO code application logic here
    }
    }
    
