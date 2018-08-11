package employee2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 *
 * @author rgoldman
 */
public class EmployeeAndProductionWorker {

    
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         ProductionWorker worker1 = new ProductionWorker("randy", 45774, "January 5th, 1962",1, 3.46);
         ProductionWorker worker2 = new ProductionWorker("nina",7792,"October 10, 1952",0 ,2.79);
         
         System.out.println(worker1);
         System.out.println(worker2);
    
        // TODO code application logic here
    }
    
}
