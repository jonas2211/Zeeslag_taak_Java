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
     * get computerbord
     *
     * @return computerBord 
     */
    public Bord getComputerBord() {
        return computerBord;
    }

    
    /**
     * is boot geselecteerd
     *
     * @return
     */
    public boolean isBootGeselecteerd() {
        return spelerBord.isBootGeselecteerd();
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
    }

    /**
     * start van spel nadat boten geplaatst zijn
     */
    public void Start() {
        this.start = false;

    }

    
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
