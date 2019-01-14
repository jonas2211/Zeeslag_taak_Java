/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeeslag;

import java.util.ArrayList;
import javafx.scene.layout.Region;

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
        ArrayList<Boot> botenList = bordModel.getBoten();
        for (Boot b : botenList) {
            BootView bootView = new BootView(b);
            bootView.setTranslateX(b.getColumn() * 30);
            bootView.setTranslateY(b.getRow() * 30);
            getChildren().add(bootView);


        }
        }
        
    }
    
    
}
