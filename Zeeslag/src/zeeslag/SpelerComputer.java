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
       private Boot bootModel;
    public SpelerComputer(Bord bord) {
        super(bord);
        
        
    }
    public boolean isGezonken(Type type){
        boolean gezonken = false; 
        
        for (Boot boot: bord.getBoten()){
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
