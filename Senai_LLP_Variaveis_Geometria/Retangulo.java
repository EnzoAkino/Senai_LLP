package Senai_LLP_Variaveis_Geometria;

import java.util.Scanner;
public class Retangulo {
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double N1, N2, Area;
        System.out.println("Digite o valor da base do retangulo: ");
        N1 = leia.nextDouble();
        System.out.println("Digite o valor da altura do retangulo: ");
        N2 = leia.nextDouble();
        Area = N1 * N2;
        System.out.println("Area do retangulo é: " + Area);

    }
}