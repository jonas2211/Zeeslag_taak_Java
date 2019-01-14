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
 *
 * @author Bavo, Jonas, Rens
 */
public class BootView extends Region {
    //private int x, y; 
    //nodig?
    private Boot bootModel;
    private Rectangle rechthoek;
    private Circle cirkel;
    private Polygon driehoek;
   
    
    private Vliegdekschip boot1;
    private Slagschip boot2;
    private Torpedobootjager boot3;
    private Duikboot boot4;
    private Patrouilleschip boot5;
    
  

    public BootView(Boot model){
        this.bootModel = model;
        this.update();
        /*
        this.driehoek = new Polygon( 0.0, -40.0,40.0, -10.0,-40.0, -10.0 );
        this.rechthoek = new Rectangle(30, 30*(bootModel.getSize()-2), 0.0, 0.0);
        this.cirkel = new Circle(15, 0.0, 0, Color.GRAY);
        //this.rechthoek = new Rectangle(40, 40, Color.BLUE);
        this.getChildren().addAll(driehoek, rechthoek, cirkel);
        */
        
    }
    
    
// moet nog aangewerkt worden
    public void update() {
        
        Rectangle rect= new Rectangle(30*bootModel.getSize(), 1*30, Color.GRAY);;
        getChildren().add(rect);
        /*
        if (bootModel.getType() == Type.VLIEGDEKSCHIP){
            //teken vliegdekschip
            driehoek.setLayoutX(boot1.getRow());
            driehoek.setLayoutY(boot1.getColumn());
            rechthoek.setLayoutX(boot1.getRow());
            rechthoek.setLayoutY(boot1.getColumn());
            cirkel.setLayoutX(boot1.getRow());
            cirkel.setLayoutY(boot1.getColumn());
            
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
        */
        

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
