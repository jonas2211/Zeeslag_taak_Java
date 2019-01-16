package Zeeslag;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import zeeslag.Boot;
/*
* @auctor Rens, Bavo, Jonas
*klasse voor schietmarkering
*/

public class Vakje extends Rectangle{
    private Boot bootModel;
    private boolean geschoten = false;
    private int x, y;
    private Bord bordModel;

    public Vakje(Boot bootModel, boolean geraakt, int x, int y) {
        super(30,30);
        this.bootModel = bootModel;
        this.x = x;
        this.y = y;
        setFill(Color.ROYALBLUE);
        setStroke(Color.BLACK);
    }
    public boolean schieten(){
        geschoten = true;
        setFill(Color.WHITE);
        if (bootModel != null){
            bootModel.Geraakt();
            setFill(Color.RED);
            if (!bootModel.levend()){
                bordModel.aantalBoten--;
            }
            return true;
        }
        return false;
    }
    
}