/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Zad3 extends Exception {
    
    Scanner odczyt = new Scanner(System.in);
    
    public void dziel()
    {
        
        try
        {
            
       
        System.out.println("Podaj dzielna");
        int a = odczyt.nextInt();
        System.out.println("Podaj dzielnik");
        int b = odczyt.nextInt();
            int w = a/b;
            System.out.println(w);
        }
        
        catch(ArithmeticException e)
        {
            System.out.println("Dzielenie przez 0");
        }
        
    }
    
}
