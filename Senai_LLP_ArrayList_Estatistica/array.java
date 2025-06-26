package Senai_LLP_ArrayList_Estatistica;

import java.util.Scanner;
import java.util.Random;
public class array {
        @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Random random = new Random();
        int[] N = new int[25];
        int Media, Moda, Desvio, Cont1 = 0, Cont2 = 0, Contador = 0, Soma = 0;
        for (int i = 0; i <= N.length; i++) {
            N[i] = random.nextInt(i);
            System.out.print(N[i] + " ");
        }
        int Maior = N[0], Menor = N[0];
        for (int i = 0; i < N.length; i++) {
            for (int j = 0; j < N.length; j++) {
                if (N[i] == N[j]) {
                    Contador++;
                    Moda = N[i];
                    if (N[i] == N[j]) {
                        
                    }
                    Cont1 = N[i];
                    Cont2 = N[j];
                }
            }
            if (N[i] > Maior) {
                Maior = N[i];
            }
            if (N[i] < Menor) {
                Menor = N[i];
            }
            Soma += N[i];
        }
        Media = Soma / N.length;
        
    }
}