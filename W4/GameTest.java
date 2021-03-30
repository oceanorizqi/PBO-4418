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
public class GameTest {
    public static void main(String[] args){
        GamePlayer demo = new GamePlayer();
        demo.SetDimension(12, 12);
        demo.SetPosition ( 67, 76);
        System.out.println("position Playa= "+demo.getX()+","+demo.getY());
        demo.runnn(12);
        System.out.println("position Playa= "+demo.getX()+","+demo.getY());
        GamePlayer demo2 =new GamePlayer();
        demo2.SetDimension(12, 32);
        demo2.SetPosition(10, 10);

        System.out.println("\n");
        
        GameEnemy monster=new GameEnemy();
        monster.SetDimension(12, 32);
        monster.SetPosition(10, 10);
        System.out.println("position Enemy= "+monster.getX()+","+monster.getY());
        monster.runnn();
        
        System.out.println("=====================================================\n");
        GameEnviroment scane = new GameEnviroment();
        scane.addPlayer(demo);
        scane.addPlayer(demo);
        scane.addPlayer(demo2);
        scane.getAllPlayer();
        scane.removePlayer(demo);
        scane.getAllPlayer();
        scane.addEnemy(monster);
        /*scane.getAllEnemy();*/
        scane.Interaction();
    }
}
