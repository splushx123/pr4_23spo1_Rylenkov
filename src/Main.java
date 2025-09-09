import java.util.Random;
import java.util.Scanner;


class LabWork {
    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static int countLocalMinima(int[] arr) {
        int count = 0;
        int n = arr.length;
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Введите размер массива (≤ 100): ");
        int n = scanner.nextInt();

        if (n > 100 || n <= 0) {
            System.out.println("Некорректный размер массива!");
            scanner.close();
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(101);
        }

        int localMinimaCount = countLocalMinima(arr);

        System.out.print("Сгенерированный массив: ");
        printArray(arr);
        System.out.println("Количество локальных минимумов: " + localMinimaCount);

        scanner.close();
    }
}