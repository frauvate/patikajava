import java.util.Arrays;
import java.util.Scanner;

public class Lists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutunu girin: ");
        int boyut = scanner.nextInt();

        int[] dizi = new int[boyut];

        System.out.println("Dizinin elemanlarını girin:");
        for (int i = 0; i < boyut; i++) {
            System.out.print((i+1) + ". elemanı girin: ");
            dizi[i] = scanner.nextInt();
        }

        scanner.close();

        Arrays.sort(dizi); // Diziyi küçükten büyüğe sırala

        System.out.println("Sıralı dizi:");
        for (int eleman : dizi) {
            System.out.print(eleman + " ");
        }
    }
}
