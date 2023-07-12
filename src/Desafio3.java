import java.util.Arrays;
import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int n = scanner.nextInt();

        System.out.print("Digite o valor alvo: ");
        int k = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = countPairsWithDifferenceK(arr, k);
        System.out.println("Número de pares com diferença igual a " + k + ": " + count);
    }

    public static int countPairsWithDifferenceK(int[] arr, int k) {
        Arrays.sort(arr);

        int count = 0;
        int left = 0;
        int right = 0;

        while (right < arr.length) {
            int diff = arr[right] - arr[left];

            if (diff == k) {
                count++;
                left++;
                right++;
            } else if (diff > k) {
                left++;
            } else {
                right++;
            }
        }

        return count;
    }
}

