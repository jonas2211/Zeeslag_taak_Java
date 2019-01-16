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
 * @author Bavo, Jonas, Rens
 */
public class SpelerBordView extends Region {
    public SpelerBordView() {
        this.update();
       //this.updateHitMarks();

    }
    private BootView view;
    private Bord bordModel;

    private ArrayList<Hitmark> hit;
    /**
     * get bordModel
     * @return dit bordModel
     */
    public Bord getBordModel() {
        return bordModel;
    }
    
    

    /**
     * update spelerBordView
     */
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
        Rectangle vliegdekschip= new Rectangle(0*30, 1*30, 5*30, 30);
        vliegdekschip.setFill(Color.LIGHTGRAY);
        Rectangle slagschip= new Rectangle(8*30,6*30,30,4*30);
        slagschip.setFill(Color.LIGHTGREY);
        Rectangle duikboot= new Rectangle(7*30, 3*30, 3*30, 1*30);
        duikboot.setFill(Color.LIGHTGRAY);
        Rectangle patrouilleship= new Rectangle(1*30, 5*30, 1*30, 2*30);
        patrouilleship.setFill(Color.LIGHTGRAY);
        Rectangle torpedojager= new Rectangle(4*30, 6*30, 1*30, 3*30);
        torpedojager.setFill(Color.LIGHTGRAY);
        getChildren().addAll(slagschip,vliegdekschip,duikboot,patrouilleship,torpedojager);
       
        
        
        
        
        
        /* ArrayList<Boot> botenList = bordModel.getBoten();
            for (Boot b : bordModel.getBoten()) {
                if(b.getType()==Type.VLIEGDEKSCHIP){
                                       
                    Rectangle rect= new Rectangle(30*b.getSize(), 1*30, Color.GRAY);;
                    rect.setTranslateX(13*30);
                    rect.setTranslateY(2*30);
                    getChildren().addAll(rect);*/
       
       //manier zoeken om boten op begin te plaatsen
                
                            
                
                   
                /*BootView bootView = new BootView(b);
                bootView.setTranslateX(b.getColumn() * 30);
                bootView.setTranslateY(b.getRow() * 30);
                getChildren().add(bootView);*/

        
        
            
    }
   /**
    * update de hitmarks
    */ 
   private void updateHitMarks() { // we weten op welke vakken al geschoten is aan de hand van het model
       Iterator <Hitmark> hit = bordModel.getHitmarks();
       while(hit.hasNext()){
           Hitmark hits = hit.next();
           Rectangle rechth = new Rectangle(hits.getRow() * 30, hits.getColumn() * 30, 29, 29);
            //for en if regel moet aagepast worden dit weet ik niet
            if (hits.isHit() == true) {
                //rechth = new Rectangle(hitmrk.getRow() * 30, hitmrk.getColumn() * 30, 29, 29);
                rechth.setFill(Color.RED);
                //rechth omdat rechthoek al in gebruik was
                /*
                Line lijn = new Line();
                lijn.setFill(Color.BLACK);
                lijn.setStartX(hits.getRow()*30);
                lijn.setStartY(hits.getColumn()*30);              //!!!!! hitmrk ipv bootModel!!!!!
                lijn.setEndX((hits.getRow() + 1)*30);               // * 30 !!
                lijn.setEndY((hits.getColumn() + 1)*30);
                //eerste lijn voor kruis op rood vierkant    
                Line lijn2 = new Line();
                lijn2.setFill(Color.BLACK);
                lijn2.setStartX(hits.getRow()*30);
                lijn2.setStartY((hits.getColumn() + 1)*30);
                lijn2.setEndX((hits.getRow() + 1)*30);
                lijn2.setEndY(hits.getRow()*30);
                //tweede lijn voor kruis op rood vierkant
                //x en y moet nog vervangen worden bij lijn en rechthoek    
                this.getChildren().addAll(rechth, lijn, lijn2);
                */
           } else {
                rechth.setFill(Color.rgb(55, 131, 186));
                //x en y nog vervangen
            }
            this.getChildren().add(rechth);
        }
    }
       
       
       
       /*
        for (Hitmark hitmrk : bordModel.getHitmarkList()) {
            Rectangle rechth = new Rectangle(hitmrk.getRow() * 30, hitmrk.getColumn() * 30, 29, 29);
            //for en if regel moet aagepast worden dit weet ik niet
            if (hitmrk.isHit() == true) {
                //rechth = new Rectangle(hitmrk.getRow() * 30, hitmrk.getColumn() * 30, 29, 29);
                rechth.setFill(Color.RED);
                //rechth omdat rechthoek al in gebruik was   
                Line lijn = new Line();
                lijn.setFill(Color.BLACK);
                lijn.setStartX(hitmrk.getRow()*30);
                lijn.setStartY(hitmrk.getColumn()*30);              //!!!!! hitmrk ipv bootModel!!!!!
                lijn.setEndX((hitmrk.getRow() + 1)*30);               // * 30 !!
                lijn.setEndY((hitmrk.getColumn() + 1)*30);
                //eerste lijn voor kruis op rood vierkant    
                Line lijn2 = new Line();
                lijn2.setFill(Color.BLACK);
                lijn2.setStartX(hitmrk.getRow()*30);
                lijn2.setStartY((hitmrk.getColumn() + 1)*30);
                lijn2.setEndX((hitmrk.getRow() + 1)*30);
                lijn2.setEndY(hitmrk.getRow()*30);
                //tweede lijn voor kruis op rood vierkant
                //x en y moet nog vervangen worden bij lijn en rechthoek    
                this.getChildren().addAll(rechth, lijn, lijn2);
           } else {
                rechth.setFill(Color.rgb(55, 131, 186));
                //x en y nog vervangen
            }
            this.getChildren().addAll(rechth);
        }
    }
   */
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
   /**
    * get kolom
    * @param x
    * @return kolom
    */
    public int Column(int x){
        return x/30;//70 veranderen door dikte vakje
    }
    /**
     * get rij
     * @param y
     * @return rij
     */
    public int Raw(int y){
        return y/30;//70 veranderen door dikte vakje
    }
   
}

