/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeeslag;

import java.util.ArrayList;
import java.util.Iterator;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

/**
 *
 * @author Rens Remans
 */
public class StartBootView extends Region{
    private Boot bootModel;
    private Bord bordModel;

    public StartBootView(Boot bootModel) {
        this.bootModel = bootModel;
        this.update();
    }
    
    public void update(){
        Iterator<Boot> botenList = bootModel.getBoten();
        while (botenList.hasNext()){
            Boot boot = botenList.next();
            
            if(boot.getType() == Type.VLIEGDEKSCHIP){
                BootView bootView = new BootView(boot);
                bootView.setTranslateX(13 * 30);
                bootView.setTranslateY(1 * 30);
                getChildren().add(bootView);
            }
            
            else if(boot.getType() == Type.SLAGSCHIP){
                BootView bootView = new BootView(boot);
                bootView.setTranslateX(13 * 30);
                bootView.setTranslateY(3 * 30);
                getChildren().add(bootView);
            }
            
            else if(boot.getType() == Type.DUIKBOOT){
                BootView bootView = new BootView(boot);
                bootView.setTranslateX(13 * 30);
                bootView.setTranslateY(5 * 30);
                getChildren().add(bootView);
            }
            
            else if(boot.getType() == Type.TORPEDOBOOTJAGER){
                BootView bootView = new BootView(boot);
                bootView.setTranslateX(13 * 30);
                bootView.setTranslateY(7 * 30);
                getChildren().add(bootView);
            }
            
            else if(boot.getType() == Type.PATROUILLESCHIP){
                BootView bootView = new BootView(boot);
                bootView.setTranslateX(13 * 30);
                bootView.setTranslateY(9 * 30);
                getChildren().add(bootView);
             }
            /*
            
        for (Boot b : botenList) {
            if(b.getType() == Type.VLIEGDEKSCHIP){
            BootView bootView = new BootView(b);
            bootView.setTranslateX(13 * 30);
            bootView.setTranslateY(1 * 30);
            getChildren().add(bootView);
            }
            
            else if(b.getType() == Type.SLAGSCHIP){
            BootView bootView = new BootView(b);
            bootView.setTranslateX(13 * 30);
            bootView.setTranslateY(3 * 30);
            getChildren().add(bootView);
            }
            
            else if(b.getType() == Type.DUIKBOOT){
            BootView bootView = new BootView(b);
            bootView.setTranslateX(13 * 30);
            bootView.setTranslateY(5 * 30);
            getChildren().add(bootView);
            }
            
            else if(b.getType() == Type.TORPEDOBOOTJAGER){
            BootView bootView = new BootView(b);
            bootView.setTranslateX(13 * 30);
            bootView.setTranslateY(7 * 30);
            getChildren().add(bootView);
            }
            
            else if(b.getType() == Type.PATROUILLESCHIP){
            BootView bootView = new BootView(b);
            bootView.setTranslateX(13 * 30);
            bootView.setTranslateY(9 * 30);
            getChildren().add(bootView);
            }
            */
/*
            Rectangle rect= new Rectangle(30*b.getSize(), 1*30, Color.GRAY);;
                    rect.setTranslateX(13*30);
                    rect.setTranslateY(2*30);
                    getChildren().addAll(rect);
*/

            
        }
        
    }
    public int Column(int x){
        return x/30;//70 veranderen door dikte vakje
    }

    public int Raw(int y){
        return y/30;//70 veranderen door dikte vakje
    }
}
    
    

