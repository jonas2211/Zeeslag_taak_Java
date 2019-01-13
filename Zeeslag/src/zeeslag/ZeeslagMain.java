/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeeslag;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Bavo, Jonas, Rens
 */
public class ZeeslagMain extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        //model 
        ZeeslagSpel zeeslagModel = new ZeeslagSpel();

        
        //view 
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLZeeslagView.fxml"));
        Parent root = loader.load();
        
        ZeeslagController zeeslagController = loader.getController();
        
        //controller linken
        zeeslagController.setModel(zeeslagModel);
                
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
