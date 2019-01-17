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
    private ArrayList<Hitmark> hitmarkListSpeler;
    private ArrayList<Hitmark> hitmarkListComp;
    private ArrayList<Boot> botenLijstComp;
    private ArrayList<Boot> BotenlijstSpeler;

    /**
     *constructor bord
     * 
     */
    public Bord() {
        this.hitmarkListSpeler = new ArrayList<Hitmark>();
        this.hitmarkListComp = new ArrayList<Hitmark>();
        this.BotenlijstSpeler = new ArrayList<Boot>();
        this.botenLijstComp = new ArrayList<Boot>();

        this.addRandomBoot(Type.VLIEGDEKSCHIP);
        this.addRandomBoot(Type.SLAGSCHIP);
        this.addRandomBoot(Type.DUIKBOOT);
        this.addRandomBoot(Type.TORPEDOBOOTJAGER);
        this.addRandomBoot(Type.PATROUILLESCHIP);

        this.addBoot(Type.VLIEGDEKSCHIP);
        this.addBoot(Type.SLAGSCHIP);
        this.addBoot(Type.DUIKBOOT);
        this.addBoot(Type.TORPEDOBOOTJAGER);
        this.addBoot(Type.PATROUILLESCHIP);
    }
    /**
     *voegt random boten toe aan het tegenstanderBord
     * @return random boten op het tegenstanderBord
     */

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
     *voegt boten toe aan het spelerBord
     * @return boten op het spelerBord
     */

    public void addBoot(Type type) {
        Orientatie o;
        int rij = (int) (Math.random() * 10);
        int kolom = (int) (Math.random() * 10);
        if (type == Type.VLIEGDEKSCHIP) {
            o = Orientatie.HORIZONTAAL;
            rij = 0;
            kolom = 1;
            BotenlijstSpeler.add(new Boot(rij, kolom, type, Orientatie.HORIZONTAAL));
        } else if (type == Type.SLAGSCHIP) {
            o = Orientatie.VERTICAAL;
            rij = 8;
            kolom = 6;
            BotenlijstSpeler.add(new Boot(rij, kolom, type, Orientatie.VERTICAAL));
        } else if (type == Type.DUIKBOOT) {
            o = Orientatie.HORIZONTAAL;
            rij = 7;
            kolom = 3;
            BotenlijstSpeler.add(new Boot(rij, kolom, type, Orientatie.HORIZONTAAL));
        } else if (type == Type.TORPEDOBOOTJAGER) {
            o = Orientatie.VERTICAAL;
            rij = 4;
            kolom = 6;
            BotenlijstSpeler.add(new Boot(rij, kolom, type, Orientatie.VERTICAAL));
        } else if (type == Type.PATROUILLESCHIP) {
            o = Orientatie.VERTICAAL;
            rij = 1;
            kolom = 5;
            BotenlijstSpeler.add(new Boot(rij, kolom, type, Orientatie.VERTICAAL));
        }

    }

    /**
     * get rij bord
     *
     * @return rij bord
     */
    public int getRow() {
        return row;
    }

    /**
     * get kolom bord
     *
     * @return kolom bord
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
        Iterator<Boot> boten = BotenlijstSpeler.iterator(); 
        while (boten.hasNext()) {
            Boot coordinaten = boten.next();
            if (bootModel.getRow() == row && bootModel.getColumn() == column) {
                return bootModel;
            }

          
        }
        return null;

    }

    /**
     * get hitmarks van speler
     *
     * @return lijst van hitmarks
     */
    public Iterator<Hitmark> getHitmarksSpeler() {
        return hitmarkListSpeler.iterator();
    }

    /**
     * get hitmarks van computer
     *
     * @return lijst van hitmarks
     */
    public Iterator<Hitmark> getHitmarksComp() {
        return hitmarkListComp.iterator();
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
            
        }
        return onBoot;
    }

    /**
     * boot niet meer geselecteerd
     */
    public void selecteerBootOff() {
        bootModel = null;
    }
    

    public boolean setHitmarkSpeler(int row, int column) {
        for (Boot b : botenLijstComp) {
            int[][] bezetteCoordinaten = b.getAlleCoordinaten();
            for (int[] coordinatenPaar : bezetteCoordinaten) {
                if (coordinatenPaar[0] == row && coordinatenPaar[1] == column) {
                    hitmarkListSpeler.add(new Hitmark(row, column, true));
                    System.out.println("speler heeft hit");
                    return true;
                }
            }
        }
        hitmarkListSpeler.add(new Hitmark(row, column, false));
        System.out.println("speler was mis");
        return false;
    }

    public boolean setHitmarkComp(int row, int column) {
        for (Boot c : BotenlijstSpeler) {
            int[][] bezetteCoordinaten = c.getAlleCoordinaten();
            for (int[] coordinatenPaar : bezetteCoordinaten) {
                if (coordinatenPaar[0] == row && coordinatenPaar[1] == column) {
                    hitmarkListComp.add(new Hitmark(row, column, true));
                    System.out.println("computer was hit");
                    return true;
                }
            }
        }
        hitmarkListComp.add(new Hitmark(row, column, false));
        System.out.println("computer was mis");
        return false;
    }

    /**
     * get boten van speler
     *
     * @return lijst van boten speler
     */
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
