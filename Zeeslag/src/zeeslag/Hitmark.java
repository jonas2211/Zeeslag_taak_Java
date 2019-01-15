/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeeslag;

//import java.util.ArrayList;

/**
 *
 * @author Bavo
 */

public class Hitmark {

    private boolean hit;
    private int row,column;
     //private Boot bootModel;
   //private ArrayList<Boot>boten;
   // private Speler spelerModel;
    
// x en y coordinaten zijn vaag
    public Hitmark(int row, int column, boolean hit) {
        this.hit = hit;
        this.row = row;
        this.column = column;
    }
    
    public int[] CoordinatenPaar() {
        int[] c = {this.row, this.column};
        return c;
    }
    
    //DOELSTELLINGEN FUNCTIE HITMARKER:
    //    - als de coordinaten van de rij en kolom van waar de speler klikt overeenkomen 
    //      met de coordinaten van een boot, moet het vak waar de hit is gebeurt rood worden.
    
    /*public void setHitmark(int row, int column){
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
    }*/


    //getters
    public boolean isHit() {
        return hit;
    }

    
    
    /*public Boot getBoot() {
        return bootModel;
    }

    public Speler getSpelerModel() {
        return spelerModel;
    }*/
   
    /*
    //probeersel, wss fout
    public getHitMarks(){
        for (Slagschip:Boot boot);{
            if (x == Slagschip.row ){
                
            }
    }
    */

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}
    
 

