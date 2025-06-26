import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        ArrayList<String> descricoes = new ArrayList<>();
        ArrayList<Integer> quantidades = new ArrayList<>();
        ArrayList<String> categorias = new ArrayList<>();

        while (true) {
            System.out.print("Escreva algo: ");
            String descricao = leia.nextLine();

            if (descricao.isEmpty()) {
                break;
            }

            System.out.print("Quantidade do item: ");
            int quantidade = leia.nextInt();
            leia.nextLine();

            System.out.println("Selecione a categoria:");
            System.out.println("1. Alimento");
            System.out.println("2. Eletrônico");
            System.out.println("3. Outros");
            System.out.print("Opção: ");
            int opcao = leia.nextInt();
            leia.nextLine();

            String categoria;
            if (opcao == 1) {
                categoria = "Alimento";
            } else if (opcao == 2) {
                categoria = "Eletrônico";
            } else {
                categoria = "Outros";
            }

            descricoes.add(descricao);
            quantidades.add(quantidade);
            categorias.add(categoria);
        }

        System.out.println("\n= Lista de itens =");
        for (int i = 0; i < descricoes.size(); i++) {
            System.out.println(categorias.get(i) + " " + descricoes.get(i) + " " + quantidades.get(i));
        }

        leia.close();
    }
}
