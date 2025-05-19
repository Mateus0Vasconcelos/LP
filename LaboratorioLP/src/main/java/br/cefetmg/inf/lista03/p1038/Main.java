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
    double getValor(int quantidade) {
        double preco = this.preco;
        return quantidade * preco;
    }
    void setLanche(int codigo, String especificacao, double preco) {
        this.codigo = codigo;
        this.especificacao = especificacao;
        this.preco = preco;
    }
}
class Cardapio {
    ArrayList<Lanche> lanches;
    void setLanches() {
        lanches = new ArrayList<>();
    }
    void add(int codigo, String especificacao, double preco) {
        Lanche novoLanche = new Lanche();
        novoLanche.setLanche(codigo, especificacao, preco);
        lanches.add(novoLanche);
    }
}
public class Main {
    public static void main(String args[]) {  
        Cardapio cardapio = new Cardapio();
        cardapio.setLanches();
        cardapio.add(1, "Cachorro Quente", 4.0);
        cardapio.add(2, "X-Salada", 4.5);
        cardapio.add(3, "X-Bacon", 5.0);
        cardapio.add(4, "Torrada Simples", 2.0);
        cardapio.add(5, "Refrigerante", 1.5);
    }
}