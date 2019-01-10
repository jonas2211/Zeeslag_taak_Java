/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeeslag;

import javafx.scene.layout.Region;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;

/**
 *
 * @author Bavo, Jonas, Rens
 */
public class BootView extends Region {

    private Boot boot;
    private Orientatie orientatie; // is gelijk aan boot.getOrientatie
    private int x, y; //nodig?

    public BootView(Boot boot) {
        this.boot = boot;
        update();
    }

    public void update() {
        if (boot.getOrientatie() == Orientatie.HORIZONTAAL) {
            Rectangle bootBody = new Rectangle(30 * boot.getSize(), 30);
            bootBody.setFill(Color.GRAY);
            getChildren().addAll(bootBody);
        } else {

            Rectangle achtergrond = new Rectangle(30, 30 * boot.getSize());
            achtergrond.setFill(Color.GRAY);
            getChildren().addAll(achtergrond);
        }
    }

}
//test
