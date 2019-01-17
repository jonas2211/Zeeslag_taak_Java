/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeeslag;
//import com.sun.xml.internal.bind.v2.runtime.Coordinator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Bavo, Jonas, Rens
 */
public class Bord {

    private int row, column;
    private Boot bootModel;
    private Hitmark hitmrk;
    private ArrayList<Hitmark> hitmarkList;
    private ArrayList<Boot> botenLijstComp;
    private ArrayList<Boot> BotenlijstSpeler;

    public Bord() {
        this.hitmarkList = new ArrayList<Hitmark>();
        this.botenLijstComp = new ArrayList<Boot>();

        this.addRandomBoot(Type.VLIEGDEKSCHIP);
        this.addRandomBoot(Type.SLAGSCHIP);
        this.addRandomBoot(Type.DUIKBOOT);
        this.addRandomBoot(Type.TORPEDOBOOTJAGER);
        this.addRandomBoot(Type.PATROUILLESCHIP);
    }

    public void addRandomBoot(Type type) {
        Orientatie o;
        int rij = (int) (Math.random() * 10);
        int kolom = (int) (Math.random() * 10);
        if (Math.random() > 0.5) {
            o = Orientatie.HORIZONTAAL;
        } else {
            o = Orientatie.VERTICAAL;
        }
        if (type == Type.VLIEGDEKSCHIP) {
            if (o == Orientatie.HORIZONTAAL) {
                rij = (int) (Math.random() * 10);
                kolom = (int) (Math.random() * 5);
            } else if (o == Orientatie.VERTICAAL) {
                rij = (int) (Math.random() * 5);
                kolom = (int) (Math.random() * 10);
            }
        } else if (type == Type.SLAGSCHIP) {
            if (o == Orientatie.HORIZONTAAL) {
                rij = (int) (Math.random() * 10);
                kolom = (int) (Math.random() * 6);
            } else if (o == Orientatie.VERTICAAL) {
                rij = (int) (Math.random() * 6);
                kolom = (int) (Math.random() * 10);
            }
        } else if (type == Type.DUIKBOOT) {
            if (o == Orientatie.HORIZONTAAL) {
                rij = (int) (Math.random() * 10);
                kolom = (int) (Math.random() * 7);
            } else if (o == Orientatie.VERTICAAL) {
                rij = (int) (Math.random() * 7);
                kolom = (int) (Math.random() * 10);
            }
        } else if (type == Type.TORPEDOBOOTJAGER) {
            if (o == Orientatie.HORIZONTAAL) {
                rij = (int) (Math.random() * 10);
                kolom = (int) (Math.random() * 7);
            } else if (o == Orientatie.VERTICAAL) {
                rij = (int) (Math.random() * 7);
                kolom = (int) (Math.random() * 10);
            }
        } else if (type == Type.PATROUILLESCHIP) {
            if (o == Orientatie.HORIZONTAAL) {
                rij = (int) (Math.random() * 10);
                kolom = (int) (Math.random() * 8);
            } else if (o == Orientatie.VERTICAAL) {
                rij = (int) (Math.random() * 8);
                kolom = (int) (Math.random() * 10);
            }
        }
        botenLijstComp.add(new Boot(rij, kolom, type, o));
    }

    /**
     * hitmark
     */
    //!!!!!!!!
    public void klasseHitmark() { //WEGDOEN VOOR UPLOADEN, dit is cringe
        for (int[] b : bootModel.getAlleCoordinaten()) { //voor boot in botenlijst

            int row = b[0];
            int column = b[1];
            if (getRow() == bootModel.getRow() && getColumn() == bootModel.getColumn()) {
                hitmarkList.add(hitmrk);
                //hitmrk.isHit()=true;
            } else {
                return;
            }
        }
    }

    /**
     * get rij
     *
     * @return rij
     */
    public int getRow() {
        return row;
    }

    /**
     * get kolom
     *
     * @return kolom
     */
    public int getColumn() {
        return column;
    }

