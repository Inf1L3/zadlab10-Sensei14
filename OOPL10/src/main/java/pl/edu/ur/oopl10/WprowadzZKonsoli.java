/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class WprowadzZKonsoli {

    Scanner odczyt = new Scanner(System.in);

    public void wprowadzInt() {

        try {
            System.out.println("Podaj liczbę: ");
            int x = odczyt.nextInt();
            System.out.println(x);
        } catch (RuntimeException e) {
            System.out.println("Błedna wartość");
        }
    }

    public void wprowadzFloat() {

        try {
            System.out.println("Podaj liczbę: ");
            float x = odczyt.nextFloat();
            System.out.println(x);
        } catch (RuntimeException e) {
            System.out.println("Błedna wartość");
        }
    }

    public void wprowadzString() {

        try {
            System.out.println("Podaj liczbę: ");
            String x = odczyt.nextLine();
            System.out.println(x);
        } catch (RuntimeException e) {
            System.out.println("Błedna wartość");
        }
    }

    public void ToFileText() throws IOException {
        String nazwaplik;
        System.out.println("Podaj nazwę pliku: ");
        nazwaplik = odczyt.nextLine();

        try {
            FileWriter plik = new FileWriter(nazwaplik + ".txt");
            BufferedWriter bw1 = new BufferedWriter(plik);
            String text;
            System.out.println("Wpisz tekst do pliku: ");
            text = odczyt.nextLine();
            bw1.write(text);
            bw1.newLine();
            bw1.close();

        } catch (IOException e) {
            System.out.println("Błąd zapisu do pliku");
        }

    }

    public void FromFileText() throws FileNotFoundException, IOException {
        String nazwapliku;
        System.out.println("Z jakiego pliku chcesz odczytać: ");
        nazwapliku = odczyt.nextLine();
        try {
            FileReader r1 = new FileReader(nazwapliku + ".txt");
            BufferedReader br1 = new BufferedReader(r1);

            String text = br1.readLine();

            do {
                System.out.println(text);
                text = br1.readLine();

            } while (text != null);

        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku");
        }

    }

}
