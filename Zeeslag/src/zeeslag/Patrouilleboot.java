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
public class Patrouilleboot extends Boot {
    
    private String naam;
    private int size;
    private boolean gezonken;
    private Orientatie orientatie;
    private int rotatieHoek;

    public Patrouilleboot(String naam, int size, int x, int y, Orientatie o) {
        super(naam, size, x, y,o);
        
        naam = "Patrouilleboot";
        size = 3;
        gezonken = false;
        levens = size;
        x=x;
        y=y;
        orientatie = Orientatie.HORIZONTAAL;

    }
}
