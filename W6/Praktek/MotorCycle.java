/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngoding.praktek;

/**
 *
 * @author asus
 */
public class MotorCycle extends MotorVehicle{
    int numGear = 4;
    
    public MotorCycle(){
    }
    public void setGearFoot (int numGear){
        this.numGear = numGear;
    }
    public int getGearFoot (){
        return this.numGear;
    }
}