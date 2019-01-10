package zeeslag;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import static javafx.scene.paint.Color.RED;
import javafx.scene.shape.Rectangle;

public class ZeeslagController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane spelerPane;

    @FXML
    private AnchorPane tegenstanderPane;
    
    private ZeeslagSpel model;
    private TegenstanderBordView view;

    @FXML
    void initialize() {
        SpelerBordView spelerBordView = new SpelerBordView();
        TegenstanderBordView TegenstanderBordView = new TegenstanderBordView();
        
        assert spelerPane != null : "fx:id=\"spelerPane\" was not injected: check your FXML file 'FXMLZeeslagView.fxml'.";
        assert tegenstanderPane != null : "fx:id=\"tegenstanderPane\" was not injected: check your FXML file 'FXMLZeeslagView.fxml'.";
        spelerPane.getChildren().add(spelerBordView);
        tegenstanderPane.getChildren().add(TegenstanderBordView);
    }
    /*   
    public void setModel(ZeeslagSpel model) {
        this.model = model;
        view = new TegenstanderBordView(model);
        tegenstanderPane.getChildren().add(view);
    }
*/
    void handleMouseClick(MouseEvent e) {
        int x = (int) e.getX();
        int y = (int) e.getY();
        // @lowie zegt: laat model weten dat er op vakje n geschoten is
        // @lowie zegt: update view
        
        /*if (view.getVakjeOn.isGeraakt()){
            Vakje newVakje = new Rectangle(Column,Raw,30,30);
            newVakje.setFill(RED);
            model.addVakje(newVakje);
            view.update();
        }*/
    
  
    }
    
    void update(){
        view.update();
    }
    
    void updateCon(){
        view.update();
    }
    
    

    
}
