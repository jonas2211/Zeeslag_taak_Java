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
public class SpelerEcht extends Speler {

    public SpelerEcht(Bord bord) {
        super(bord);
        
    }
    public boolean isGezonken(Type ype){
        boolean gezonken = false; 
        
        for (Boot boot: bord.getBoten()){
            if(Boot.type == Type.VLIEGDEKSCHIP){
                if (boot.isGezonken()== false){
                    return false;
                }
                
            }else if( Boot.type == Type.SLAGSCHIP){
                if (boot.isGezonken()== false){
                    return false;
                }   
            }else if( Boot.type == Type.TORPEDOBOOTJAGER){
                if (boot.isGezonken()== false){
                    return false;
                }   
            }else if( Boot.type == Type.DUIKBOOT){
                if (boot.isGezonken()== false){
                    return false;
                }  
            }else if( Boot.type == Type.PATROUILLESCHIP){
                if (boot.isGezonken()== false){
                    return false;
                }
            }
        }
        return true;
    }
}


