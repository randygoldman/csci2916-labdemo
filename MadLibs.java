/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package madlibs;

import java.util.Scanner;

import java.util.Random;

import java.io.*;



/**
 *
 * @author rgoldman
 */
public class MadLibs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        File inputfile = new File("madlibs11.txt");
        Scanner input = new Scanner(inputfile);
        
        while(input.hasNext()){
            
            
         
            
            String nextline  = input.nextLine();
            String[] nextwordsequence1 = nextline.split(" ");
            for (int j = 0; j < nextwordsequence1.length;j++){
                
                String word = nextwordsequence1[j];
                switch (word){
                    
                    case "_adjective_":
                        word = getadjective();
                        break;
                    case "_noun_":
                        word = getnoun();
                        break;
                        
                    case "_verb_":
                        word = getverb();
                        break;
                        
                    case "_animal_":
                        word = getanimal();
                        break;
                        
                    case "_exclamation_":
                        word = getexclamation();
                        break;
                        
                    case "_adverb_":
                        word = getadverb();
                        break;
                
            }  System.out.print(word + " ");
            
           
                    
               
                
            }System.out.println();
            
            
        } input.close();
    }
    
    public static String getexclamation(){
        
    String[] exclamationarray =  {"oops","oh my goodness", "yikes","jesus christ","help me", "oh dear"};
    Random random1 = new Random();
    int exint = random1.nextInt(6);
    String exclamation = exclamationarray[exint];
    return exclamation;
     }
    
    
    public static String getanimal(){
        
        String[] animalarray = {"dog","cat","horse","leopard","elephant","owl"};
        Random random2 = new Random();
    int anint = random2.nextInt(6);
    String animal = animalarray[anint];
    return animal;
    }
    
    public static String getverb(){
        
        String[] verbarray = {"run","swim","eat","laugh","jump","fall"};
        Random random3 = new Random();
    int vint = random3.nextInt(6);
    String verb = verbarray[vint];
    return verb;
    }
    
    public static String getadjective(){
        
        String[] adjectivearray = {"happy","sad","confusing","erudite","bright","silly"};
        Random random4 = new Random();
    int adjint = random4.nextInt(6);
    String adjective = adjectivearray[adjint];
    return adjective;
    }
    
    public static String getnoun(){
        
        String[] nounarray = {"tree","sun","moon","building","telephone","chair"};
        Random random5 = new Random();
    int nint = random5.nextInt(6);
    String noun = nounarray[nint];
    return noun;
}
     public static String getadverb(){
        
        String[] adverbarray = {"sadly","aggressively","briskly","slowly","recklessly","merrily"};
        Random random6 = new Random();
    int advint = random6.nextInt(6);
    String adverb = adverbarray[advint];
    return adverb;
    }
}
