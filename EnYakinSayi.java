import java.util.Arrays;
import java.util.Scanner;

public class EnYakinSayi {
    public static void main(String[] args) {
        int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Girilen Sayı: ");
        int girilenSayi = scanner.nextInt();

        int enKucukEnYakin = Integer.MIN_VALUE;
        int enBuyukEnYakin = Integer.MAX_VALUE;

        for (int eleman : dizi) {
            if (eleman < girilenSayi && eleman > enKucukEnYakin) {
                enKucukEnYakin = eleman;
            }
            if (eleman > girilenSayi && eleman < enBuyukEnYakin) {
                enBuyukEnYakin = eleman;
            }
        }

        System.out.println("Dizi: " + Arrays.toString(dizi));
        System.out.println("Girilen Sayıdan küçük en yakın sayı: " + enKucukEnYakin);
        System.out.println("Girilen Sayıdan büyük en yakın sayı: " + enBuyukEnYakin);

        scanner.close();
    }
}
