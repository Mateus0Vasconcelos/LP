/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.inf.lista02.p1129;

/**
 *
 * @author mateu
 */
import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        char[] letras = {'A', 'B', 'C', 'D', 'E'};
        while (true) {
            int n = scan.nextInt();
            if (n == 0)
                break;
            for (int i = 0; i < n; i++) {
                int[] alternativas = new int[5];
                for (int j = 0; j < 5; j++) {
                    alternativas[j] = scan.nextInt();
                }
                int alternativa = -1;
                for (int j = 0; j < 5; j++) {
                    if (alternativas[j] <= 127 && alternativa == -1) {
                        alternativa = j;
                    }
                    else if (alternativas[j] <= 127 && alternativa != -1) {
                        alternativa = -1;
                        break;
                    }
                }
                if (alternativa == -1) {
                    System.out.println("*");
                    continue;
                }
                System.out.println(letras[alternativa]);
            }
        }
        scan.close();
    }
}