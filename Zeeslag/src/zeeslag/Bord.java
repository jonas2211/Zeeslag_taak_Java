/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeeslag;
import java.util.ArrayList;
/**
 *
 * @author Bavo, Jonas, Rens
 */
public class Bord {
    private Boot bootModel;
    private ArrayList<Boot> Botenlist = new ArrayList<>();
    
    
    
    private int[][] vliegdekschip = {   //coordinaten vliegdekschip
         
        {3, 3}, {3, 4}, {3, 5}, {3,6}, {3,7}
        //bv. {Boot.getX,Boot.getY}, ....
    };
    private int[][] slagschip  = {   //coordinaten slagschip
         
        {1, 3}, {1, 4}, {1, 5}, {1,6}
    };
    private int[][] duikboot = {   //coordinaten onderzeeer
         
        {5, 3}, {5, 4}, {5, 5}
    };
    private int[][] torpedobootjager = {   //coordinaten torpedoboojager
         
        {7, 3}, {7, 4}, {7, 5}
    };
    private int[][] patrouilleschip = {   //coordinaten Patrouilleschip
         
        {9, 3}, {9, 4}
    };
    
    /*
    private int[][] CoBoten = {   //coordinaten neus
         
        {3, 1}, {3, 3}, {3, 5}, {3, 7}, {3, 9},
        {4, 1}, {4, 3}, {4, 5}, {4, 7}, {4, 9},
                {5, 3}, {5, 5}, {5, 7}, {5, 9},
                                {6, 7}, {6, 9},
                                        {7, 7},

        //bv. {Boot.getX,Boot.getY}, ....
    };
    
       
    
    //de coordinaten die hierboven nu staan moeten uiteindelijk vervangen
    //door de coordinaten die de speler kiest
    */
   
    
    public Bord(){
        for (int i = 0; i < vliegdekschip.length; i++)
        {
            Botenlist.add(new Boot (vliegdekschip[i], Type.VLIEGDEKSCHIP));
        }

        for (int i = 0; i < slagschip.length; i++)
        {
            Botenlist.add(new Boot (slagschip[i], Type.SLAGSCHIP));
        }
        
        for (int i = 0; i < duikboot.length; i++)
        {
            Botenlist.add(new Boot (duikboot[i], Type.DUIKBOOT));
        }
        
        for (int i = 0; i < torpedobootjager.length; i++)
        {
            Botenlist.add(new Boot (torpedobootjager[i], Type.TORPEDOBOOTJAGER));
        }
        
        for (int i = 0; i < patrouilleschip.length; i++)
        {
            Botenlist.add(new Boot (patrouilleschip[i], Type.PATROUILLESCHIP));
        }

        /*
        * for-loops voor bootdelen
        *
        
        for (int i =0; i<bootBody.length; i++){
            boten.add(new Boot (5, bootBody[i], Orientatie.VERTICAAL));
        }
        
        for (int i =0; i<bootNeus.length; i++){
            boten.add(new Boot (5, bootNeus[i], Orientatie.VERTICAAL, Soort.NEUS));
        }
        for (int i =0; i<bootStaart.length; i++){
            boten.add(new Boot (5, bootStaart[i], Orientatie.VERTICAAL, Soort.NEUS));
        }
        */
    }

  
    //getters
    public Boot getBootOn(int row, int column) {
        for (Boot bootModel : Botenlist) {
            if (bootModel.getRow() == row && bootModel.getColumn() == column) {
                return bootModel;
            }            
            
            //boot op meegegeven rij en kolom
        }
        return null;
            //geen boot op gegeven rij en kolom
    }
    
    public ArrayList<Boot> getBoten() {
        return Botenlist;
    }

    public Boot getGeselecteerdeBoot() {
        return bootModel;
    }
    
    //boolean methodes
    public boolean isBootGeselecteerd() {
        return (bootModel!= null);
    }
    
    public boolean selecteerBootOn(int row, int column) {
        boolean onBoot = false;
        //eerst boot niet geselecteerd
        bootModel = this.getBootOn(row, column);
        if (bootModel != null) {
            onBoot = true;
            //als er niet geen boot wordt geselecteerd(boot wel geselecteerd),zet onBoot is waar
        }
        return onBoot;
    }
    
    public void selecteerBootOff(){
        bootModel = null;
    }
    
    public boolean verplaatsBootNaar(int row, int column) {
        boolean onBoot = false;
        
        if (bootModel != null && isPlaatsVrij(bootModel.getRow(), bootModel.getColumn(), row, column) && (getBootOn(row, column)== null || getBootOn(row, column) == bootModel)){
            onBoot = getBootOn(bootModel.getRow(), bootModel.getColumn()).verplaatsNaar(row, column);
        }
        if(onBoot){
            bootModel = null;
        }
        return onBoot;
    }
    
    private boolean isPlaatsVrij(int startRow, int startColumn, int endRow, int endColumn) {
        for (int i = Math.min(startRow, endRow) + 1; i <= Math.max(startRow, endRow) - 1; i++) {
            if (getBootOn(i, startColumn) != null) {
                return false;
            }
        }
        for (int j = Math.min(startColumn, endColumn) + 1; j <= Math.max(startColumn, endColumn) - 1; j++) {
            if (getBootOn(startRow, j) != null) {
                return false;
            }
        }
        return true;
    }

}




   
