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
public class owner {
   
    private String name;
    private String icNo;
    
    public owner(String name, String icNo){
        this.name = name;
        this.icNo = icNo;
    }
    
    public String toString(){
        return String.format("%-13s %-14s",this.name, this.icNo);
    }
}

