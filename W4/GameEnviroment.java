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
import java.util.ArrayList;
public class GameEnviroment {
    private double width;
    private double height;
    private ArrayList<GamePlayer> ArrPlayer = new ArrayList<GamePlayer>();
    private ArrayList<GameEnemy> ArrEnemy = new ArrayList<GameEnemy>(); 

    public GameEnviroment(){
    }

    public GameEnviroment(double width, double height){
        this.width=width;
        this.height=height;
    }

    public void addPlayer(GamePlayer newPlayer){
        ArrPlayer.add(newPlayer);
    }

    public void removePlayer(GamePlayer removeplayer){
        ArrPlayer.remove(removeplayer);
    }

    public void getAllPlayer(){
        System.out.println("All of Player: "+ ArrPlayer);
        // for (int w=0; w < arrPlayer.size(); w++) {
        //     System.out.println(arrPlayer.get(w));
        //     System.out.println(",");
        // }
    }
    public void addEnemy(GameEnemy newEnemy){
        ArrEnemy.add(newEnemy);
    }
    
    public void removeEnemy(GameEnemy removeenemy){
        ArrEnemy.remove(removeenemy);
    }

    public void getAllEnemy(){
        System.out.println("All of Enemy: "+ ArrEnemy);
        // for (int q=0; q < arrEnemy.size(); q++) {
        //     System.out.println(arrEnemy.get(q));
            
        // }
    }

    public void Interaction(){
        if (ArrPlayer == null|ArrEnemy == null){
            System.out.println("Player or Enemy not sets");
        }
        for(int i = 0; i < ArrPlayer.size(); i++){
            for(int j = 0; j < ArrEnemy.size(); j++){
                if (ArrPlayer.get(i).getY() != ArrEnemy.get(j).getY()){
                    System.out.println("Player: " + ArrPlayer.get(i) + " and Enemy: " + ArrEnemy.get(j) + " not in the same Y position");
                }
                if (EuclideanDistance(ArrPlayer.get(i).getX(), ArrPlayer.get(i).getY(), ArrEnemy.get(j).getX(), ArrEnemy.get(j).getY()) < 2){
                    System.out.println("Player: " + ArrPlayer.get(i) + " Attacked");
                    System.out.println("Enemy: " + ArrEnemy.get(j) + " loses");
                    removeEnemy(ArrEnemy.get(j));
                }
                else{
                    System.out.println("==> Player "+ ArrPlayer.get(i));
                    ArrPlayer.get(i).runnn((int)Math.ceil(Math.random()*10));
                    System.out.println("\ncurrent x position =  " + ArrPlayer.get(i).getX() +" <==");
                }
            }
        }
    }

    public double EuclideanDistance(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}
