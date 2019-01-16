/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeeslag;

import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

/**
 * klasse waar view van boot in wordt gemaakt
 * @author Bavo, Jonas, Rens
 */
public class BootView extends Region{
    private Boot bootModel;
    private Rectangle rechthoek;
   
    /*
    *   constructor
    */
    public BootView(Boot model){
        this.bootModel = model;
        this.update();
    }
    
    /*
    *   update functie voor boten te tekenen
    */
    public void update() {
        Rectangle rect= new Rectangle(30*bootModel.getSize(), 1*30, Color.GRAY);;
        getChildren().add(rect);  
    }
    
    /*
    *   column opvragen
    */
    public int Column(int x){
        return x/30;
    }

    /*
    *   row opvragen
    */
    public int Raw(int y){
        return y/30;
    }
}
