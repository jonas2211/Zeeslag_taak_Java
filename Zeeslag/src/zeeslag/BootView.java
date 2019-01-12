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
    private Boot bootModel;
    private Type type;
    private Rectangle rechthoek;
    private Circle cirkel;
    private Polygon driehoek;
    private Duikboot boot1;

    public BootView(Boot bootModel) {
        this.bootModel = bootModel;
        this.update();
        this.driehoek = new Polygon(new double[]{0.0, -40.0, 40.0, -10.0, -40.0, -10.0 });
        this.rechthoek = new Rectangle(30, 30*bootModel.getSize(), 0.0, 0.0);
        this.cirkel = new Circle(15, 0.0, 0, Color.GRAY);
        //this.rechthoek = new Rectangle(40, 40, Color.BLUE);
        this.getChildren().addAll(driehoek, rechthoek, cirkel);
    }

    public void update() {
        
        if (bootModel.getType() == Type.VLIEGDEKSCHIP){
            //teken vliegdekschip
            driehoek.setCenterX(boot1.getX());
            driehoek.setCenterY(boot1.gety());
            rechthoek.setLayoutX(boot1.getX());
            rechthoek.SetlayoutY(boot1.gety());
            cirkel.setLayoutX(boot1.getX());
            cirkel.setLayoutY(boot1.gety());
            
        }
        else if (bootModel.getType() == Type.TORPEDOBOOTJAGER){
            //teken torpedobootjager
        }
        else if (bootModel.getType() == Type.DUIKBOOT){
        //teken duikboot
        }
        else if (bootModel.getType() == Type.SLAGSCHIP){
            //teken slagschip
        }
        else if (bootModel.getType() == Type.PATROUILLESCHIP){
            //teken patrouilleschip
        }
        

/*
            //if (boot.getOrientatie() == Orientatie.HORIZONTAAL) {
            Polygon bootNeus = new Polygon(1,2,1);
            bootNeus.setFill(Color.RED);
            Rectangle bootBody = new Rectangle(30 * 5 +15, 30); //5 moet getSize worden
            bootBody.setFill(Color.GRAY);
            Circle bootStaart = new Circle(15, Color.GRAY);

            getChildren().addAll(bootNeus, bootBody, bootStaart);
        */
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
