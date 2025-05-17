/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.inf.lista02.p1134;

/**
 *
 * @author mateu
 */
import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        int[] tiposCombustivel = {0, 0, 0};
        int tipo;
        while (true) {
            do {
                tipo = scan.nextInt();
            } while (tipo < 0 || tipo > 4);
            if (tipo == 4) {
                break;
            }
            tiposCombustivel[tipo - 1]++;
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + tiposCombustivel[0]);
        System.out.println("Gasolina: " + tiposCombustivel[1]);
        System.out.println("Diesel: " + tiposCombustivel[2]);
        scan.close();
    }
}