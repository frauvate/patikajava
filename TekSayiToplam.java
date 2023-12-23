package chapterone;
import java.util.Scanner;

public class TekSayiToplam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("bir sayi girin: ");
        int sayi = scanner.nextInt();

        int toplam = 0;

        for (int i = 1; i <= sayi; i += 2) {
            toplam += i;
        }

        System.out.println("1'den " + sayi + " kadar olan tek sayilarin toplami: " + toplam);
    }
}
