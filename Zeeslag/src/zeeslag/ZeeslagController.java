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
    private Button btnStart;
    
    @FXML
    private Button btnLoad;

    @FXML
    private Button btnDraaien;
    
    @FXML
    private Button btnOpstarten;
    
    @FXML
    private Button btnSave;

    
    private ZeeslagSpel zeeslagModel;
    private Boot bootModel;
    private TegenstanderBordView view;
    private SpelerBordView view2;
    private StartBootView view3;
    // private BootView view3;           //Nieuwe klasse bootselectorview en die tekent alle boten in de zijkant
    //private BordView bordView;

    
    @FXML
    void initialize() {
        //SpelerBordView spelerBordView = new SpelerBordView();
        //TegenstanderBordView TegenstanderBordView = new TegenstanderBordView(zeeslagModel.getBord()); // kan foute bord zijn, zeeslagmodel = null.
        //BootView bootView = new BootView();
        assert spelerPane != null : "fx:id=\"spelerPane\" was not injected: check your FXML file 'FXMLZeeslagView.fxml'.";
        assert tegenstanderPane != null : "fx:id=\"tegenstanderPane\" was not injected: check your FXML file 'FXMLZeeslagView.fxml'.";
        assert btnStart != null : "fx:id=\"btnStart\" was not injected: check your FXML file 'FXMLZeeslagView.fxml'.";
        assert btnDraaien != null : "fx:id=\"btnDraaien\" was not injected: check your FXML file 'FXMLZeeslagView.fxml'.";
        assert btnLoad != null : "fx:id=\"loadBtn\" was not injected: check your FXML file 'FXMLHnefataflView.fxml'.";
        assert btnSave != null : "fx:id=\"btnSave\" was not injected: check your FXML file 'FXMLZeeslagView.fxml'.";

        tegenstanderPane.setOnMouseClicked(event-> handleMouseClick(event));
        spelerPane.setOnMouseClicked(event-> handleMouseClick(event));
        btnLoad.setOnAction(event -> handleLoadBtn(event));
        btnSave.setOnAction(event -> handleBtnSave(event));
        //spelerPane.getChildren().add(view2);
        //spelerPane.getChildren().add(spelerBordView);

        
        //botenPane.getChildren().add(bootView);
    }/**
     * setModel
     * @param zeeslagModel 
     */
    public void setModel(ZeeslagSpel zeeslagModel) {
        this.zeeslagModel = zeeslagModel;

        view = new TegenstanderBordView(zeeslagModel.getBord());
        view2 = new SpelerBordView(/*zeeslagModel.getBord()*/);
        spelerPane.getChildren().add(view2);
        spelerPane.setFocusTraversable(true);
        tegenstanderPane.getChildren().add(view);
        tegenstanderPane.setFocusTraversable(true);
        //spelerPane.getChildren().add(view3);
        
    }
    /*   
    public void setModel(ZeeslagSpel model) {
        this.model = model;
        view = new TegenstanderBordView(model);
        tegenstanderPane.getChildren().add(view);
    }
*/
    /**
     * actie met muisklik
     * @param mouseEvent 
     */
    void handleMouseClick(MouseEvent mouseEvent) {
        int x = (int) mouseEvent.getX();
        int y = (int) mouseEvent.getY();
   
    }
    
    /**
     * actie op opstartenKnop
     * @param event 
     */
    void btnOpstartenHandler(ActionEvent event){
        System.out.println("Reset spel");
        zeeslagModel.opstarten();
        update();
        
    }
    /**
     * actie op startKnop
     * @param event 
     */
    void btnStartHandler(ActionEvent event){
        System.out.println("Start het spel");
        zeeslagModel.Start();
        update();
        
    }
    /**
     * actie op draaiKnop
     * @param event 
     */
    void btnDraaienHandler(ActionEvent event){
        System.out.println("Draai boot");
        bootModel.roteer();
        update();
  
    }
    /**
     * actie op loadKnop
     * @param event 
     */
    public void handleLoadBtn(ActionEvent event){
        System.out.println("laad vorige spel");
        ZeeslagSpel.loadFromJson();
    }
    /**
     * update Views
     */
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

    private void handleBtnSave(ActionEvent event) {
       
    }
    

    
}
