/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeeslag;

/**
 *klasse van eigenschappen patrouilleschip
 * @author Rens Remans
 */


public class Patrouilleschip extends Boot{
    private int size;
    private boolean gezonken;
    private Orientatie o;
    private int rotatieHoek;
    private int column;
    private int row;
    private Type type;
    
    public Patrouilleschip(int size, int column, int row, Orientatie o, Type type) {
        super(size, column, row, o, type);
        this.size = 2;
        gezonken = false;
        levens = size;
        this.row = row;
        this.column = column;
        this.rotatieHoek = 0;
        this.o = Orientatie.HORIZONTAAL;
        this.type = Type.PATROUILLESCHIP;
    }
}
   
    

