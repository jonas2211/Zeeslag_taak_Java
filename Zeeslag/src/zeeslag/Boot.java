/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeeslag;

import java.util.Iterator;

/**
 *
 * @author Bavo, Jonas, Rens
 */
public class Boot {

    //private ZeeslagController controllerModel;
    private int size;
    int levens;
    private boolean gezonken;
    private int row, column;
    private Orientatie orientatie;
    private int rotatieHoek;
    private Type type;
    private Bord bordModel;
    private Hitmark hit;

    public Boot(int size, int column, int row, Orientatie o, Type type) {
        this.gezonken = false;
        this.type = type;
        this.size = size;
        this.levens = size;
        this.row = row;
        this.column = column;
        this.orientatie = o;
        rotatieHoek = 0;
    }

    public Boot(int[] coordinaten, Type type) {
        this.row = coordinaten[0];
        this.column = coordinaten[1];
        this.type = type;
        this.gezonken = false;
    }

    // getters
    public boolean isGezonken() {
        return gezonken;
    }

    public Type getType() {
        return type;
    }

    public int[] getCoordinaten() {
        int[] c = {this.row, this.column};
        return c;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int getSize() {
        return size;
    }

    public int getLevens() {
        return levens;
    }

    public Orientatie getOrientatie() {
        return orientatie;
    }

    public int getRotatieHoek() {
        return rotatieHoek;
    }

    //setters en andere methodes
    public void setSize(int size) {
        this.size = size;
    }

    public void setGezonken(boolean gezonken) {
        this.gezonken = gezonken;
    }

    public void Geraakt() {
        if (levens == 0) {
            gezonken = true;
            System.out.println("gezonken");
        } else {
            levens--;
        }
    }

    private void setCoordinaten(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public boolean verplaatsNaar(int row, int column) {
        if (this.row == row || this.column == column) {
            setCoordinaten(row, column);
            return true;
            //stel de nieuwe kolom en/of nieuwe rij in als rij en/of kolom;
        } else {
            return false;
        }
    }

    public void roteer() {
        if(orientatie==Orientatie.HORIZONTAAL){
            orientatie=Orientatie.VERTICAAL;
        }   
        else
        {
            if(orientatie==Orientatie.VERTICAAL){
                orientatie=Orientatie.HORIZONTAAL;
            }
        }
    }

    public int[][] getAlleCoordinaten() {
        int[][] alleCoordinaten = new int[size][2];
        for (int i = 0; i < size; i++) {
            if (orientatie == Orientatie.VERTICAAL) {
                alleCoordinaten[i][0] = row + size * i;
                alleCoordinaten[i][1] = column;
            } else {
                alleCoordinaten[i][0] = row;
                alleCoordinaten[i][1] = column + size * i;
            }
        }
        return alleCoordinaten;
    }
    
    
    private void CoordinateBoten() {    
        Iterator<Boot> boten = bordModel.getBoten();
        while(boten.hasNext()){
            Boot coordinaten = boten.next();
            if (hit.CoordinatenPaar() == getCoordinaten()){
                hit.isHit();    
            }
            // voor coordinatenpaar in boot.getbezettevakjes:
            // if hitMarker.getcoordinatenpaar == coordinatenpaar;
            //hitmark.hit = true;
        }
    }
    
        /*
    public void Hit() {
        this.gezonken = false;
        levens = levens -1;
    } hit en geraakt doen hetzelfde
         */
    }
