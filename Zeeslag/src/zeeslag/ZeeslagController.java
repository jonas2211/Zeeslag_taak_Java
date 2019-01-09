package zeeslag;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
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

    @FXML
    void initialize() {
        SpelerBordView spelerBordView = new SpelerBordView();
        TegenstanderBordView TegenstanderBordView = new TegenstanderBordView();
        assert spelerPane != null : "fx:id=\"spelerPane\" was not injected: check your FXML file 'FXMLZeeslagView.fxml'.";
        assert tegenstanderPane != null : "fx:id=\"tegenstanderPane\" was not injected: check your FXML file 'FXMLZeeslagView.fxml'.";
        spelerPane.getChildren().add(spelerBordView);
        tegenstanderPane.getChildren().add(TegenstanderBordView);
    }
}
