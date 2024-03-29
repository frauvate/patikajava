import java.util.Scanner;

public class HarmonikOrtalama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin eleman sayısını girin: ");
        int n = scanner.nextInt();

        double[] dizi = new double[n];
        System.out.println("Dizinin elemanlarını girin:");
        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + ". elemanı girin: ");
            dizi[i] = scanner.nextDouble();
        }

        scanner.close();

        double harmonikOrtalama = calculateHarmonicMean(dizi);

        System.out.println("Dizinin harmonik ortalaması: " + harmonikOrtalama);
    }

    // Harmonik ortalama hesaplayan metot
    private static double calculateHarmonicMean(double[] array) {
        double sumOfReciprocals = 0;
        for (double num : array) {
            sumOfReciprocals += 1 / num;
        }
        return array.length / sumOfReciprocals;
    }
}
