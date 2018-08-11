package employee2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rgoldman
 */
public class Employee {
    
    String name;
    int number;
    String date;
    
    public Employee( String name, int number, String date){
        
        this.name = name;
        this.number = number;
        this.date = date;
         
    }
    
    public void Employee(){
        
        name = "";
        number = 0;
        date = "";
    }
    
    public int getnumber(){
        
        return number;
    }
    
    public String getname(){
        
        return name;
        
    }
    
    public String getdate(){
        
        return date;
    }
    public void setdate(String date){
            this.date = date;
           
    }
    
    public void setname(String name){
        
        this.name = name;
    }
    
    public void setnumber(int number){
        
        this.number = number;
    }
    
    public String toString(){
        
         return "name:  " + name + " idnumber: " + number + " date: " + date;
        
    }
             

    
    
}
