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
public class WprowadzZKonsoli {
    
    Scanner odczyt = new Scanner(System.in);
    
    public void wprowadzInt()
    {
        
        try
        {
        System.out.println("Podaj liczbę: ");
        int x = odczyt.nextInt();
            System.out.println(x);
        }
        catch(RuntimeException e)
                {
                System.out.println("Błedna wartość");
                }
        }
    
  

 public void wprowadzFloat()
    {
        
        try
        {
        System.out.println("Podaj liczbę: ");
        float x = odczyt.nextFloat();
            System.out.println(x);
        }
        catch(RuntimeException e)
                {
                System.out.println("Błedna wartość");
                }
        }
    }
        
        
       


