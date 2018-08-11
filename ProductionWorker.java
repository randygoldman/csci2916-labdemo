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
public class ProductionWorker extends Employee {
    
    int shift;
    double payrate;
    
    
    public ProductionWorker(String name, int number, String date, int shift, double payrate){
        
        super(name,number,date);
        
       this.shift = shift;
       this.payrate = payrate;
        
        
        
        
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public double getPayrate() {
        return payrate;
    }

    public void setPayrate(double payrate) {
        this.payrate = payrate;
    }
    
    public String toString(){
        
        return super.toString() + "shift: " + shift + "payrate" + payrate;
    }
}
