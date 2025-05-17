/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.inf.lista01.p1005;

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
        double MEDIA = (A * 3.5 + B * 7.5) / 11;
        System.out.printf("MEDIA = %.5f\n", MEDIA);
    }
 
}