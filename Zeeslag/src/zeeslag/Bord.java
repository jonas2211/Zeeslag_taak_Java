/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeeslag;
//import com.sun.xml.internal.bind.v2.runtime.Coordinator;
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
    //private Vakje vakje;
    private Hitmark hitmrk;
    private ArrayList<Hitmark> HitmarkList = new ArrayList<>();
    
    // moet er een klasse hitmark zijn of kunnen we een arraylist maken via klasse Bord voor hitmarks?

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
        
        
        
        //HitmarkList.add(new Hitmark(1, 1, true));
        /*
        * for-loops voor bootdelen
        *
        */
        
        
        
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
    public void klasseHitmark(){
    for(int[] b: bootModel.getAlleCoordinaten()){ //voor boot in botenlijst
            
                int row = b[0];
                int column = b[1];
                if(getRow()== bootModel.getRow() && getColumn() == bootModel.getColumn()){
                    HitmarkList.add(hitmrk );
                    hitmrk.isHit()=true;
                }// als x en y coo waar geschoten wordt gelijk is x en y coo vakje
                //hitmark.hit = true
                else
                {
                return;
                }
            }
        }
    
    
    public void schietenSpeler(int x, int y){
        row = x/30;
        column = y/30;
    }
    
    public int getRow(){
        return row;
    }
    
    public int getColumn(){
        return column;
    }
    
    
    public void schietenComputer(){
        row = (int)(Math.random())*10;
        column = (int)(Math.random())*10;
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
        Iterator<Boot> boten = bootModel.getBoten();
        while(boten.hasNext()){
            Boot coordinaten = boten.next();
            if (bootModel.getRow() == row && bootModel.getColumn() == column) {
                return bootModel;
            }            
            
            //boot op meegegeven rij en kolom
        }
        return null;
            //geen boot op gegeven rij en kolom
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
    /*
    public boolean setHitmark(int row, int column){
        Iterator<Boot> boten = bootModel.getBoten();
        int[][] alleCoo = bootModel.getAlleCoordinaten();
         while(boten.hasNext()){
            Boot coordinaten = boten.next();
            while(alleCoo.hasNext()){
                Boot alleCoordinaten = alleCoo.next();
                if (coordinaten == new int[] {row, column}){
                    HitmarkList.add(new Hitmark(row, column, true));
                    return true;
                }
            }
        }
         return false;
    }
    */
    /*
    public boolean sethitMark(int row, int column){
        for(Boot j : bootModel.getBoten()){
            for (int[] coordinaten : bootModel.getAlleCoordinaten()){
                if(coordinaten == new int[] {row,column}){
                    HitmarkList.add(new Hitmark(row, column, true));
                    return true;
                }
            }
        }
        return false;
    }    
*/

            /*if (bootModel.getRow() == row && bootModel.getColumn() == column){
                HitmarkList.add(new Hitmark(row, column));
                
                    bootModel.Geraakt();
            }*/
       
    

    public ArrayList<Hitmark> getHitmarkList() {
        return HitmarkList;
    }
    
    
    
}
    





   
