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

// x en y coordinaten zijn vaag
    public Hitmark(int row, int column, boolean hit) {
        this.hit = hit;
        this.row = row;
        this.column = column;
    }

    public int[] getCoordinatenPaar() {
        int[] c = {this.row, this.column};
        return c;
    }

    //getters
    public boolean isHit() {
        return hit;
    }

    /*
    public Iterator<Boot> getBoten() {
        return bootModel.getBoten();
    }*/

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}
