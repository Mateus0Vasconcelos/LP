/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.inf.p1094;

/**
 *
 * @author mateu
 */
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        
        Scanner scan = new Scanner(System.in);
        int testes = scan.nextInt();
        int cobaias, coelhos, ratos, sapos;
        cobaias = coelhos = ratos = sapos = 0;
        for (int i = 0; i < testes; i++) {

            int quantia = scan.nextInt();
            char tipo = scan.next().charAt(0);
            switch (tipo) {
                case 'C':
                    coelhos += quantia;
                    break;
                case 'R':
                    ratos += quantia;
                    break;
                case 'S':
                    sapos += quantia;
                    break;
            }
            cobaias += quantia;
        }
        float percentualCoelhos = 100 * (float) coelhos / cobaias;
        float percentualRatos = 100 * (float) ratos / cobaias;
        float percentualSapos = 100 * (float) sapos / cobaias;
        System.out.printf("Total: %d cobaias\n" +
                        "Total de coelhos: %d\n" +
                        "Total de ratos: %d\n" +
                        "Total de sapos: %d\n", cobaias, coelhos, ratos, sapos);
        System.out.printf("Percentual de coelhos: %.2f", percentualCoelhos);
        System.out.println(" %");
        System.out.printf("Percentual de ratos: %.2f", percentualRatos);
        System.out.println(" %");
        System.out.printf("Percentual de sapos: %.2f", percentualSapos);
        System.out.println(" %");
        scan.close();
    }
 
}