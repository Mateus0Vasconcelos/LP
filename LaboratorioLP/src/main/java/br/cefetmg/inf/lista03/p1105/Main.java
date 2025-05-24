/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.inf.lista03.p1105;

/**
 *
 * @author mateu
 */
import java.util.Scanner;
import java.util.ArrayList;
class Banco {
    int reserva;
    void setReserva(int valor) {
        reserva += valor;
    }
    boolean saldo() {
        return reserva >= 0;
    }
}
class ListaBancos {
    ArrayList<Banco> bancos;
    void add(int reserva) {
        Banco novoBanco = new Banco();
        novoBanco.setReserva(reserva);
        bancos.add(novoBanco);
    }
    Banco get(int indice) {
        return bancos.get(indice);
    }
    boolean verificarNecessidadeEmprestimo() {
        boolean necessidade = false;
        for (int i = 0; i < bancos.size(); i++) {
            if (!bancos.get(i).saldo()) {
                necessidade = true;
                break;
            }
        }
        return necessidade;
    }
    ListaBancos(int numBancos) {
        bancos = new ArrayList<>();
    }
}
class Liquidador {
    void liquidar(ListaBancos listaBancos, int devedor, int credor, int debenture) {
        listaBancos.get(devedor - 1).setReserva(-debenture);
        listaBancos.get(credor - 1).setReserva(debenture);
    }
}
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Liquidador liquidador = new Liquidador();
        while (true) {
            int numBancos = scan.nextInt();
            int numDebentures = scan.nextInt();
            if (numBancos == 0 && numDebentures == 0)
                break;
            ListaBancos listaBancos = new ListaBancos(numBancos);
            for (int i = 0; i < numBancos; i++) {
                int reserva = scan.nextInt();
                listaBancos.add(reserva);
            }
            for (int i = 0; i < numDebentures; i++) {
                int devedor = scan.nextInt();
                int credor = scan.nextInt();
                int debenture = scan.nextInt();
                liquidador.liquidar(listaBancos, devedor, credor, debenture);
            }
            if (listaBancos.verificarNecessidadeEmprestimo()) {
                System.out.println("N");
                continue;
            }
            System.out.println("S");
        }
        scan.close();
    }
}