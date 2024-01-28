import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("bir sayi girin: ");
        int sayi = scanner.nextInt();

        if (sayi <= 1) {
            System.out.println("asal degildir.");
        } else {
            if (asalMi(sayi, 2)) {
                System.out.println(sayi + " asal sayidir.");
            } else {
                System.out.println(sayi + " asal degildir.");
            }
        }
    }

    // Recursive metot ile asal sayı kontrolü
    private static boolean asalMi(int sayi, int bolen) {
        if (bolen <= sayi / 2) {
            if (sayi % bolen == 0) {
                return false; // Sayı bölünüyorsa asal değil
            } else {
                // Recursive çağrı, bir sonraki bölen için
                return asalMi(sayi, bolen + 1);
            }
        } else {
            return true; // Hiçbir bölen bulunamadı, asal sayıdır
        }
    }
}
