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

        ArrayList<Boot> botenList = bordModel.getBoten();
        for (Boot b : botenList) {
            BootView bootView = new BootView(b);
            bootView.setTranslateX(b.getColumn() * 30);
            bootView.setTranslateY(b.getRow() * 30);
            getChildren().add(bootView);


        }
        }
        
    

    public int getRow(int y) {
        return y / 30;
    }

    public int getColumn(int x) {
        return x / 30;
    }

    public Boot getPieceOn(int y, int x){
        return bordModel.getBootOn(this.getRow(y), getColumn(x));
    }
    
}
