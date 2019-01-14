/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeeslag;

import java.util.ArrayList;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.*; 
/**
 *
 * @author Bavo, Jonas, Rens
 */
public class SpelerBordView extends Region {
    public SpelerBordView() {
        
        this.update();

    }
    private BootView view;
    private Bord bordModel;
    
    void update(){  
        Rectangle rechthoek = new Rectangle (300,300,Color.rgb(55, 131, 186));
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
        /*ArrayList<Boot> botenList = bordModel.getBoten();
            for (Boot b : botenList) {
                if(b.getType()==Type.VLIEGDEKSCHIP){
                    BootView bootView = new BootView(b);*/
                    
                    Rectangle rect= new Rectangle(30*5, 1*30, Color.GRAY);;
                    rect.setTranslateX(13*30);
                    rect.setTranslateY(2*30);
                    getChildren().addAll(rect);
                
                            
                
                   
                /*BootView bootView = new BootView(b);
                bootView.setTranslateX(b.getColumn() * 30);
                bootView.setTranslateY(b.getRow() * 30);
                getChildren().add(bootView);*/

        
        
            
        
    }
    /*
    void update2(){  
        Rectangle rechthoek = new Rectangle (300,300,Color.RED);
        this.getChildren().addAll(rechthoek);
    }
    public int getColumn(int x){
        return x/30;// dikte vakje = 30
    }

    public int getRow(int y){
        return y/30;// dikte vakje = 30
    
    }
*/
    /*public int Column(int x){
        return x/30;//70 veranderen door dikte vakje
    }

    public int Raw(int y){
        return y/30;//70 veranderen door dikte vakje
    }*/
   
}

