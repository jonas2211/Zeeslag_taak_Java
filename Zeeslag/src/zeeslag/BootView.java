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
/**
 *
 * @author Bavo, Jonas, Rens
 */
public class BootView extends Region {
    private Boot boot;
    private Orientatie orientatie;
    private int x,y;
    
    public BootView(){
        this.update();
    }

    public BootView(Boot boot) {
        this.boot = boot;
        Rectangle achtergrond = new Rectangle(30,30);
        achtergrond.setFill(Color.GRAY);
        if (boot.HORIZONTAAL()) {
            
            
        }
        else
        {
            
    }
    
    
    public void update(){
        
    }
    
}
//test
