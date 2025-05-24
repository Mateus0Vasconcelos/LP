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
    private ArrayList<Character> pilha;
    Pilha() {
        pilha = new ArrayList<>();
    }
    void empilhar(char caractere) {
        pilha.add(caractere);
    }
    void desempilhar() {
        pilha.remove(pilha.size() - 1);
    }
    boolean isEmpty() {
        return pilha.isEmpty();
    }
    char getTopo() {
        return pilha.get(pilha.size() - 1);
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
