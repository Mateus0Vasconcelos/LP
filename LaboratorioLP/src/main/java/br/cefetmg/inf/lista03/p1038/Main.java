/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.inf.lista03.p1038;

/**
 *
 * @author aluno
 */
import java.util.ArrayList;
class Lanche {
    int codigo;
    String especificacao;
    double preco;
}
class Cardapio {
    ArrayList<Lanche> lanches;
    void setLanches() {
        lanches = new ArrayList<>();
    }
    void addLanche(int codigo, String especificacao, double preco) {
        Lanche novoLanche = new Lanche();
        novoLanche.codigo = codigo;
        novoLanche.especificacao = especificacao;
        novoLanche.preco = preco;
        lanches.add(novoLanche);
    }
}
class Venda {
    int codigo;
    int quantidade;
}
public class Main {
    public static void main(String args[]) {  
        Cardapio cardapio = new Cardapio();
        cardapio.setLanches();
        cardapio.addLanche(1, "Cachorro Quente", 4.0);
        cardapio.addLanche(2, "X-Salada", 4.5);
        cardapio.addLanche(3, "X-Bacon", 5.0);
        cardapio.addLanche(4, "Torrada Simples", 2.0);
        cardapio.addLanche(5, "Refrigerante", 1.5);
    }
}