/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.inf.lista01.p1006;

/**
 *
 * @author mateu
 */
import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        float A = scan.nextFloat();
        float B = scan.nextFloat();
        float C = scan.nextFloat();
        float MEDIA = (A * 2 + B * 3 + C * 5) / 10;
        System.out.printf("MEDIA = %.1f\n", MEDIA);
    }
 
}