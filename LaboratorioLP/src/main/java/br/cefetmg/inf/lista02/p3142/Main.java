/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.inf.lista02.p3142;

/**
 *
 * @author mateu
 */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String stringColuna;
        while (br.ready()) {
            stringColuna = br.readLine();
            if (stringColuna.length() <= 3) {
                int coluna = 0;
                for (int i = stringColuna.length() - 1, peso = 1; i >= 0; i--, peso *= 26)
                    coluna += peso * (stringColuna.charAt(i) - 64);
                if (coluna <= 16384)
                    System.out.println(coluna);
                else
                    System.out.println("Essa coluna nao existe Tobias!");
            }
            else
                System.out.println("Essa coluna nao existe Tobias!");
        }
    }
}