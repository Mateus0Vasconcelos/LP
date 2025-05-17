/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.inf.lista02.p1245;

/**
 *
 * @author mateu
 */
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner scan = new Scanner(System.in);;
        int n;
        
        for (int j = 0; j < 2; j++) {//while (scan.hasNext()) {
            n = scan.nextInt();
            int[] tamanhosDireita = new int[31];
            int[] tamanhosEsquerda = new int[31];
            
            for (int i = 0; i < n; i++) {
                int tamanho = scan.nextInt();
                char lado = scan.next().charAt(0);
                
                if (lado == 'D')
                    tamanhosDireita[tamanho - 30]++;
                else
                    tamanhosEsquerda[tamanho - 30]++;
            }
            
            int contador = 0;
            
            for (int i = 0; i < 31; i++) {
                if (tamanhosDireita[i] <= tamanhosEsquerda[i]) {
                    contador += tamanhosDireita[i];
                    continue;
                }
                contador += tamanhosEsquerda[i];
            }
            System.out.println(contador);
        }
        scan.close();
    }
}
    