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
public class Torpedobootjager extends Boot{
    private String naam;
    private int size;
    private boolean gezonken;
    private Orientatie orientatie;
    private int rotatieHoek;
    private int column;
    private int row;
    private Type type;
    
    public Torpedobootjager(String naam, int size, int column, int row, Orientatie o, Type type) {
        super(naam, column, row, o, type);
        naam = "onderzeeer";
        size = 3;
        gezonken = false;
        levens = size;
        this.row = row;
        this.column = column;
        orientatie = Orientatie.HORIZONTAAL;
<<<<<<< HEAD
    }
}
=======
        
    }
    
 
    
    }
    
    

>>>>>>> 2d615297995df2599a099ad2799c708b788d6151
