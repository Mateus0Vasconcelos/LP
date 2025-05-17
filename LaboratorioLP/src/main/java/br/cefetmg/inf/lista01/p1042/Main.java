/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.inf.lista01.p1042;

/**
 *
 * @author mateu
 */
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        int[] valores = new int[3];
        int[] auxValores = new int[3];
        for (int i = 0; i < 3; i++) {
            valores[i] = scan.nextInt();
            auxValores[i] = valores[i];
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2 - i; j++) {
                if (valores[j] > valores[j + 1]) {
                    int temp = valores[j + 1];
                    valores[j + 1] = valores[j];
                    valores[j] = temp;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(valores[i]);
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println(auxValores[i]);
        }

        scan.close();
    }
}