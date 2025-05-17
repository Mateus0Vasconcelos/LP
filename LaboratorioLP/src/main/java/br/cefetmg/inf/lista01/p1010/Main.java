/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.inf.lista01.p1010;

/**
 *
 * @author mateu
 */
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);

        int codigoPeca1 = scan.nextInt();
        int numeroPecas1 = scan.nextInt();
        float valorPeca1 = scan.nextFloat();

        int codigoPeca2 = scan.nextInt();
        int numeroPecas2 = scan.nextInt();
        float valorPeca2 = scan.nextFloat();

        float valorPagar = numeroPecas1 * valorPeca1 + numeroPecas2 * valorPeca2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorPagar);
    }
}