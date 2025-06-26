package Senai_LLP_HelloWorld_Notacao_Polonesa;

import java.util.Scanner;
public class CalculadoraPolonesa {
        @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        double Num1, Num2, Resposta = 0;
        String Operador;

        System.out.println("Digite o valor do primeiro número:");
        Num1 = leia.nextDouble();
        System.out.println("Digite o valor do Segundo número:");
        Num2 = leia.nextDouble();
        System.out.println("Escolha o operador aritmetico (+, -, * ou /):");
        Operador = leia.next();

        switch (Operador) {
            case ("+"):
                Resposta = Num1 + Num2;
                break;
            case ("-"):
                Resposta = Num1 - Num2;
                break;
            case ("*"):
                Resposta = Num1 * Num2;
                break;
            case ("/"):
                Resposta = Num1 / Num2;
                break;
        
            default:
                System.out.println("Operador invalido. Use + - * /");
                break;
        }
        System.out.println(Resposta);

    }
}