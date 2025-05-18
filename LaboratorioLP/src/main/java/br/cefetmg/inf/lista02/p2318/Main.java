/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.inf.lista02.p2318;

/**
 *
 * @author mateu
 */
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws IOException {
        Scanner scan = new Scanner(System.in);
        int[][] quadrados = new int[3][3];
        int contadorZeros = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                quadrados[i][j] = scan.nextInt();
                if (quadrados[i][j] == 0) {
                    contadorZeros++;
                }
            }
        }
        if (contadorZeros != 0) {
            int[][] zeros = new int[contadorZeros][3];
            for (int i = 0, k = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (quadrados[i][j] == 0) {
                        zeros[k][0] = i;
                        zeros[k][1] = j;
                        k++;
                    }
                }
            }
            if ((quadrados[0][0] != 0 || quadrados[1][1] != 0 || quadrados[2][2] != 0) && (quadrados[0][2] != 0 || quadrados[1][1] != 0 || quadrados[2][0] != 0)) {
                int soma = 0;
                for (int i = 0; i < 3; i++) { //colunas
                    for (int j = 0; j < 3; j++) {
                        if (quadrados[i][j] == 0) {
                            soma = 0;
                            break;
                        }
                        soma += quadrados[i][j];
                    }
                    if (soma != 0) {
                        break;
                    }
                }
                if (soma == 0) {
                    for (int i = 0; i < 3; i++) { //linhas
                        for (int j = 0; j < 3; j++) {
                            if (quadrados[j][i] == 0) {
                                soma = 0;
                                break;
                            }
                            soma += quadrados[j][i];
                        }
                        if (soma != 0) {
                            break;
                        }
                    }
                }
                if (soma == 0) { //diagonal principal
                    for (int i = 0; i < 3; i++) {
                        if (quadrados[i][i] == 0) {
                            soma = 0;
                            break;
                        }
                        soma += quadrados[i][i];
                    }
                }
                if (soma == 0) { //diagonal secundária
                    for (int i = 0; i < 3; i++) {
                        soma += quadrados[i][2 - i];
                    }
                }

                boolean finalizado = false;
                for (int i = 0; !finalizado; i++) {
                    int k = i % contadorZeros;
                    int valorOriginal = 0;
                    for (int j = 0; j < 3; j++) {
                        if (j == zeros[k][1]) {
                            continue;
                        }
                        if (quadrados[zeros[k][0]][j] == 0) {
                            valorOriginal = 0;
                            break;
                        }
                        valorOriginal += quadrados[zeros[k][0]][j];
                    }
                    if (valorOriginal == 0) {
                        for (int j = 0; j < 3; j++) {
                            if (j == zeros[k][0]) {
                                continue;
                            }
                            if (quadrados[j][zeros[k][1]] == 0) {
                                valorOriginal = 0;
                                break;
                            }
                            valorOriginal += quadrados[j][zeros[k][1]];
                        }
                    }
                    if (valorOriginal == 0) {
                        continue;
                    }
                    zeros[k][2] = 1;
                    quadrados[zeros[k][0]][zeros[k][1]] = soma - valorOriginal;
                    finalizado = true;
                    for (int j = 0; j < contadorZeros; j++) {
                        if (zeros[j][2] == 0) {
                            finalizado = false;
                        }
                    }
                }
            } else {
                int[] somasParciais = new int[3];
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        somasParciais[i] += quadrados[i][j];
                    }
                }
                for (int i = 0; i < 3; i++) {
                    quadrados[zeros[i][0]][zeros[i][1]] = (-somasParciais[i] + somasParciais[(i + 1) % 3] + somasParciais[(i + 2) % 3]) / 2;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(quadrados[i][j]);
                if (j < 2) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scan.close();
    }
}
