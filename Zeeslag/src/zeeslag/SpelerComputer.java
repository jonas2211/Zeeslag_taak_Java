/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeeslag;

/**
 *
 * @author Rens Remans
 */
public class SpelerComputer extends Speler {

    public SpelerComputer(Bord bord) {
        super(bord);
        
    }
    public boolean isGezonken(){
        boolean gezonken = false; 
        for (Boot boot: bord.getBoten()){
            if (boot.isGezonken()== false){
                return false;
            }
        }
        return true;
    }
}