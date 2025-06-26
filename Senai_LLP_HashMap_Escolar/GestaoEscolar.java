import java.util.Scanner;

public class GestaoEscolar {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe a quantidade de alunos: ");
        int qtdAlunos = leia.nextInt();
        leia.nextLine();

        System.out.print("Informe a quantidade de notas por aluno: ");
        int qtdNotas = leia.nextInt();
        leia.nextLine();

        String[] nomes = new String[qtdAlunos];
        double[] medias = new double[qtdAlunos];

        for (int i = 0; i < qtdAlunos; i++) {
            System.out.print("Informe o nome do aluno " + (i + 1) + ": ");
            nomes[i] = leia.nextLine();

            double somaNotas = 0;
            for (int j = 0; j < qtdNotas; j++) {
                System.out.print("Informe a nota " + (j + 1) + " de " + nomes[i] + ": ");
                double nota = leia.nextDouble();
                somaNotas += nota;
            }
            leia.nextLine();
            medias[i] = somaNotas / qtdNotas;
        }

        System.out.println("\n=== RESULTADO FINAL ===");
        for (int i = 0; i < qtdAlunos; i++) {
            String resultado = (medias[i] >= 6.0) ? "APROVADO" : "REPROVADO";
            System.out.printf("%s [%.2f] [%s]\n", nomes[i], medias[i], resultado);
        }

        leia.close();
    }
}
