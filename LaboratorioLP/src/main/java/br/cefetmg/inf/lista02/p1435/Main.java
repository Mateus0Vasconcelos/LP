/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.inf.lista02.p1435;

/**
 *
 * @author aluno
 */
import java.util.Scanner;
import java.io.IOException;
public class Main {
    public static void main(String args[]) throws IOException{
        StringBuilder strBuilder = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int valor;
        while (n != 0) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    valor = i;
                    if (j < valor)
                        valor = j;
                    if (n - i + 1 < valor)
                        valor = n - i + 1;
                    if (n - j + 1 < valor)
                        valor = n - j + 1;
                    strBuilder.append(String.format("%3d", valor));
                    if (j < n) {
                        strBuilder.append(" ");
                    }
                    else {
                        strBuilder.append("\n");
                    }
                }
                System.out.print(strBuilder.toString());
                strBuilder.delete(0, strBuilder.length());
            }
            System.out.println();
            n = scan.nextInt();
        }
    }
}