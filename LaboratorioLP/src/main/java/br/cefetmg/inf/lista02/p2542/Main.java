/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.inf.lista02.p2542;

/**
 *
 * @author mateu
 */
import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String args[]) throws IOException {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int atributos = scan.nextInt();
            int numCartasMarcos = scan.nextInt();
            int numCartasLeonardo = scan.nextInt();
            int[][] cartasMarcos = new int[numCartasMarcos][atributos];
            int[][] cartasLeonardo = new int[numCartasLeonardo][atributos];
            for (int i = 0; i < numCartasMarcos; i++) {
                for (int j = 0; j < atributos; j++) {
                    cartasMarcos[i][j] = scan.nextInt();
                }
            }
            for (int i = 0; i < numCartasLeonardo; i++) {
                for (int j = 0; j < atributos; j++) {
                    cartasLeonardo[i][j] = scan.nextInt();
                }
            }
            int escolhaMarcos = scan.nextInt();
            int escolhaLeonardo = scan.nextInt();
            int atributoSorteado = scan.nextInt();
            if (cartasMarcos[escolhaMarcos - 1][atributoSorteado - 1] == cartasLeonardo[escolhaLeonardo - 1][atributoSorteado - 1]) {
                System.out.println("Empate");
            } else if (cartasMarcos[escolhaMarcos - 1][atributoSorteado - 1] > cartasLeonardo[escolhaLeonardo - 1][atributoSorteado - 1]) {
                System.out.println("Marcos");
            } else {
                System.out.println("Leonardo");
            }
        }
        scan.close();
    }
}
