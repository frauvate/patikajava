import java.util.Scanner;

public class MinMaxFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz? ");
        int adet = scanner.nextInt();

        int enKucuk = Integer.MAX_VALUE;
        int enBuyuk = Integer.MIN_VALUE;

        for (int i = 1; i <= adet; i++) {
            System.out.print(i + ". sayıyı girin: ");
            int sayi = scanner.nextInt();

            if (sayi < enKucuk) {
                enKucuk = sayi;
            }
            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }
        }

        scanner.close();

        System.out.println("Girilen sayıların en küçüğü: " + enKucuk);
        System.out.println("Girilen sayıların en büyüğü: " + enBuyuk);
    }
}
