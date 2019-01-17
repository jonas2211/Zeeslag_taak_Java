/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeeslag;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * klasse met alle algemene datamembers voor boot
 *
 * @author Bavo, Jonas, Rens
 */
public class Boot {

    private int size;
    private int levens;
    private boolean gezonken;
    private int row, column;
    private Orientatie orientatie;
    private int rotatieHoek;
    private Type type;   
    
    /**
     * constructor boot
     * @param row
     * @param column
     * @param type
     * @param orientatie 
     */
    public Boot(int row, int column, Type type, Orientatie orientatie) {
        this.row = row;
        this.column = column;
        this.type = type;
        if (type == Type.DUIKBOOT) {
            this.size = 3;
        } else if (type == Type.VLIEGDEKSCHIP) {
            this.size = 5;
        } else if (type == Type.SLAGSCHIP) {
            this.size = 4;
        } else if (type == Type.PATROUILLESCHIP) {
            this.size = 2;
        } else if (type == Type.TORPEDOBOOTJAGER) {
            this.size = 3;
        } else {
            this.gezonken = false;
        }
        this.orientatie = orientatie;
    }

    /**
     * getters
     */
    
    /**
     * get type van boot
     *
     * @return type van boot
     */
    public Type getType() {
        return type;
    }

    /**
     * get coordinaten boot enkel vakje
     *
     * @return de coordinaten
     */
    public int[] getCoordinaten() {
        int[] c = {this.row, this.column};
        return c;
    }

    /**
     * get rij van boot 
     *
     * @return rij boot
     */
    public int getRow() {
        return row;
    }

    /**
     * get kolom van boot
     *
     * @return kolom boot
     */
    public int getColumn() {
        return column;
    }

    /**
     * get size boot
     *
     * @return size van boot
     */
    public int getSize() {
        return size;
    }

    /**
     * get levens boot
     *
     * @return levens
     */
    public int getLevens() {
        return levens;
    }

    /**
     * get orientatie boot
     *
     * @return orientatie van boot
     */
    public Orientatie getOrientatie() {
        return orientatie;
    }

    /**
     * get rotatiehoek
     *
     * @return de rotatiehoek van boot
     */
    public int getRotatieHoek() {
        return rotatieHoek;
    }

    /**
     * get alle coordinaten
     * @return elke coordinaat van elk vakje van de boot
     */
    public int[][] getAlleCoordinaten() {
        int[][] alleCoordinaten = new int[size][2];
        for (int i = 0; i < size; i++) {
            if (orientatie == Orientatie.VERTICAAL) {
                alleCoordinaten[i][0] = row + i;
                alleCoordinaten[i][1] = column;
            } else if (orientatie == Orientatie.HORIZONTAAL) {
                alleCoordinaten[i][0] = row;
                alleCoordinaten[i][1] = column + i;
            }
        }
        return alleCoordinaten;
    }

    /* 
    *setters en andere methodes
     */

    /**
     * stel de size in
     *
     * @param size 
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * verander boot naar gezonken
     *
     * @param gezonken
     */
    public void setGezonken(boolean gezonken) {
        this.gezonken = gezonken;
    }

    /**
     * boot geraakt, gezonken of levens--
     */
    public void Geraakt() {
        if (levens == 0) {
            gezonken = true;
            System.out.println("gezonken");
        } else {
            levens--;
        }
    }

    /**
     * verander de coordinaten van boot
     *
     * @param row
     * @param column
     */
    private void setCoordinaten(int row, int column) {
        this.row = row;
        this.column = column;
    }

    /**
     * kunnen we de boot verplaatsen?
     *
     * @param row
     * @param column
     * @return gaat of gaat niet
     */
    public boolean verplaatsNaar(int row, int column) {
        if (this.row == row || this.column == column) {
            setCoordinaten(row, column);
            return true;
            //stel de nieuwe kolom en/of nieuwe rij in als rij en/of kolom;
        } else {
            return false;
        }
    }

    /**
     * roteer de boot 
     */
    public void roteer() {
        if (orientatie == Orientatie.HORIZONTAAL) {
            orientatie = Orientatie.VERTICAAL;
        } else {
            if (orientatie == Orientatie.VERTICAAL) {
                orientatie = Orientatie.HORIZONTAAL;
            }
        }
    }

    /**
     * is de boot levend?
     *
     * @return levend of niet
     */

    public boolean levend() {
        if (levens > 0) {
            return true;
        }
        return false;
    }

    /**
     * is gezonken
     * @return gezonken
     */
    public boolean isGezonken() {
        return gezonken;
    }

}