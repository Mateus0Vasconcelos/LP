/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.inf.lista02.p1071;

/**
 *
 * @author mateu
 */
import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();

        int maior, menor;
        if (x > y) {
            maior = x;
            menor = y;
        }
        else {
            maior = y;
            menor = x;
        }

        int soma = 0;
        for (int i = menor + 1; i < maior; i++) {
            int absI;
            if (i >= 0)
                absI = i;
            else
                absI = -i;
            if (absI % 2 == 1)
                soma += i;
        }

        System.out.println(soma);
        scan.close();
    }
}