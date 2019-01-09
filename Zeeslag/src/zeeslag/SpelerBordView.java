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
 * @author Bavo, Jonas, Rens
 */
public class SpelerBordView extends Region {
    private Rectangle rechthoek;

    public SpelerBordView() {
        
        this.update();

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
        this.rechthoek = new Rectangle (300,300,Color.RED);
        this.getChildren().addAll(rechthoek);
    }
    public int getColumn(int x){
        return x/70;//70 veranderen door dikte vakje
    }

    public int getRow(int y){
        return y/70;//70 veranderen door dikte vakje
    
    }

}
