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
import java.util.Scanner;
class Lanche {
    int codigo;
    String especificacao;
    double preco;
    void set(int codigo, String especificacao, double preco) {
        this.codigo = codigo;
        this.especificacao = especificacao;
        this.preco = preco;
    } 
}
class Cardapio {
    ArrayList<Lanche> lanches;
    Cardapio() {
        lanches = new ArrayList<>();
    }
    void add(int codigo, String especificacao, double preco) {
        Lanche novoLanche = new Lanche();
        novoLanche.set(codigo, especificacao, preco);
        lanches.add(novoLanche);
    }
    Lanche get(int codigo) {
        for (int i = 0; i < lanches.size(); i++) {
            if (lanches.get(i).codigo == codigo)
                return lanches.get(i);
        }
        return null;
    }
}
class Venda {
    private int codigo;
    private int quantidade;
    void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    void operarVenda(Cardapio cardapio) {
        double valorCompra = quantidade * cardapio.get(codigo).preco;
        System.out.printf("Total: R$ %.2f\n", valorCompra);
    }
}
public class Main {
    public static void main(String args[]) {  
        Cardapio cardapio = new Cardapio();
        cardapio.add(1, "Cachorro Quente", 4.0);
        cardapio.add(2, "X-Salada", 4.5);
        cardapio.add(3, "X-Bacon", 5.0);
        cardapio.add(4, "Torrada Simples", 2.0);
        cardapio.add(5, "Refrigerante", 1.5);
        Venda venda = new Venda();
        Scanner scan = new Scanner(System.in);
        int codigo = scan.nextInt();
        int quantidade = scan.nextInt();
        scan.close();
        venda.setCodigo(codigo);
        venda.setQuantidade(quantidade);
        venda.operarVenda(cardapio);
    }
}