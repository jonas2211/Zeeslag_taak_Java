/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeeslag;

import java.util.ArrayList;

/**
 *
 * @author Rens Remans
 */
public class BotenList {
    
    private ArrayList list;
    private Boot boot;
    

    public BotenList(ArrayList list) 
    {
       list = new ArrayList<Boot>();
    }
    
    
   /* public void addBoten(Boot Boten)
    {
        list.add(Boten);
    }
 */
    public static void Main(){
        Boot boot1;
        boot1 = new Boot(5,"vliegdekschip",5,false,x,y,HORIZONTAAL,0);
    
        Boot boot2;
        boot2 = new Boot(4,"slagschip",4,false,x,y,HORIZONTAAL,0);
        
        Boot boot3;
        boot3 = new Boot(3,"duikboot",3,false,x,y,HORIZONTAAL,0);
        
        Boot boot4;
        boot4 = new Boot(3,"torpedobootjager",3,false,x,y,HORIZONTAAL,0);
        
        Boot boot5;
        bott5 = new Boot(2,"patrouilleschip",false,x,y,HORIZONTAAL,0);



/*
private String naam;
    private int size;
    int levens;
    private boolean gezonken;
    private int x,y;
    private Orientatie orientatie;
    private int rotatieHoek;

*/


}