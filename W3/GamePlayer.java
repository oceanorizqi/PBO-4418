/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngoding.issagame;

/**
 *
 * @author asus
 */
public class GamePlayer {
    private double width;
    private double height;
    private int PosX;
    private int PosY;
    
    GamePlayer(){
    }
    public GamePlayer(double width , double height , int PosX , int PosY){
    }
    public void SetDimension(double width , double height){
        this.width = width;
        this.height = height;
    }
    public void SetPosition(int PosX , int PosY){
        this.PosX = PosX;
        this.PosY = PosY;
    }
    public double width(){
        return this.width;
    }
    public double height(){
        return this.height;
    }
    public int getX(){
        return this.PosX;
    }
    public int getY(){
        return this.PosY;
    }
    public void runnn(){
        System.out.println("Playa is running ");
    }
    public void runnn(int IncX){
        IncX = PosX + IncX;
        System.out.println("Playa is still running... Last Position in " + IncX);
    }
}
