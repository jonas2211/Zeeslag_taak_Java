/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeeslag;

import javafx.scene.layout.Region;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.*; 
/**
 *
 * @author jonas
 */
public class BordView extends Region {
    private Rectangle rechthoek;

    public BordView() {
        this.update();
    }
    
    
    void update(){  
        this.rechthoek = new Rectangle (300,300,Color.BLUE);
        for (int i = 0; i < 12; i++){ //verticaal
            Line lijn = new Line();
            lijn.setStartX(50.0*i);
            lijn.setStartY(0.0);
            lijn.setEndX(50.0*i);
            lijn.setEndY(300);
            this.getChildren();
        } 
    }

}
