/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.inf.lista01.p1038;

/**
 *
 * @author mateu
 */
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
 
        float[] precos = new float[5];
        precos[0] = 4;
        precos[1] = 4.5f;
        precos[2] = 5;
        precos[3] = 2;
        precos[4] = 1.5f;
        Scanner scan = new Scanner(System.in);

        int codigo = scan.nextInt();
        int quantidade = scan.nextInt();
        
        float total = quantidade * precos[codigo - 1];

        System.out.printf("Total: R$ %.2f\n", total);
    }
}
