/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeeslag;

import java.util.ArrayList;
import java.util.Iterator;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;


/**
 *
 * @author Bavo, Jonas, Rens
 */
public class TegenstanderBordView extends Region {
    
    private Bord bordModel;
    //private Boot bootModel;
    private ArrayList<Hitmark> hit;

    
    /**
     * constructor
     * @param bordModel
     * @param bootModel
     */
    public TegenstanderBordView(Bord bordModel) { //in de constructor komt welk bord het moet afbeelden
        this.bordModel = bordModel; //model van het bord
        //this.bootModel = bootModel;
        this.update();
        
    /**
     *  get bordmodel
     * @return bordModel
     */
    }
     public Bord getBordModel() {
        return bordModel;
    }

    
    public void update() {
        updateBackground(); 
        updateHitMarks();  
    }

    private void updateBackground() {
        Rectangle rechthoek = new Rectangle(300, 300, Color.rgb(55, 131, 186));
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

    
    private void updateHitMarks() { // we weten op welke vakken al geschoten is aan de hand van het model
        Iterator <Hitmark> hit = bordModel.getHitmarks();
        while(hit.hasNext()){
            Hitmark hits = hit.next();
            Rectangle rechth = new Rectangle(hits.getRow() * 30, hits.getColumn() * 30, 29, 29);
            if (hits.isHit() == true) {
                rechth.setFill(Color.RED);
           } else {
                rechth.setFill(Color.rgb(55, 131, 186));
            }
            this.getChildren().add(rechth);
        }
    }

    public int Column(int x){
        return x/30;
    }

    public int Raw(int y){
        return y/30;
    }
}

