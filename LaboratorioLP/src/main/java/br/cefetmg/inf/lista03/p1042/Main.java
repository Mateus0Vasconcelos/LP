/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.inf.lista03.p1042;

/**
 *
 * @author mateu
 */
import java.util.Scanner;
class Array {
    int[] array;
    Array() {
        array = new int[3];
    }
    void set() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < array.length; i++)
            array[i] = scan.nextInt();
        scan.close();
    }
    void print() {
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }
    void copy(int[] array2) {
        for (int i = 0; i < array.length; i++)
            array2[i] = array[i];
    }
}
class Sorter {
    void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min])
                    min = j;
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }
}
public class Main {
    public static void main(String args[]) {
        Sorter sorter = new Sorter();
        Array vetor = new Array();
        Array vetorAux = new Array();
        vetor.set();
        vetor.copy(vetorAux.array);
        sorter.selectionSort(vetor.array);
        vetor.print();
        System.out.println();
        vetorAux.print();
    }
}
