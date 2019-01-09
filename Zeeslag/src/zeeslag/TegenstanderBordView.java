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
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
/**
 *
 * @author jonas
 */
public class TegenstanderBordView extends Region {
    private Rectangle rechthoek;

    public TegenstanderBordView() {
        this.update();
        this.update2();
        //this.handleMouseClick(MouseEvent);

        
    } 
    
    void update(){  
        this.rechthoek = new Rectangle (300,300,Color.ROYALBLUE);
        //twijfel tusse aquamarine en paleturquoise
        this.getChildren().addAll(rechthoek);
        for (int i = 0; i < 11; i++){ //verticaal
            Line lijn = new Line();
            lijn.setFill(Color.BLACK);
            lijn.setStartX(30.0*i);
            lijn.setStartY(0.0);
            lijn.setEndX(30.0*i);
            lijn.setEndY(300);
            this.getChildren().addAll(lijn);
        }
        
        for (int j = 0; j < 11; j++){ //horizontaal
            Line lijn = new Line();
            lijn.setFill(Color.BLACK);
            lijn.setStartX(0.0);
            lijn.setStartY(30.0*j);
            lijn.setEndX(300);
            lijn.setEndY(30.0*j);
            this.getChildren().addAll(lijn);
        }
        
        
            
        
    }
    
    void update2(){
        this.rechthoek = new Rectangle (30,30,Color.RED);
        this.getChildren().addAll(rechthoek);
    }
    /*
    void handleMouseClick(MouseEvent mouseEvent) {
        int x = (int) mouseEvent.getX();
        int y = (int) mouseEvent.getY();
        if (x == 2 && y == 2){
            this.rechthoek = new Rectangle (30,30,Color.RED);
            rechthoek.setTranslateX(x); //one tile on the board is 70x70, +10 because a piece is 50x50
            rechthoek.setTranslateY(y);
            getChildren().add(rechthoek);
        }

    }
*/
}
