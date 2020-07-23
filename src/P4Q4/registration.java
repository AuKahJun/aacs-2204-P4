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
public class registration {
    static int nextRegNo = 1001;
    private int regNo;
    private car car;
    private cartype carType;
    private owner owner;
    
    public registration(car car,cartype cartype, owner owner){
        regNo = nextRegNo;
        this.car = car;
        this.carType = carType;
        this.owner = owner;
        nextRegNo++;
    }
    
    public String toString(){
        return String.format ("%-7d %s %s %s",
                regNo, owner.toString(), car.toString(), carType.toString());
    }
}
