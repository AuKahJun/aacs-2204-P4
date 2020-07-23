/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P4Q4;

/**
 *
 * @author akj_2
 */
public class cartype {
    
    private String make;
    private String model;
    private double capacity;
    
    public cartype(String make, String model, double capacity){
        this.make = make;
        this.model = model;
        this.capacity = capacity;
    }
    
    public String toString(){
        return String.format("%-10s %-10s %-10s", this.make, this.model, this.capacity);
    }
}

