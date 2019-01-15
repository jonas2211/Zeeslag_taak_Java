/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeeslag;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author Bavo, Jonas, Rens
 */
public class Bord {
    private Boot bootModel;
    private ArrayList<Boot> Botenlist = new ArrayList<>();
    private ArrayList<Hitmark> HitmarkList = new ArrayList<>();
    
    // moet er een klasse hitmark zijn of kunnen we een arraylist maken via klasse Bord voor hitmarks?
    
    /**
     * coordinaten EchteSpeler
     */
    
    private int[][] vliegdekschip = {   //coordinaten vliegdekschip
         
        {0, 1}, {1, 1}, {2, 1}, {3,1}, {4,1}
        //bv. {Boot.getX,Boot.getY}, ....
    };
    private int[][] slagschip  = {   //coordinaten slagschip
         
        {8, 6}, {8, 7}, {8, 8}, {8,9}
    };
    private int[][] duikboot = {   //coordinaten onderzeeer
         
        {7, 3}, {8, 3}, {9, 3}
    };
    private int[][] torpedobootjager = {   //coordinaten torpedoboojager
         
        {4, 6}, {4, 7}, {4, 8}
    };
    private int[][] patrouilleschip = {   //coordinaten Patrouilleschip
         
        {5, 1}, {6, 1}
    };
    
    /**
     * coordinaten computer
     */
    //TODO;
    private int[][] vliegdekschipComp = {   //coordinaten vliegdekschip
         
        {0, 1}, {1, 1}, {2, 1}, {3,1}, {4,1}
        //bv. {Boot.getX,Boot.getY}, ....
    };
    private int[][] slagschipComp  = {   //coordinaten slagschip
         
        {8, 6}, {8, 7}, {8, 8}, {8,9}
    };
    private int[][] duikbootComp = {   //coordinaten onderzeeer
         
        {7, 3}, {8, 3}, {9, 3}
    };
    private int[][] torpedobootjagerComp = {   //coordinaten torpedoboojager
         
        {4, 6}, {4, 7}, {4, 8}
    };
    private int[][] patrouilleschipComp = {   //coordinaten Patrouilleschip
         
        {5, 1}, {6, 1}
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
        /*
        if(bootModel.getType() == Type.VLIEGDEKSCHIP){
            Botenlist.add(new Boot(bootModel.getType()));
        }
        */
    
        
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
        //HitmarkList.add(new Hitmark(1, 1, true));
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
    
    public Iterator<Boot> getBoten() {
        return Botenlist.iterator();
    }
    
    public Iterator<Hitmark> getHitmarks(){
        return HitmarkList.iterator();
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
    
    public boolean setHitmark(int row, int column){
        for(Boot bootModel : Botenlist){
            for (int[] coordinaten : bootModel.getAlleCoordinaten()){
                if (coordinaten == new int[] {row, column}){
                    HitmarkList.add(new Hitmark(row, column, true));
                    return true;
                }
            }
            /*if (bootModel.getRow() == row && bootModel.getColumn() == column){
                HitmarkList.add(new Hitmark(row, column));
                
                    bootModel.Geraakt();
            }*/
        }
        return false;
    }

    public ArrayList<Hitmark> getHitmarkList() {
        return HitmarkList;
    }
    
    
}
    





   
