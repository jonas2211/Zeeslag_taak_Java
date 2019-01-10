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
    private String naam;
    private int size;
    private int levens;
    private boolean gezonken;
    //private Positie positie;
    private int x,y;
    //private String Boot2,Boot3,Boot4,Boot5;
    private Orientatie orientatie;
    private int rotatieHoek;

   
    public Boot(String naam, int size, int x, int y, Orientatie o) {
        this.naam = naam;
        this.size = size;
        this.gezonken = false;
        this.levens = size;
        this.x = x;
        this.y = y;
        this.orientatie = o;
        rotatieHoek = 0;
    }
    void Vliegdekschip(){
        this.naam = "vliegdekschip";
        this.size = 5;
        this.gezonken = false;
        this.levens = size;
        this.x = x;
        this.y = y;
        this.orientatie = Orientatie.HORIZONTAAL;
    }
    
    void slagschip(){
        this.naam = "slagschip";
        this.size = 4;
        this.gezonken = false;
        this.levens = size;
        this.x = x;
        this.y = y;
        this.orientatie = Orientatie.HORIZONTAAL;
    }
    
    void onderzeeer(){
        this.naam = "onderzeeer";
        this.size = 3;
        this.gezonken = false;
        this.levens = size;
        this.x = x;
        this.y = y;
        this.orientatie = Orientatie.HORIZONTAAL;
    }
    
    void torpedobootjager(){
        this.naam = "torpedobootjager";
        this.size = 3;
        this.gezonken = false;
        this.levens = size;
        this.x = x;
        this.y = y;
        this.orientatie = Orientatie.HORIZONTAAL;
    }
    
    void Patrouilleschip(){
        this.naam = "Patrouilleschip";
        this.size = 2;
        this.gezonken = false;
        this.levens = size;
        this.x = x;
        this.y = y;
        this.orientatie = Orientatie.HORIZONTAAL;
    }
    
    
    

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getNaam() {
        return naam;
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

    public boolean isGezonken() {
        return gezonken;
    }

    /*public Positie getPositie() {
        return positie;
    }*/

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setGezonken(boolean gezonken) {
        this.gezonken = gezonken;
    }
    public void Geraakt(){
        if (levens == 0){
            gezonken = true;
            System.out.println(naam + "is gezonken");
        }
        else 
            levens --;
    }
    
    public void roteer(boolean roteerRechts){
        int rotatieHoek = 0;
        if(roteerRechts && rotatieHoek == 0){
            rotatieHoek = 90;
        }
        else{
            if(!roteerRechts && rotatieHoek == 90){
                rotatieHoek = -90;
            }
        }
    }
    
    //test
    
}
