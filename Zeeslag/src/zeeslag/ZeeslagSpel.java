/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeeslag;

import java.util.ArrayList;

/**
 *
 * @author jonas
 */
public class ZeeslagSpel {
    
    private Bord bord;
    private Speler huidigeSpeler;
    private SpelerEcht spelerEcht;
    private SpelerComputer computer;
    

    public ZeeslagSpel() {
        this.start();
    }
    
    public void start(){
        this.bord = new Bord();
        this.spelerEcht = new SpelerEcht(bord);
        this.computer = new SpelerComputer(bord);
        this.huidigeSpeler = spelerEcht;
    }
    //getters
    public Bord getBord() {
        return bord;
    }

    public Speler getHuidigeSpeler() {
        return huidigeSpeler;
    }

    public SpelerEcht getSpelerEcht() {
        return spelerEcht;
    }

    public SpelerComputer getComputer() {
        return computer;
    }
    
    
    //andere methodes
    public boolean isBootGeselecteerd() {
         return bord.isBootGeselecteerd();
     }
     
    public boolean verplaatsBootNaar(int row, int column){
        return bord.verplaatsBootNaar(row, column);
    }
    
     public boolean selecteerBootOn(int row, int column) {
         return bord.selecteerBootOn(row, column);
     }
    
     public void selecteerBootOff(){
         bord.selecteerBootOff();
     }
 
     
    //methode spelerwissel
    public void eindeBeurt(){
        if (huidigeSpeler instanceof SpelerEcht){
            huidigeSpeler = computer;
        }
        else{
            huidigeSpeler = spelerEcht;
        }
    }
    
    // eindespelchecker wie heeft gewonnen
    public boolean Spelafgelopen(){
        if (spelerEcht.isGezonken(Type.VLIEGDEKSCHIP) ==true && spelerEcht.isGezonken(Type.SLAGSCHIP)== true && spelerEcht.isGezonken(Type.TORPEDOBOOTJAGER)==true && spelerEcht.isGezonken(Type.DUIKBOOT)==true && spelerEcht.isGezonken(Type.PATROUILLESCHIP)==true)
        {
            System.out.println(" De computer heeft gewonnen.");
            return true;
        }
        else if(computer.isGezonken(Type.VLIEGDEKSCHIP) ==true && computer.isGezonken(Type.SLAGSCHIP)== true && computer.isGezonken(Type.TORPEDOBOOTJAGER)==true && computer.isGezonken(Type.DUIKBOOT)==true && computer.isGezonken(Type.PATROUILLESCHIP)==true) 
        {
            System.out.println(" Gefeliciteert! Je hebt de computer verslagen!");
            return true;
        }
        else
        {
            return false;
                    
        }
    }
    
    
}

