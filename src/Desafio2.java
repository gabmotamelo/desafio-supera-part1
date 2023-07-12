import java.util.InputMismatchException;
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = 0.0;
        boolean inputValido = false;

        while (!inputValido) {
            try {
                String entrada = scanner.nextLine().replace(",", ".");
                valor = Double.parseDouble(entrada);
                inputValido = true;
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Digite o valor com vírgula.");
            }
        }

        int[] notas = {100, 50, 20, 10, 5, 2};
        double[] moedas = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};

        System.out.println("NOTAS:");
        for (int nota : notas) {
            int quantidadeNotas = (int) (valor / nota);
            valor -= quantidadeNotas * nota;
            System.out.println(quantidadeNotas + " nota(s) de R$ " + nota + ".00");
        }

        System.out.println("MOEDAS:");
        for (double moeda : moedas) {
            int quantidadeMoedas = (int) (valor / moeda);
            valor -= quantidadeMoedas * moeda;
            System.out.println(quantidadeMoedas + " moeda(s) de R$ " + String.format("%.2f", moeda));
        }
    }
}
