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
    
    
    public void addBoten(Boot Boten)
    {
        list.add(Boten);
    }
 
    public static void Main(){
        Boten vliegdekschip;
        vliegdekschip = new Boot(5,5,false,x,y,HORIZONTAAL,0);
    
        Boten slagschip;
        slagschip = new Boot(4,4,false,x,y,HORIZONTAAL,0);
        
        Boten Duikboot;
        Duikboot = new Boot(3,3,false,x,y,HORIZONTAAL,0);
        
        Boten torpedobootjager;
        torpedobootjager = new Boot(5,5,false,x,y,HORIZONTAAL,0);
        
        Boten patrouilleschip;
        patrouilleschip = new Boot(5,5,false,x,y,HORIZONTAAL,0);



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