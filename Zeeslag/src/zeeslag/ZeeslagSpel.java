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

    public Bord getBord() {
        return bord;
    }

    public Speler getSpeler() {
        return huidigeSpeler;
    }

    
  
    
    public void eindeBeurt(){
        if (huidigeSpeler instanceof SpelerEcht){
            huidigeSpeler = computer;
        }
        else{
            huidigeSpeler = spelerEcht;
        }
    }
}
    

