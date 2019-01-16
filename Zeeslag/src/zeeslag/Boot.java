/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeeslag;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *klasse met alle algemene datamembers voor boot
 * @author Bavo, Jonas, Rens
 */
public class Boot {

    
    private int size;
    int levens;
    private boolean gezonken;
    private int row, column;
    private Orientatie orientatie;
    private int rotatieHoek;
    private Type type;
    private Bord bordModel;
    private Hitmark hit;
    private ArrayList<Boot> Botenlist = new ArrayList<>();
    private ArrayList<Boot> BotenlistComp = new ArrayList<>();

    /**
     *  constructor
     */
    public Boot(int size, int column, int row, Orientatie o, Type type) {
        this.gezonken = false;
        this.type = type;
        this.size = size;
        this.levens = size;
        this.row = row;
        this.column = column;
        this.orientatie = o;
        rotatieHoek = 0;
        
        /**
         * voeg boten van speler toe aan botenlistComp
         */
        for (int i = 0; i < (vliegdekschip.length)-4; i++)
        {
            Botenlist.add(new Boot (vliegdekschip[i], Type.VLIEGDEKSCHIP));
        }

        for (int i = 0; i < (slagschip.length)-3; i++)
        {
            Botenlist.add(new Boot (slagschip[i], Type.SLAGSCHIP));
        }
        
        for (int i = 0; i < (duikboot.length)-2; i++)
        {
            Botenlist.add(new Boot (duikboot[i], Type.DUIKBOOT));
        }
        
        for (int i = 0; i < (torpedobootjager.length)-2; i++)
        {
            Botenlist.add(new Boot (torpedobootjager[i], Type.TORPEDOBOOTJAGER));
        }
        
        for (int i = 0; i < (patrouilleschip.length)-1; i++)
        {
            Botenlist.add(new Boot (patrouilleschip[i], Type.PATROUILLESCHIP));
        }
        
        /**
         * voeg boten van computer toe aan botenlistComp
         */
        
        for (int i = 0; i < (vliegdekschipComp.length)-4; i++)
        {
            BotenlistComp.add(new Boot (vliegdekschipComp[i], Type.VLIEGDEKSCHIP));
        }

        for (int i = 0; i < (slagschip.length)-3; i++)
        {
            BotenlistComp.add(new Boot (slagschipComp[i], Type.SLAGSCHIP));
        }
        
        for (int i = 0; i < (duikbootComp.length)-2; i++)
        {
            BotenlistComp.add(new Boot (duikbootComp[i], Type.DUIKBOOT));
        }
        
        for (int i = 0; i < (torpedobootjagerComp.length)-2; i++)
        {
            BotenlistComp.add(new Boot (torpedobootjagerComp[i], Type.TORPEDOBOOTJAGER));
        }
        
        for (int i = 0; i < (patrouilleschipComp.length)-1; i++)
        {
            BotenlistComp.add(new Boot (patrouilleschipComp[i], Type.PATROUILLESCHIP));
        }
        
    }
    
    /**
    *  coordinaten meegeven aan boot
    */
    public Boot(int[] coordinaten, Type type) {
        this.row = coordinaten[0];
        this.column = coordinaten[1];
        this.type = type;
        this.gezonken = false;
    }
    
    /**
     * coordinaten EchteSpeler
     */
    
    private int[][] vliegdekschip = {   //coordinaten vliegdekschip
         
        {0, 1}, {1, 1}, {2, 1}, {3,1}, {4,1}
        //bv. {Boot.getX,Boot.getY}, ....
    };
    private int[][] slagschip  = {   //coordinaten slagschip
         
        {8, 6}, {8, 7}, {8, 8}, {8,9}
    };
    private int[][] duikboot = {   //coordinaten onderzeeer
         
        {7, 3}, {8, 3}, {9, 3}
    };
    private int[][] torpedobootjager = {   //coordinaten torpedoboojager
         
        {4, 6}, {4, 7}, {4, 8}
    };
    private int[][] patrouilleschip = {   //coordinaten Patrouilleschip
         
        {5, 1}, {6, 1}
    };
    
    /**
     * coordinaten computer
     */
    //TODO;
    private int[][] vliegdekschipComp = {   //coordinaten vliegdekschip
         
        {8, 4}, {8, 5}, {8, 6}, {8, 7}, {8, 8}
        //bv. {Boot.getX,Boot.getY}, ....
    };
    private int[][] slagschipComp  = {   //coordinaten slagschip
         
        {2, 6}, {2, 7}, {2, 8}, {2,9}
    };
    private int[][] duikbootComp = {   //coordinaten onderzeeer
         
        {2, 2}, {3, 2}, {4, 2}
    };
    private int[][] torpedobootjagerComp = {   //coordinaten torpedoboojager
         
        {4, 7}, {5, 7}, {6, 7}
    };
    private int[][] patrouilleschipComp = {   //coordinaten Patrouilleschip
         
        {8, 0}, {9, 0}
    };
    
    
<<<<<<< HEAD
=======
    
    /*
    *  is boot levend
    */
    public boolean levend(){
        return levens>0;
            
    }
>>>>>>> e1c3ef55cd09018c0086706fc4bb73e70d774769

    /**
    *  getters
    */
    /**
     * get type van boot
     * @return type
     */

    public Type getType() {
        return type;
    }
    /**
     * get coordinaten boot enkel vakje
     * @return deze coordinaten
     */
    public int[] getCoordinaten() {
        int[] c = {this.row, this.column};
        return c;
    }
    /**
     * get rij
     * @return rij
     */
    public int getRow() {
        return row;
    }
    /**
     * get kolom
     * @return kolom
     */
    public int getColumn() {
        return column;
    }
    /**
     * get size boot
     * @return size
     */
    public int getSize() {
        return size;
    }
    /**
     * get levens boot
     * @return levens
     */
    public int getLevens() {
        return levens;
    }
    /**
     * get orientatie boot
     * @return orientatie
     */
    public Orientatie getOrientatie() {
        return orientatie;
    }
    /**
     * get rotatiehoek
     * @return de rotatiehoek
     */
    public int getRotatieHoek() {
        return rotatieHoek;
    }
    /**
     * get boten speler
     * @return lijst van boten speler
     */
    public Iterator<Boot> getBoten() {
        return Botenlist.iterator();
    }
    /**
     * get boten van computer
     * @return lijst van boten computer
     */
    public Iterator<Boot> getBotenComp(){
        return BotenlistComp.iterator();
    }

    /**
     * get alle coordinaten van de boot
     * @return alleCoordinaten
     */
    
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
    /* 
    *setters en andere methodes
    */
    
    
    /**
     * stel de size in
     * @param size 
     */
    
    public void setSize(int size) {
        this.size = size;
    }
   
    /**
     * verander naar gezonken
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
     * verander de coordinaten
     * @param row
     * @param column 
     */
    
    private void setCoordinaten(int row, int column) {
        this.row = row;
        this.column = column;
    }

    /**
     * kunnen we de boot verplaatsen?
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
     * roteer
     */
    
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
    /**
     * is de boot levend?
     * @return levend of niet
     */
     
    
     public boolean levend(){
        if(levens>0){
            return true;
        }
        return false;
    }
    
    
    /**
     * coordinaten boten
     */
    private void CoordinateBoten() {    
        Iterator<Boot> boten = getBoten();
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
    /**
     * is gezonken
     * @return gezonken
     */
    public boolean isGezonken() {
        return gezonken;
    }
        /*
    public void Hit() {
        this.gezonken = false;
        levens = levens -1;
    } hit en geraakt doen hetzelfde
         */
    }
