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
public class SpelerBordView extends Region {

    public SpelerBordView(Bord spelerBord) {
        this.update();

    }
    /**
     * update spelerBordView
     */
    void update() {
        this.updateBackground();
        //this.updateHitMarks();
    }
    
    private Bord bordModel;
    private ArrayList<Hitmark> hit;

    /**
     * get bordModel
     *
     * @return dit bordModel
     */
    public Bord getBordModel() {
        return bordModel;
    }

    /**
     * tekent de achtergrond en de boten op het spelerBordView
     */
    
    private void updateBackground(){
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
        Rectangle vliegdekschip = new Rectangle(0 * 30, 1 * 30, 5 * 30, 30);
        vliegdekschip.setFill(Color.LIGHTGRAY);
        Rectangle slagschip = new Rectangle(8 * 30, 6 * 30, 30, 4 * 30);
        slagschip.setFill(Color.LIGHTGREY);
        Rectangle duikboot = new Rectangle(7 * 30, 3 * 30, 3 * 30, 1 * 30);
        duikboot.setFill(Color.LIGHTGRAY);
        Rectangle patrouilleship = new Rectangle(1 * 30, 5 * 30, 1 * 30, 2 * 30);
        patrouilleship.setFill(Color.LIGHTGRAY);
        Rectangle torpedojager = new Rectangle(4 * 30, 6 * 30, 1 * 30, 3 * 30);
        torpedojager.setFill(Color.LIGHTGRAY);
        getChildren().addAll(slagschip, vliegdekschip, duikboot, patrouilleship, torpedojager);

    }

    /**
     * update de hitmarks
     */
    private void updateHitMarks() { 
        Iterator<Hitmark> hit = bordModel.getHitmarksComp();
        while (hit.hasNext()) {
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

    /**
     * get kolom
     *
     * @param u
     * @return kolom
     */
    public int Column(int u) {
        return u / 30;
    }

   /**
    * get kolom
    * @param u
    * @return kolom
    */
    public int getColumn(int u){
        return u/30;

    }

    /**
     * get rij
     *
     * @param v
     * @return rij
     */

    public int Row(int v) {
        return v / 30;
    }

    public int getRow(int v){
        return v/30;

    }

}
