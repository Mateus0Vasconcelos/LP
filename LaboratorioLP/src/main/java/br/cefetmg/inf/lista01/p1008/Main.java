/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.inf.lista01.p1008;

/**
 *
 * @author mateu
 */
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        int horasTrabalhadas = scan.nextInt();
        float valorHora = scan.nextFloat();
        float salario = horasTrabalhadas * valorHora;
        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f\n", salario);       
    }
}