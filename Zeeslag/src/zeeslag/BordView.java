/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeeslag;

import java.util.ArrayList;

import javafx.scene.layout.Region;
/**
 *
 * @author jonas
 */
public class BordView extends Region {
    private Bord bordModel;
    //getekendeBoot = new BootView(hier moet een boot-object komen);

 public BordView(Bord bord) {
        this.bordModel = bord;
        this.update();
    }

    public void update() {

        ArrayList<Boot> boten = bordModel.getBoten();
        for (Boot b : boten) {
            BootView bootView = new BootView(b);
            BootView.setTranslateX(b.getColumn() * 30 + 10); //one tile on the board is 70x70, +10 because a piece is 50x50
            BootView.setTranslateY(b.getRow() * 30 + 10);
            getChildren().add(BootView);
            
        }
    }

    public int getRow(int y) {
        return y / 70;
    }

    public int getColumn(int x) {
        return x / 70;
    }

    public Boot getPieceOn(int y, int x){
        return bordModel.getBootOn(this.getRow(y), getColumn(x));
    }
    
}
