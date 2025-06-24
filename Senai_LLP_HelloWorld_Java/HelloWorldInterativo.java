package Senai_LLP_HelloWorld_Java;

import java.util.Scanner;
public class HelloWorldInterativo {
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String Variavel;

        System.out.println("Digite o seu nome: ");
        Variavel = leia.nextLine();

        System.out.println("Hello " + Variavel);
    }
}