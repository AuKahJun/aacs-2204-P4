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
public class car {
      

   private String plateNo;
   private String color;
   private int year;
   private cartype type;
   

    public car(String plateNo, String color, int year, cartype type){
        this.plateNo = plateNo;
        this.color = color;
        this.year = year;
        this.type = type;
    }
   
   public String toString(){
       return String.format("%-10s %-10s %-8d %s", 
                plateNo, color, year, type.toString());
   }
}

