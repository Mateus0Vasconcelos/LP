/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.inf.lista02.p1101;

/**
 *
 * @author mateu
 */
import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        while (true) {
            int m = scan.nextInt(), n = scan.nextInt();
            if (m <= 0 || n <= 0) {
                break;
            }
            int maior, menor;
            if (m > n) {
                maior = m;
                menor = n;
            }
            else {
                maior = n;
                menor = m;
            }
            int soma = 0;
            for (int i = menor; i <= maior; i++) {
                System.out.print(i + " ");
                soma += i;
            }
            System.out.println("Sum=" + soma);
        }
        scan.close();
    }
}