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
public class Speler {
    Bord bord;
    private int spelerLevens;
    
    
    public Speler(Bord bord){
        this.bord=bord;
        //spelerLevens=
    }
    
    //getters

    public int getSpelerLevens() {
        return spelerLevens;
    }
    
    public ArrayList<Boot> getBoten(){
        return bord.getBoten();
        
        
        
        
        
    }
    
    
}
