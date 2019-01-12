/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeeslag;

/**
 *
 * @author Bavo
 */

public class Hitmark {

    private boolean hit;
    private Boot boot;
    private int x,y;
// x en y coordinaten zijn vaag
    public Hitmark(int x, int y) {
        hit = false;

        this.x = x;
        this.y = y;
    }
    


    //getters
    
    
    public boolean isHit() {
        return hit;
    }

    public Boot getBoot() {
        return boot;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

   
    /*
    //probeersel, wss fout
    public getHitMarks(){
        for (Slagschip:Boot boot);{
            if (x == Slagschip.row ){
                
            }
    }
    */
}
    
 

