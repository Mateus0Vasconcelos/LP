/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.inf.lista02.p2060;

/**
 *
 * @author mateu
 */
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] contador = {0, 0, 0, 0};
        for (int i = 0; i < n; i++) {
            int m = scan.nextInt();
            for (int j = 2; j <= 5; j++) {
                if (m % j == 0)
                    contador[j - 2]++;
            }
        }
        System.out.println(contador[0] + " Multiplo(s) de 2");
        System.out.println(contador[1] + " Multiplo(s) de 3");
        System.out.println(contador[2] + " Multiplo(s) de 4");
        System.out.println(contador[3] + " Multiplo(s) de 5");
    }
}