    //getters
    /**
     * get boot op deze coordinaat
     *
     * @param row
     * @param column
     * @return deze boot of null
     */
    public Boot getBootOn(int row, int column) {
        Iterator<Boot> boten = BotenlijstSpeler.iterator(); //flexiebler dan arraylist
        while (boten.hasNext()) {
            Boot coordinaten = boten.next();
            if (bootModel.getRow() == row && bootModel.getColumn() == column) {
                return bootModel;
            }

            //boot op meegegeven rij en kolom
        }
        return null;
        //geen boot op gegeven rij en kolom
    }

    /**
     * get hitmarks van schoten
     *
     * @return lijst van hitmarks
     */
    public Iterator<Hitmark> getHitmarks() {
        return hitmarkList.iterator();
    }

    /**
     * get geselecteerde boot
     *
     * @return deze boot
     */
    public Boot getGeselecteerdeBoot() {
        return bootModel;
    }

    //boolean methodes
    /**
     * boot geselecteerd
     *
     * @return als een boot geselecteerd is
     */
    public boolean isBootGeselecteerd() {
        return (bootModel != null);
    }

    /**
     * is een boot geselecteerd?
     *
     * @param row
     * @param column
     * @return op boot of niet op boot
     */
    public boolean selecteerBootOn(int row, int column) {
        boolean onBoot = false;
        //eerst boot niet geselecteerd
        bootModel = this.getBootOn(row, column);
        if (bootModel != null) {
            onBoot = true;
            //als er niet geen boot wordt geselecteerd(boot wel geselecteerd),zet onBoot is waar
        }
        return onBoot;
    }

    /**
     * boot niet meer geselecteerd
     */
    public void selecteerBootOff() {
        bootModel = null;
    }

    /**
     * verplaats de boot naar een andere coordinaat als deze vrij is
     *
     * @param row
     * @param column
     * @return onBoot
     */
    public boolean verplaatsBootNaar(int row, int column) {
        boolean onBoot = false;

        if (bootModel != null && isPlaatsVrij(bootModel.getRow(), bootModel.getColumn(), row, column) && (getBootOn(row, column) == null || getBootOn(row, column) == bootModel)) {
            onBoot = getBootOn(bootModel.getRow(), bootModel.getColumn()).verplaatsNaar(row, column);
        }
        if (onBoot) {
            bootModel = null;
        }
        return onBoot;
    }

    /**
     * schieten op een coordinaat
     *
     * @param x
     * @param y
     */
    public void schietenSpeler(int x, int y) {
        row = x / 30;
        column = y / 30;
    }

    /**
     * schot op random coordinaat door computer
     */
    public void schietenComputer() {
        row = (int) (Math.random()) * 10;
        column = (int) (Math.random()) * 10;
    }

    /**
     * is plaats vrij?
     *
     * @param startRow
     * @param startColumn
     * @param endRow
     * @param endColumn
     * @return vrij of niet
     */
    
    private boolean isPlaatsVrij(int startRow, int startColumn, int endRow, int endColumn) {
        for (int i = Math.min(startRow, endRow) + 1; i <= Math.max(startRow, endRow) - 1; i++) {
            if (getBootOn(i, startColumn) != null) {
                return false;
            }
        }
        for (int j = Math.min(startColumn, endColumn) + 1; j <= Math.max(startColumn, endColumn) - 1; j++) {
            if (getBootOn(startRow, j) != null) {
                return false;
            }
        }
        return true;
    }

    public boolean setHitmark(int row, int column) {
        for (Boot b : botenLijstComp) {
            int[][] bezetteCoordinaten = b.getAlleCoordinaten();
            for (int[] coordinatenPaar : bezetteCoordinaten) {
                if (coordinatenPaar[0] == row && coordinatenPaar[1] == column) {
                    hitmarkList.add(new Hitmark(row, column, true));
                    System.out.println("Dit was hit");
                    return true;
                }
            }
        }
        hitmarkList.add(new Hitmark(row, column, false));
        System.out.println("Dit was mis");
        return false;
    }

    public Iterator<Boot> getBoten() {
        return BotenlijstSpeler.iterator();
    }

    /**
     * get boten van computer
     *
     * @return lijst van boten computer
     */
    public Iterator<Boot> getBotenComp() {
        return botenLijstComp.iterator();
    }
    
}
