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
public class Vliegdekschip {
    private String naam;
    private int size;
    private boolean gezonken;
    private Orientatie orientatie;
    private int rotatieHoek;

    public Vliegdekschip(String naam, int size, int x, int y, Orientatie o) 
    {
        super(naam,size, x, y, o);
        gezonken = false;
        this.naam = "Vliegdekschip";
        this.size = 5;
    }
}
