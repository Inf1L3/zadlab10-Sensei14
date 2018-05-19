package pl.edu.ur.oopl10;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author mchla
 */
public class Main {

    public static void main(String[] args) throws IOException {
        
        
        
         Scanner odczyt = new Scanner(System.in);
         
//         WprowadzZKonsoli w1 = new WprowadzZKonsoli();
         
//         w1.wprowadzInt();
//         w1.wprowadzFloat();
         
//            Zad2 w2 = new Zad2();
//            w2.add();

//            Zad3 w3 = new Zad3();
//            
//            w3.dziel();



//            Zad4 a = new Zad4();
//            
//            while(a.licznik<3)
//            {
//                a.losuj();
//                a.dziel();
//            }


              WprowadzZKonsoli p1 = new WprowadzZKonsoli();
              p1.ToFileText();
              p1.FromFileText();
             
    }
    
}
