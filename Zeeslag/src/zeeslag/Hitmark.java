/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeeslag;

//import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Bavo, Jonas, Rens
 */
public class Hitmark {

    private boolean hit;
    private int row, column;
    //private Boot bootModel;
    //private ArrayList<Boot>boten;
    // private Speler spelerModel;

/**
 * constructor Hitmark
 * @param row
 * @param column
 * @param hit 
 */
    public Hitmark(int row, int column, boolean hit) {
        this.hit = hit;
        this.row = row;
        this.column = column;
    }
    /**
     * get coordinaten van een vakje
     * @return deze coordinaten
     */
    public int[] getCoordinatenPaar() {
        int[] c = {this.row, this.column};
        return c;
    }

    //getters
    
    /**
     * is geraakt?
     * @return geraakt
     */
    public boolean isHit() {
        return hit;
    }

    
    /**
     * get rij hitmark
     * @return rij hitmark
     */
    public int getRow() {
        return row;
    }
    /**
     * get kolom hitmark
     * @return kolom hitmark
     */
    public int getColumn() {
        return column;
    }
}
