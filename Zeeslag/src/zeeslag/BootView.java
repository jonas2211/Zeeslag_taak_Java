/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeeslag;

import java.awt.geom.Arc2D;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Bavo, Jonas, Rens
 */
public class BootView extends Region {

    //private Boot boot;
    private Orientatie orientatie; // is gelijk aan boot.getOrientatie
    private int x, y; //nodig?

    public BootView() {
        //this.boot = boot;
        this.update();
    }

    public void update() {
        //if (boot.getOrientatie() == Orientatie.HORIZONTAAL) {
            Polygon bootNeus = new Polygon(1,2,1);
            bootNeus.setFill(Color.RED);
            Rectangle bootBody = new Rectangle(30 * 5 +15, 30); //5 moet getSize worden
            bootBody.setFill(Color.GRAY);
            Circle bootStaart = new Circle(15, Color.GRAY);

            getChildren().addAll(bootNeus, bootBody, bootStaart);
            /*
        } else {

            Rectangle achtergrond = new Rectangle(30, 30 * boot.getSize());
            achtergrond.setFill(Color.GRAY);
            getChildren().addAll(achtergrond);
        }
*/
    }
}


//test
