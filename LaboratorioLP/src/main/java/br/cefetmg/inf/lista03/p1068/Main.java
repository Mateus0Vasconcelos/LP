/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.inf.lista03.p1068;

/**
 *
 * @author mateu
 */
import java.util.Scanner;
import java.util.ArrayList;
class Pilha {
    private char[] pilha;
    Pilha() {
        pilha = new char[0];
    }
    void empilhar(char caractere) {
        char[] arrayAux = new char[pilha.length + 1];
        System.arraycopy(pilha, 0, arrayAux, 1, pilha.length);
        pilha = arrayAux;
    }
    void desempilhar() {
        char[] arrayAux = new char[pilha.length - 1];
        System.arraycopy(pilha, 0, arrayAux, 0, pilha.length - 1);
        pilha = arrayAux;
    }
    boolean isEmpty() {
        if (pilha.length == 0)
            return true;
        return false;
    }
    char getTopo() {
        return pilha[pilha.length - 1];
    }
}
class Expressao {
    String stringExpressao;
    void validarExpressao() {
        Pilha parenteses = new Pilha();
        for (int i = 0; i < stringExpressao.length(); i++) {
            char caractere = stringExpressao.charAt(i);
            if (caractere == '(') {
                parenteses.empilhar(caractere);
            }
            else if (caractere  == ')' && parenteses.isEmpty()) {
                System.out.println("incorrect");
                return;
            }
            else if (caractere  == ')') {
                parenteses.desempilhar();
            }
        }
        if (parenteses.isEmpty()) {
            System.out.println("correct");
            return;
        }
        System.out.println("incorrect");
    }
}
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Expressao expressao = new Expressao();
        while(scan.hasNext()) {
            expressao.stringExpressao = scan.next();
            expressao.validarExpressao();
        }
        scan.close();
    }
}
