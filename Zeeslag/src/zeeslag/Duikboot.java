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
public class Duikboot extends Boot{

    public Duikboot(String naam, int size, int x, int y, Orientatie o) {
        super(naam, size, x, y, o);
        naam = "onderzeeer";
        size = 3;
        gezonken = false;
        levens = size;
        x = x;
        y = y;
        orientatie o = Orientatie.HORIZONTAAL;
        
    }
    
 
    
    }
    
    

