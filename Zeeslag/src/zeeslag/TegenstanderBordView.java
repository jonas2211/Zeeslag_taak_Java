/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeeslag;

import java.util.ArrayList;
import java.util.Iterator;
import javafx.scene.layout.Region;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author Bavo, Jonas, Rens
 */
public class TegenstanderBordView extends Region {

    // lowie zegt: bordView moet een bord uit het model afbeelden, en meot dus een data member bordModel hebben.
    // private Rectangle rechthoek;
    private Bord bordModel;
    private Boot bootModel;
    private ArrayList<Hitmark> hit;

    public TegenstanderBordView(Bord bordModel) { //in de constructor komt welk bord het moet afbeelden
        this.bordModel = bordModel; //model van het bord
        this.bootModel = bootModel;
        this.update();
        /* this.update2();
        this.update3();*/

    }

    
    public void update() {
        updateBackground(); //tekend de achtergrond opniew
        updateHitMarks();
    }

    private void updateBackground() {
        Rectangle rechthoek = new Rectangle(300, 300, Color.rgb(55, 131, 186));
        //twijfel tusse aquamarine en paleturquoise
        this.getChildren().addAll(rechthoek);
        for (int i = 0; i < 11; i++) { //verticaal
            Line lijn = new Line();
            lijn.setFill(Color.BLACK);
            lijn.setStartX(30.0 * i);
            lijn.setStartY(0.0);
            lijn.setEndX(30.0 * i);
            lijn.setEndY(300);
            this.getChildren().addAll(lijn);
        }

        for (int j = 0; j < 11; j++) { //horizontaal
            Line lijn = new Line();
            lijn.setFill(Color.BLACK);
            lijn.setStartX(0.0);
            lijn.setStartY(30.0 * j);
            lijn.setEndX(300);
            lijn.setEndY(30.0 * j);
            this.getChildren().addAll(lijn);
        }
    }

    /*for (Boot boot: bord.getBoten()){
            if(bootModel.getType() == Type.VLIEGDEKSCHIP){
                if (boot.isGezonken()== false){
                    return false;
                }
     */
    private void updateHitMarks() { // we weten op welke vakken al geschoten is aan de hand van het model
        for (Hitmark hitmrk : bordModel.getHitmarkList()) {
            Rectangle rechth = new Rectangle(hitmrk.getRow() * 30, hitmrk.getColumn() * 30, 29, 29);
            //for en if regel moet aagepast worden dit weet ik niet
            if (hitmrk.isHit() == true) {
                //rechth = new Rectangle(hitmrk.getRow() * 30, hitmrk.getColumn() * 30, 29, 29);
                rechth.setFill(Color.RED);
                //rechth omdat rechthoek al in gebruik was   
                /*Line lijn = new Line();
                lijn.setFill(Color.BLACK);
                lijn.setStartX(bootModel.getRow());
                lijn.setStartY(bootModel.getColumn());              //!!!!! hitmrk ipv bootModel!!!!!
                lijn.setEndX(bootModel.getRow() + 1);               // * 30 !!
                lijn.setEndY(bootModel.getColumn() + 1);
                //eerste lijn voor kruis op rood vierkant    
                Line lijn2 = new Line();
                lijn2.setFill(Color.BLACK);
                lijn2.setStartX(bootModel.getRow());
                lijn2.setStartY(bootModel.getColumn() + 1);
                lijn2.setEndX(bootModel.getRow() + 1);
                lijn2.setEndY(bootModel.getRow());
                //tweede lijn voor kruis op rood vierkant
                //x en y moet nog vervangen worden bij lijn en rechthoek    
                this.getChildren().addAll(rechth, lijn, lijn2);*/
            } else {
                rechth.setFill(Color.WHITE);
                //x en y nog vervangen
            }
            this.getChildren().addAll(rechth);
        }
    }
}
/* //teken kruis in juiste kleur hier
        kruis.trans... //peer kruis op juiste plaats
        this.getChildren().add(kruis);*/
//TODO

/*
    void update2(){
        this.rechthoek = new Rectangle (30,30,Color.RED);
        this.getChildren().addAll(rechthoek);
    }
    
    void update3(){  
        this.rechthoek = new Rectangle (30,30,Color.RED);
        rechthoek.setTranslateX(Bord.getColumn);
        rechthoek.setTranslateY(Bord.getRaw);
        getChildren().add(rechthoek);
        }
 */
