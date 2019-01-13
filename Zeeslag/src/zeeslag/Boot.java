/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeeslag;
/**
 *
 * @author Bavo, Jonas, Rens
 */
public class Boot {
    private ZeeslagController controllerModel;
    // private String naam;
    //naam is niet nodig omdat we een apparte klasse voor elke boot hebben en dus weten over welke boot het gaat
    private int size;
    int levens;
    private boolean gezonken;
    private int row,column;
    private Orientatie orientatie;
    private int rotatieHoek;
    private Type type;
    

   
    public Boot(int size, int column, int row, Orientatie o, Type type) {
        this.gezonken = false;
        this.type = type;
        this.size = size;
        this.levens = size;
        this.row = row;
        this.column = column;
        this.orientatie = o;
        rotatieHoek = 0;
    }
    
    public Boot(int[]Coordinaten, Type type){
        this.row = Coordinaten[0];
        this.column = Coordinaten[1];
        this.type = type;
        this.gezonken = false;
    }
    // getters

    public Type getType() {
        return type;
    }
    
    public int[] getCoordinaten(){
        int[] c = {this.row,this.column};
        return c;
    }
    /*
    public String getNaam() {
        return naam;
    }
*/

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int getSize() {
        return size;
    }
    
    public int getLevens() {
        return levens;
    }

    public Orientatie getOrientatie() {
        return orientatie;
    }
    
    public int getRotatieHoek(){
        return rotatieHoek;
    }
    
    //setters en andere methodes
    
    
    public boolean isGezonken() {
        return gezonken;
    }

    /*
    public void setNaam(String naam) {
        this.naam = naam;
    }
*/

    public void setSize(int size) {
        this.size = size;
    }

    public void setGezonken(boolean gezonken) {
        this.gezonken = gezonken;
    }
    public void Geraakt(){
        if (levens == 0){
            gezonken = true;
            System.out.println("gezonken");
        }
        else 
            levens --;
    }
    /*
    public void Hit() {
        this.gezonken = false;
        levens = levens -1;
    } hit en geraakt doen hetzelfde
*/
     
    
    private void setCoordinaten(int row, int column) {
        this.row = row;
        this.column = column;
    }
    
    public boolean verplaatsNaar(int row, int column) {
        if (this.row == row || this.column == column) {
            setCoordinaten(row, column);
            return true;
            //stel de nieuwe kolom en/of nieuwe rij in als rij en/of kolom;
        } else {
            return false;
        }
    }
    
    public void roteer(){
        int rotatieHoek = 0;

        if(rotatieHoek == 0){
            rotatieHoek = 90;
        }
        else{
            if(rotatieHoek == 90){
                rotatieHoek = 0;
            }
        }
    }
    
}
