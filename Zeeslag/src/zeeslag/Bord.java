/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeeslag;
import com.sun.xml.internal.bind.v2.runtime.Coordinator;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author Bavo, Jonas, Rens
 */
public class Bord {
    private int boten = 5;
    private int row, column;
    private Boot bootModel;
    private Vakje vakje;
    private ArrayList<Boot> Botenlist = new ArrayList<>();
    private ArrayList<Hitmark> HitmarkList = new ArrayList<>();
    private ArrayList<Boot> BotenlistComp = new ArrayList<>();
    
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
         
        {8, 4}, {8, 5}, {8, 6}, {8, 7}, {8, 8}
        //bv. {Boot.getX,Boot.getY}, ....
    };
    private int[][] slagschipComp  = {   //coordinaten slagschip
         
        {2, 6}, {2, 7}, {2, 8}, {2,9}
    };
    private int[][] duikbootComp = {   //coordinaten onderzeeer
         
        {2, 2}, {3, 2}, {4, 2}
    };
    private int[][] torpedobootjagerComp = {   //coordinaten torpedoboojager
         
        {4, 7}, {5, 7}, {6, 7}
    };
    private int[][] patrouilleschipComp = {   //coordinaten Patrouilleschip
         
        {8, 0}, {9, 0}
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
   
    
    public Bord(boolean tegenstander){
        /*
        if(bootModel.getType() == Type.VLIEGDEKSCHIP){
            Botenlist.add(new Boot(bootModel.getType()));
        }
        
        this.tegenstander=tegenstander;
        this.row = bootModel.getRow();
        this.column = bootModel.getColumn();
        */
        /**
         * voeg boten van EchteSpeler toe aan Botenlist
         */
           
        for (int i = 0; i < (vliegdekschip.length)-4; i++)
        {
            Botenlist.add(new Boot (vliegdekschip[i], Type.VLIEGDEKSCHIP));
        }

        for (int i = 0; i < (slagschip.length)-3; i++)
        {
            Botenlist.add(new Boot (slagschip[i], Type.SLAGSCHIP));
        }
        
        for (int i = 0; i < (duikboot.length)-2; i++)
        {
            Botenlist.add(new Boot (duikboot[i], Type.DUIKBOOT));
        }
        
        for (int i = 0; i < (torpedobootjager.length)-2; i++)
        {
            Botenlist.add(new Boot (torpedobootjager[i], Type.TORPEDOBOOTJAGER));
        }
        
        for (int i = 0; i < (patrouilleschip.length)-1; i++)
        {
            Botenlist.add(new Boot (patrouilleschip[i], Type.PATROUILLESCHIP));
        }
        
        /**
         * voeg boten van computer toe aan botenlistComp
         */
        
        for (int i = 0; i < (vliegdekschipComp.length)-4; i++)
        {
            BotenlistComp.add(new Boot (vliegdekschipComp[i], Type.VLIEGDEKSCHIP));
        }

        for (int i = 0; i < (slagschip.length)-3; i++)
        {
            BotenlistComp.add(new Boot (slagschipComp[i], Type.SLAGSCHIP));
        }
        
        for (int i = 0; i < (duikbootComp.length)-2; i++)
        {
            BotenlistComp.add(new Boot (duikbootComp[i], Type.DUIKBOOT));
        }
        
        for (int i = 0; i < (torpedobootjagerComp.length)-2; i++)
        {
            BotenlistComp.add(new Boot (torpedobootjagerComp[i], Type.TORPEDOBOOTJAGER));
        }
        
        for (int i = 0; i < (patrouilleschipComp.length)-1; i++)
        {
            BotenlistComp.add(new Boot (patrouilleschipComp[i], Type.PATROUILLESCHIP));
        }
        
        
        
        //HitmarkList.add(new Hitmark(1, 1, true));
        /*
        * for-loops voor bootdelen
        *
        */
        for(Boot b: Botenlist){
            for(Vakje v:b.getAlleCoordinaten()){
                if(schotX== vakje.CoordinatenPaar().getRow()&&schotY==vakje.CoordinatenPaar().getColumn()){
                    HitmarkList.add(new Hitmark(hit=true));
                }
                else
                {
                    HitmarkList.add(new Hitmark(hit=false));
                }
            }
        }
        //Vakje, hit en schotX nog veranderen
        
        
        
        /*for (int i =0; i<bootBody.length; i++){
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
    /*
    public boolean zetSchip (Boot boot, int row, int column){
        int lengte = bootModel.getSize();
        
        if (bootModel.getOrientatie() == Orientatie.VERTICAAL){
            for(int i = row; i < row + lengte; i++){
                this.row = 
            }
        }
    }
    */
  
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
    





   
