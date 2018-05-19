/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

import java.util.Random;

/**
 *
 * @author Sensei
 */
public class Zad4 {
    
    Random r = new Random();
    
    private int dzielnik;
    private int dzielna;
    public int licznik = 0;
    
    public void losuj()
    {
        this.dzielnik = r.nextInt(20)-10;
        this.dzielna = r.nextInt(20)-10;
    }

    @Override
    public String toString() {
        return "Zad4{" + "dzielnik=" + dzielnik + ", dzielna=" + dzielna + '}';
    }
    
    public void dziel()
    {
        int wynik;
       
        
        try{
           
            wynik=this.dzielna/this.dzielnik;
            System.out.println(this.dzielna + "/" + this.dzielnik + " = " + wynik);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Dzielenie przez 0!");
            licznik++;
        
           
        }
        
        
    }
    
    
}
