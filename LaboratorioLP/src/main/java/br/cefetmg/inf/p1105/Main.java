/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.inf.p1105;

/**
 *
 * @author mateu
 */
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) throws IOException {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int bancos = scan.nextInt();
            int debentures = scan.nextInt();
            if (bancos == 0 && debentures == 0)
                break;
            int[] reservas = new int[bancos];
            for (int i = 0; i < bancos; i++)
                reservas[i] = scan.nextInt();
            for (int i = 0; i < debentures; i++) {
                int devedor = scan.nextInt();
                int credor = scan.nextInt();
                int valor = scan.nextInt();
                reservas[devedor - 1] -= valor;
                reservas[credor - 1] += valor;
            }
            char possibilidade = 'S';
            for (int i = 0; i < bancos; i++) {
                if (reservas[i] < 0) {
                    possibilidade = 'N';
                    break;
                }
            }
            System.out.println(possibilidade);
        }
        scan.close();
    }
}