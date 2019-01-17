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

    /**
     * constructor
     *
     * @param bordModel
     */
    public TegenstanderBordView(Bord bordModel) { //in de constructor komt welk bord het moet afbeelden
        this.bordModel = bordModel; //model van het bord
        this.update();
    }

    /**
     * update achtergrond update hitmarks
     */
    public void update() {
        updateBackground();
        updateHitMarks();
    }

    /**
     * update achtergrond
     */
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

    /**
     * update hitmarks
     */
    private void updateHitMarks() { // we weten op welke vakken al geschoten is aan de hand van het model
        Iterator<Hitmark> hitMarks = bordModel.getHitmarksSpeler();
        while (hitMarks.hasNext()) {
            Hitmark hits = hitMarks.next();
            Rectangle rechth = new Rectangle(hits.getColumn() * 30, hits.getRow() * 30, 29, 29);
            if (hits.isHit() == true) {
                rechth.setFill(Color.RED);
            } else {
                rechth.setFill(Color.WHITE);
            }
            this.getChildren().add(rechth);
        }
    }

    /**
     * zet x-pixels om naar kolom
     *
     * @ param x het aantal pixels
     * @return de kolom
     */
    public int getColumn(int x) {
        return x / 30;
    }

    /**
     * zet y-pixels om naar rij
     *
     * @para m y het aantal pixels
     * @return de rij
     */
    public int getRij(int y) {
        return y / 30;
    }

    /**
     * get bordmodel
     *
     * @return bordModel
     */
    public Bord getBordModel() {
        return bordModel;
    }
}
