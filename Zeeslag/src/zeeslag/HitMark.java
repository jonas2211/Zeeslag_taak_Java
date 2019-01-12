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
public class HitMark {
    private boolean hit;
    private Boot boot;
    private int x,y;
// x en y coordinaten zijn vaag
    public HitMark(int x, int y) {
        hit = true;
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
    
 

