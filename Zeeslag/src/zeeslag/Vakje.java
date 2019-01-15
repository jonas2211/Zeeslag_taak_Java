package Zeeslag;


public class Vakje {
    private int aantal;
    private boolean geraakt;
    private boolean gemist;
    private int row, column;
    
    
    public Vakje(int []coordinaten) {
        aantal = 100;
        geraakt = false;
        gemist = false;
        this.row=coordinaten[0];
        this.column= coordinaten[1];
        
    }

    public boolean isGeraakt() {
        return geraakt;
    }

    public boolean isGemist() {
        return gemist;
    }

    public int [] getCoordinaat(int row, int column) {
        int[]coordinaat={this.row,this.column};
        return coordinaat;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
    
    
    
}
