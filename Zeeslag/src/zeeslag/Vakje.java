package Zeeslag;


public class Vakje {
    private int aantal;
    private boolean geraakt;
    private boolean gemist;
    private int coordinaat;
    
    
    public Vakje() {
        aantal = 100;
        geraakt = false;
        gemist = false;
    }

    public boolean isGeraakt() {
        return geraakt;
    }

    public boolean isGemist() {
        return gemist;
    }

    public int getCoordinaat() {
        return coordinaat;
    }
    
}
