/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeeslag;

/**
 *
 * @author Rens Remans
 */
public class Duikboot extends Boot
{
    private int size;

    public Duikboot(int size, String naam, int size, int x, int y, Orientatie o) {
        super(naam, size, x, y, o);
        this.size = 3;
    }
    
    
}
