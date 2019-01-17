/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeeslag;

import java.util.ArrayList;
import java.util.Iterator;

import javafx.scene.layout.Region;
/**
 *
 * @author Bavo, Jonas, Rens
 */
public class BordView extends Region {
    private Bord bordModel;
    private Boot bootModel;
    //getekendeBoot = new BootView(hier moet een boot-object komen);

    /**
    *    constructor
    */
    public BordView(Bord bord) {
        this.bordModel = bord;
     //   this.update();
    }
}