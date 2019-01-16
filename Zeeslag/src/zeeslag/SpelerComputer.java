/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeeslag;

import java.util.Iterator;

/**
 *
 * @author Bavo, Jonas, Rens
 */
public class SpelerComputer extends Speler {
       private Boot bootModel;
       private Bord bordModel;
       
    public SpelerComputer(Bord bord) {
        super(bord);
    }
    
    //kijkt of boot van spelerComputer gezonken is
    public boolean isGezonken(Type type){
        boolean gezonken = false; 
        
        Iterator<Boot> botenList = bootModel.getBoten();
        while (botenList.hasNext()){
            Boot boot = botenList.next();
            if(bootModel.getType() == Type.VLIEGDEKSCHIP){
                if (boot.isGezonken()== false){
                    return false;
                }
                
            }else if(bootModel.getType() == Type.SLAGSCHIP){
                if (boot.isGezonken()== false){
                    return false;
                }   
            }else if(bootModel.getType() == Type.TORPEDOBOOTJAGER){
                if (boot.isGezonken()== false){
                    return false;
                }   
            }else if(bootModel.getType() == Type.DUIKBOOT){
                if (boot.isGezonken()== false){
                    return false;
                }  
            }else if(bootModel.getType() == Type.PATROUILLESCHIP){
                if (boot.isGezonken()== false){
                    return false;
                }
            }
        }
        return true;
            
        }
}
