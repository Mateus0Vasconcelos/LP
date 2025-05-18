/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.inf.lista02.p2163;

/**
 *
 * @author mateu
 */
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) throws IOException {
        Scanner scan = new Scanner(System.in);
        int linhas = scan.nextInt();
        int colunas = scan.nextInt();
        int[][] terreno = new int[linhas][colunas];
        
        for (int i = 0; i < linhas; i++)  {
            for (int j = 0; j < colunas; j++) {
                terreno[i][j] = scan.nextInt();
            }
        }
        
        int x = 0, y = 0;
        
        for (int i = 0; i < linhas; i++)  {
            
            for (int j = 0; j < colunas; j++) {
                
                if(terreno[i][j] == 42 && i > 0 && j > 0 && i < linhas - 1 && j < colunas - 1) {
                    
                    boolean verificaSabre = true;
                    
                    for (int k = -1; k <= 1; k++) {
                        
                        for (int n = -1; n <= 1; n++) {
                            
                            if (n == 0 && k == 0)
                                continue;
                            if (terreno[i + k][j + n] != 7) {
                                verificaSabre = false;
                                break;
                            }
                        }
                        if (!verificaSabre)
                            break;
                    }
                    if (verificaSabre) {
                        x = i + 1;
                        y = j + 1;
                        break;
                    }
                }
            }
            if (x != 0)
                break;
        }
        
        System.out.println(x + " " + y);
    }
}
