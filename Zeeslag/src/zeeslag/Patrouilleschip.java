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
<<<<<<< HEAD:Zeeslag/src/zeeslag/Patrouilleschip.java
public class Patrouilleschip extends Boot {
    
=======
public class Patrouilleboot extends Boot{
>>>>>>> 2d615297995df2599a099ad2799c708b788d6151:Zeeslag/src/zeeslag/Patrouilleboot.java
    private String naam;
    private int size;
    private boolean gezonken;
    private Orientatie orientatie;
    private int rotatieHoek;
<<<<<<< HEAD:Zeeslag/src/zeeslag/Patrouilleschip.java

    public Patrouilleschip(String naam, int size, int x, int y, Orientatie o) {
        super(naam, size, x, y,o);
        
        naam = "Patrouilleboot";
=======
    private int column;
    private int row;
    private Type type;
    
    public Patrouilleboot(String naam, int size, int column, int row, Orientatie o, Type type) {
        super(naam, column, row, o, type);
        naam = "onderzeeer";
>>>>>>> 2d615297995df2599a099ad2799c708b788d6151:Zeeslag/src/zeeslag/Patrouilleboot.java
        size = 3;
        gezonken = false;
        levens = size;
        this.row = row;
        this.column = column;
        orientatie = Orientatie.HORIZONTAAL;
        
    }
    
 
    
    }
    
    

