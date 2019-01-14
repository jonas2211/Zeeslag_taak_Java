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

    
    private ZeeslagSpel zeeslagModel;
    private Boot bootModel;
    private TegenstanderBordView view;
    private SpelerBordView view2;
   // private BootView view3;           //Nieuwe klasse bootselectorview en die tekent alle boten in de zijkant
    //private BordView bordView;

    @FXML
    void initialize() {
        //SpelerBordView spelerBordView = new SpelerBordView();
        //TegenstanderBordView TegenstanderBordView = new TegenstanderBordView(zeeslagModel.getBord()); // kan foute bord zijn, zeeslagmodel = null.
        //BootView bootView = new BootView();
        assert spelerPane != null : "fx:id=\"spelerPane\" was not injected: check your FXML file 'FXMLZeeslagView.fxml'.";
        assert tegenstanderPane != null : "fx:id=\"tegenstanderPane\" was not injected: check your FXML file 'FXMLZeeslagView.fxml'.";
        assert botenPane != null : "fx:id=\"botenPane\" was not injected: check your FXML file 'FXMLZeeslagView.fxml'.";
        assert btnStart != null : "fx:id=\"btnStart\" was not injected: check your FXML file 'FXMLZeeslagView.fxml'.";
        assert btnDraaien != null : "fx:id=\"btnDraaien\" was not injected: check your FXML file 'FXMLZeeslagView.fxml'.";
        tegenstanderPane.setOnMouseClicked(event-> handleMouseClick(event));
        spelerPane.setOnMouseClicked(event-> handleMouseClick(event));
        botenPane.setOnMouseClicked(event-> handleMouseClick(event));
        //spelerPane.getChildren().add(spelerBordView);
        
        //botenPane.getChildren().add(bootView);
    }
    public void setModel(ZeeslagSpel zeeslagModel) {
        this.zeeslagModel = zeeslagModel;

        view = new TegenstanderBordView(zeeslagModel.getBord());
        view2 = new SpelerBordView(/*zeeslagModel.getBord()*/);
        spelerPane.getChildren().add(view2);
        spelerPane.setFocusTraversable(true);
        tegenstanderPane.getChildren().add(view);
        tegenstanderPane.setFocusTraversable(true);
        
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
        zeeslagModel.opstarten();
        update();
        
    }
    
    void btnStartHandler(ActionEvent event){
        System.out.println("Start het spel");
        zeeslagModel.start();
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
        //view3.update();
    }
    
    /*
    void updateCon(){
        view.update();
    }
    */
    

    
}
