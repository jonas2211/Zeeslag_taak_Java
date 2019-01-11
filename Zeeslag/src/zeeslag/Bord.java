/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeeslag;
import java.awt.Color;
import java.util.ArrayList;
/**
 *
 * @author Bavo, Jonas, Rens
 */


    

public class Bord {
    private Boot boot;
    private Boot geselecteerdeBoot;
    
    /*
    
    public Bord(){
    boten = new ArrayList<>();
    boten.add(vliegdekschip); // lengte5
    boten.add(slagschip); //lengte4
    boten.add(duikboot); //lengte3
    boten.add(torpedobootjager); //lengte3
    boten.add(Patrouilleschip); //lengte2
    }
    */
        
    private int[][] bootNeus = {   //coordinaten neus
         
        {3, 1}, {3, 3}, {3, 5}, {3,7}, {3,9}
        //bv. {Boot.getX,Boot.getY}, ....
    };
    private int[][] bootBody  = {   //coordinaten Body
         
        {4,3}, {4, 5}, {4,7}, {5, 7}, {4, 9}, {5,9}, {6,9}
    };
    private int[][] bootStaart = {   //coordinaten Staart
    
        
        {4, 1}, {5, 3}, {5, 5}, {6, 7}, {6, 9}
    };
    
    private ArrayList<Boot> boten;
    public Bord(){
        
        for (int i =0; i<bootBody.length; i++){
            boten.add(new Boot (5, bootBody[i], Orientatie.VERTICAAL));
        }
        
        for (int i =0; i<bootNeus.length; i++){
            boten.add(new Boot (5, bootNeus[i], Orientatie.VERTICAAL, Soort.NEUS));
        }
        for (int i =0; i<bootStaart.length; i++){
            boten.add(new Boot (5, bootStaart[i], Orientatie.VERTICAAL, Soort.NEUS));
        }
    }
        
    
    
    /*
    private int[][] torpedobootjager = {   //coordinaten torpedoboojager
         
        {7, 3}, {7, 4}, {7, 5}
    };
    private int[][] Patrouilleschip = {   //coordinaten Patrouilleschip
         
        {9, 3}, {9, 4}
    };
    //de coordinaten die hierboven nu staan moeten uiteindelijk vervangen
    //door de coordinaten die de speler kiest
        */

    /*
    public Boot Raak(int row, int column) {
        for (Boot b : boten) {
            if (b.getRaw() == row && b.getColumn() == column) {
                return b;
            }
        }
*/
  
    //getters
    public Boot getBootOn(int row, int column) {
        for (Boot boot : boten) {
            if (boot.getRow() == row && boot.getColumn() == column) {
                return boot;
            }            
            
            //boot op meegegeven rij en kolom
        }
        return null;
            //geen boot op gegeven rij en kolom
    }
    
    public Boot getGeselecteerdeBoot() {
        return geselecteerdeBoot;
}
   
    public boolean isBootGeselecteerd() {
        return (geselecteerdeBoot!= null);
    }
    
    public boolean selecteerBootOn(int row, int column) {
        boolean onBoot = false;
        //eerst boot niet geselecteerd
        geselecteerdeBoot = this.getBootOn(row, column);
        if (geselecteerdeBoot != null) {
            onBoot = true;
            //als er niet geen boot wordt geselecteerd(boot wel geselecteerd),zet onBoot is waar
        }
        return onBoot;
    }
}




   
