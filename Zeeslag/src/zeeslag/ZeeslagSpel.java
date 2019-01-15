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
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author jonas
 */
public class ZeeslagSpel {
    
    private Bord bord;
    private Speler huidigeSpeler;
    private SpelerEcht spelerEcht;
    private SpelerComputer computer;
    private boolean start;
    

    public ZeeslagSpel() {
        this.opstarten();
    }
    
    public void opstarten(){
        this.bord = new Bord();
        this.spelerEcht = new SpelerEcht(bord);
        this.computer = new SpelerComputer(bord);
        this.huidigeSpeler = spelerEcht;
    }
    public void Start(){
        this.start = false;
        
    }
    
    
    //getters
    public Bord getBord() {
        return bord;
    }

    public Speler getHuidigeSpeler() {
        return huidigeSpeler;
    }

    public SpelerEcht getSpelerEcht() {
        return spelerEcht;
    }

    public SpelerComputer getComputer() {
        return computer;
    }
    
    
    //andere methodes
    public boolean isBootGeselecteerd() {
         return bord.isBootGeselecteerd();
     }
     
    public boolean verplaatsBootNaar(int row, int column){
        return bord.verplaatsBootNaar(row, column);
    }
    
     public boolean selecteerBootOn(int row, int column) {
         return bord.selecteerBootOn(row, column);
     }
    
     public void selecteerBootOff(){
         bord.selecteerBootOff();
     }
 
     
    //methode spelerwissel
    public void eindeBeurt(){
        if (huidigeSpeler instanceof SpelerEcht){
            huidigeSpeler = computer;
        }
        else{
            huidigeSpeler = spelerEcht;
        }
    }
    
    // eindespelchecker wie heeft gewonnen
    public boolean Spelafgelopen(){
        if (spelerEcht.isGezonken(Type.VLIEGDEKSCHIP) ==true && spelerEcht.isGezonken(Type.SLAGSCHIP)== true && spelerEcht.isGezonken(Type.TORPEDOBOOTJAGER)==true && spelerEcht.isGezonken(Type.DUIKBOOT)==true && spelerEcht.isGezonken(Type.PATROUILLESCHIP)==true)
        {
            System.out.println(" De computer heeft gewonnen.");
            return true;
        }
        else if(computer.isGezonken(Type.VLIEGDEKSCHIP) ==true && computer.isGezonken(Type.SLAGSCHIP)== true && computer.isGezonken(Type.TORPEDOBOOTJAGER)==true && computer.isGezonken(Type.DUIKBOOT)==true && computer.isGezonken(Type.PATROUILLESCHIP)==true) 
        {
            System.out.println(" Gefeliciteert! Je hebt de computer verslagen!");
            return true;
        }
        else
        {
            return false;
                    
        }
    }
    public void saveToJSON(){
    Gson gsonner = new GsonBuilder().setPrettyPrinting().create();
        String json = gsonner.toJson(this);
        try {
            JsonWriter writer = gsonner.newJsonWriter(new FileWriter("savedModel.json.txt"));
            writer.jsonValue(json);
        } catch (java.io.IOException e) {
     
        }
    }
    public static void Save(){
        
    }
    
    public static void loadFromJson() {
        Gson gson = new Gson();
        try {
            Level nieuw = gson.fromJson(new FileReader("dc.json.txt"),Level.class);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ZeeslagSpel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

