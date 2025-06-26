import java.util.Scanner;

public class DiadoMes {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o nome do mês: ");
        String mes = leia.nextLine().trim().toLowerCase();

        int dias;

        switch (mes) {
            case "janeiro":
            case "março":
            case "marco":
            case "maio":
            case "julho":
            case "agosto":
            case "outubro":
            case "dezembro":
                dias = 31;
                break;

            case "abril":
            case "junho":
            case "setembro":
            case "novembro":
                dias = 30;
                break;

            case "fevereiro":
                System.out.print("Digite o ano: ");
                int ano = leia.nextInt();
                boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
                dias = bissexto ? 29 : 28;
                break;

            default:
                System.out.println("Mês inválido.");
                leia.close();
                return;
        }

        System.out.println("O mês de " + mes + " tem " + dias + " dias.");

        leia.close();
    }
}
