/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeeslag;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bavo, Jonas, Rens
 */
public class ZeeslagSpel {

    private Bord spelerBord;
    private Bord computerBord;
    private Speler huidigeSpeler;
    private SpelerEcht spelerEcht;
    //private SpelerComputer computer;
    private boolean start;

    /**
     * constructor
     */
    public ZeeslagSpel() {
        this.opstarten();
    }

    /**
     * get spelerBord
     *
     * @return spelerBord
     */
    public Bord getSpelerBord() {
        return spelerBord;
    }

    /**
     * get spelerBord
     *
     * @return spelerBord //AANPASSEN
     */
    public Bord getComputerBord() {
        return computerBord;
    }

    /**
     * get huidigeSpeler
     *
     * @return huidigeSpeler
     */
    public Speler getHuidigeSpeler() {
        return huidigeSpeler;
    }

    /**
     * get spelerEcht
     *
     * @return spelerEcht
     */
    public SpelerEcht getSpelerEcht() {
        return spelerEcht;
    }

    /**
     * get computer
     *
     * @return computer
     */
    /*
    public SpelerComputer getComputer() {
        return computer;
    }
     */
    /**
     * is boot geselecteerd
     *
     * @return
     */
    public boolean isBootGeselecteerd() {
        return spelerBord.isBootGeselecteerd();
    }

    /**
     * verplaatsen van boot
     *
     * @param row
     * @param column
     * @return
     */
    public boolean verplaatsBootNaar(int row, int column) {
        return spelerBord.verplaatsBootNaar(row, column);
    }

    /**
     * selecteren van boot
     *
     * @param row
     * @param column
     * @return
     */
    public boolean selecteerBootOn(int row, int column) {
        return spelerBord.selecteerBootOn(row, column);
    }

    /**
     * selecteer boot off
     */
    public void selecteerBootOff() {
        spelerBord.selecteerBootOff();
    }

    /**
     * opstarten van spel
     */
    public void opstarten() {
        this.spelerBord = new Bord();
        this.computerBord = new Bord();
        this.spelerEcht = new SpelerEcht(spelerBord);
        //this.computer = new SpelerComputer(spelerBord);
        this.huidigeSpeler = spelerEcht;
    }

    /**
     * start van spel nadat boten geplaatst zijn
     */
    public void Start() {
        this.start = false;

    }

    /**
     * geeft aan wanneer beurten moeten omdraaien
     */
    
    /*public void eindeBeurt() {
        if (huidigeSpeler instanceof SpelerEcht) {
            huidigeSpeler = computer;
        } else {
            huidigeSpeler = spelerEcht;
        }
    }*/
     
    /**
     * is spel afgelopen?
     *
     * @return agelopen of niet afgelopen
     */
    /*
    public boolean Spelafgelopen() {
        if (spelerEcht.isGezonken(Type.VLIEGDEKSCHIP) == true && spelerEcht.isGezonken(Type.SLAGSCHIP) == true && spelerEcht.isGezonken(Type.TORPEDOBOOTJAGER) == true && spelerEcht.isGezonken(Type.DUIKBOOT) == true && spelerEcht.isGezonken(Type.PATROUILLESCHIP) == true) {
            System.out.println(" De computer heeft gewonnen.");
            return true;
        } else if (computer.isGezonken(Type.VLIEGDEKSCHIP) == true && computer.isGezonken(Type.SLAGSCHIP) == true && computer.isGezonken(Type.TORPEDOBOOTJAGER) == true && computer.isGezonken(Type.DUIKBOOT) == true && computer.isGezonken(Type.PATROUILLESCHIP) == true) {
            System.out.println(" Gefeliciteert! Je hebt de computer verslagen!");
            return true;
        } else {
            return false;
        }
    }
     */
    /**
     * opslaan naar json
     */
    public void saveToJSON() {
        Gson gsonner = new GsonBuilder().setPrettyPrinting().create();
        String json = gsonner.toJson(this);
        try {
            JsonWriter writer = gsonner.newJsonWriter(new FileWriter("savedModel.json.txt"));
            writer.jsonValue(json);
            writer.close();
        } catch (java.io.IOException e) {

        }
    }

    /**
     * save methode
     */
 

    /**
     * inladen van spel
     */
    public static ZeeslagSpel loadFromJson() {
        
        
        try {
            Gson gson = new Gson();
            FileReader f = null;
            f = new FileReader("savedModel.json.txt");
            ZeeslagSpel nieuw = gson.fromJson(f, ZeeslagSpel.class);
            f.close();
            return nieuw;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ZeeslagSpel.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (IOException ex) {
            Logger.getLogger(ZeeslagSpel.class.getName()).log(Level.SEVERE, null, ex);
        }
      return null;
    }
    

}
