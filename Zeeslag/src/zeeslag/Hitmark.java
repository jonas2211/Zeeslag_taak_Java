/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeeslag;

import java.util.ArrayList;

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
    
    //DOELSTELLINGEN FUNCTIE HITMARKER:
    //    - als de coordinaten van de rij en kolom van waar de speler klikt overeenkomen 
    //      met de coordinaten van een boot, moet het vak waar de hit is gebeurt rood worden.
    private Boot bootModel;
    private ArrayList<Boot>boten;
    private Speler spelerModel;
    
    
    public void hitmark(int row, int column){
        for(Boot bootModel : boten){
            if (bootModel.getRow() == row && bootModel.getColumn() == column){
                if (bootModel.getLevens() == 0){
                    bootModel.isGezonken();
                    System.out.println("gezonken");
                }
                else
                {
                    bootModel.Geraakt();
                }
            }
        }
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
    
 

