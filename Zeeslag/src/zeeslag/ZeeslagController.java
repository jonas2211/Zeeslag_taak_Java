package zeeslag;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import static javafx.scene.paint.Color.RED;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Button;

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
    private AnchorPane botenPane;

    @FXML
    private Button btnStart;

    @FXML
    private Button btnDraaien;
    
    @FXML
    private Button btnOpstarten;

    
    private ZeeslagSpel model;
    private Boot bootModel;
    private TegenstanderBordView view;
    private SpelerBordView view2;
    private BootView view3;

    @FXML
    void initialize() {
        SpelerBordView spelerBordView = new SpelerBordView();
        TegenstanderBordView TegenstanderBordView = new TegenstanderBordView();
        BootView bootView = new BootView();
        assert spelerPane != null : "fx:id=\"spelerPane\" was not injected: check your FXML file 'FXMLZeeslagView.fxml'.";
        assert tegenstanderPane != null : "fx:id=\"tegenstanderPane\" was not injected: check your FXML file 'FXMLZeeslagView.fxml'.";
        assert botenPane != null : "fx:id=\"botenPane\" was not injected: check your FXML file 'FXMLZeeslagView.fxml'.";
        assert btnStart != null : "fx:id=\"btnStart\" was not injected: check your FXML file 'FXMLZeeslagView.fxml'.";
        assert btnDraaien != null : "fx:id=\"btnDraaien\" was not injected: check your FXML file 'FXMLZeeslagView.fxml'.";
        tegenstanderPane.setOnMouseclicked(event-> handleMouseClick(event));
        spelerPane.getChildren().add(spelerBordView);
        tegenstanderPane.getChildren().add(TegenstanderBordView);
        botenPane.getChildren().add(bootView);
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
    void btnOpstartenHandler(ActionEvent event){
        System.out.println("Reset spel");
        model.opstarten();
        update();
        
    }
    
    void btnStartHandler(ActionEvent event){
        System.out.println("Start het spel");
        model.start();
        update();
        
    }
    
    void btnDraaienHandler(ActionEvent event){
        System.out.println("Draai boot");
        bootModel.roteer();
        update();
  
    }
    
    void update(){
        view.update();
        view2.update();
        view3.update();
    }
    
    /*
    void updateCon(){
        view.update();
    }
    */
    

    
}
