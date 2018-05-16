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
public class Zad2 {
    
    Scanner odczyt = new Scanner(System.in);
    
    int tab[] = new int[5];
    
    public void add()
    {
    try
    {
        for(int i=0; i<10; i++)
        {
            tab[i] = odczyt.nextInt();
        }
    }
        catch(ArrayIndexOutOfBoundsException e)
                {
                System.out.println("Zbyt dużo wartości w tablicy");
                }
        
    
    
    }
    
}
