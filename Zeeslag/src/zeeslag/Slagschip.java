/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeeslag;

/**
 *
 * @author Bavo, Jonas, Rens
 */
public class Slagschip extends Boot{
    private int size;
    private boolean gezonken;
    private Orientatie o;
    private int rotatieHoek;
    private int column;
    private int row;
    private Type type;
    
    public Slagschip(int size, int column, int row, Orientatie o, Type type) {
        super(size, column, row, o, type);
        this.size = 4;
        gezonken = false;
        levens = size;
        this.row = row;
        this.column = column;
        this.rotatieHoek = 0;
        this.o = Orientatie.HORIZONTAAL;
        this.type = Type.SLAGSCHIP;
    }
    
 
    
    }
    
    

