package Senai_LLP_Variaveis_Geometria;

import java.util.Scanner;

public class Caixa {
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int Forma;
        double N1, N2, N3, N4, N5, N6, Area, Raio;
        System.out.println("Digite o valor do comprimento de um dos lados: ");
        N1 = leia.nextDouble();
        System.out.println("Digite o valor da altura de um dos lados: ");
        N2 = leia.nextDouble();
        System.out.println("Digite o valor da largura de um dos lados: ");
        N3 = leia.nextDouble();
        N4 = N1 * N3;
        N5 = N1 * N2;
        N6 = N3 * N2;
        Area = 2 * (N4 + N5 + N6);
        System.out.println("Area da caixa é: " + Area);

    }
}