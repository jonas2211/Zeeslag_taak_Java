package zeeslag;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class ZeeslagController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane spelerPane;

    @FXML
    private AnchorPane tegenstanderPane;
    
    private int Column;
    private int Raw;
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
    void handleMouseClick(MouseEvent e) {
        int x = (int) e.getX();
        int y = (int) e.getY();
        }
    
    public int Column(int x){
        return x/30;//70 veranderen door dikte vakje
    }

    public int Row(int y){
        return y/30;//70 veranderen door dikte vakje
    }
    
    Vakje newRechthoek = new Vakje(Column,Raw);
    model.addRechthoek(newRechthoek);
    view.update();
    
    void update(){
        view.update();
    }
    public int getColumn() {
        return Column;
    }

    public int getRaw() {
        return Raw;
    }

    }
}
