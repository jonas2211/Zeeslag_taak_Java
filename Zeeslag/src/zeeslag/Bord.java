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
    //private int boten = 5;
    private int row, column;
    private Boot bootModel;
    //private Vakje vakje;
    private Hitmark hitmrk;
    private ArrayList<Hitmark> HitmarkList = new ArrayList<>();
    
    
   
    
    public Bord(){
        //this.tegenstander =tegenstander;
        //this.row = bootModel.getRow();
        //this.column = bootModel.getColumn();
    }
    
    /**
     * hitmark
     */
    public void klasseHitmark(){
    for(int[] b: bootModel.getAlleCoordinaten()){ //voor boot in botenlijst
            
                int row = b[0];
                int column = b[1];
                if(getRow()== bootModel.getRow() && getColumn() == bootModel.getColumn()){
                    HitmarkList.add(hitmrk );
                    //hitmrk.isHit()=true;
                }
                else
                {
                return;
                }
            }
        }
    
    
    /**
     * get rij
     * @return rij
     */
    public int getRow(){
        return row;
    }
    /**
     * get kolom
     * @return kolom
     */
    public int getColumn(){
        return column;
    }
    
    
    
  
    //getters
    
    /**
     * get boot op deze coordinaat
     * @param row
     * @param column
     * @return deze boot of null
     */
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
    
    
    /**
     * get hitmarks van schoten
     * @return lijst van hitmarks
     */
    public Iterator<Hitmark> getHitmarks(){
        return HitmarkList.iterator();
    }
    /**
     * get geselecteerde boot
     * @return deze boot
     */
    public Boot getGeselecteerdeBoot() {
        return bootModel;
    }
    
    //boolean methodes
    
    /**
     * boot geselecteerd
     * @return als een boot geselecteerd is
     */
    public boolean isBootGeselecteerd() {
        return (bootModel!= null);
    }
    /**
     * is een boot geselecteerd?
     * @param row
     * @param column
     * @return op boot of niet op boot
     */
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
    
    /**
     * boot niet meer geselecteerd
     */
    public void selecteerBootOff(){
        bootModel = null;
    }
    /**
     * verplaats de boot naar een andere coordinaat als deze vrij is
     * @param row
     * @param column
     * @return onBoot
     */
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
    /**
     * schieten op een coordinaat
     * @param x
     * @param y 
     */
    public void schietenSpeler(int x, int y){
        row = x/30;
        column = y/30;
    }
    /**
     * schot op random coordinaat door computer
     */
    public void schietenComputer(){
        row = (int)(Math.random())*10;
        column = (int)(Math.random())*10;
    }
    /**
     * is plaats vrij?
     * @param startRow
     * @param startColumn
     * @param endRow
     * @param endColumn
     * @return vrij of niet
     */
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
    
}
    





   
