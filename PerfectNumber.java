import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (isMukemmelSayi(sayi)) {
            System.out.println(sayi + " mükemmel bir sayıdır.");
        } else {
            System.out.println(sayi + " mükemmel bir sayı değildir.");
        }

        scanner.close();
    }

    // Metot, bir sayının mükemmel sayı olup olmadığını kontrol eder
    private static boolean isMukemmelSayi(int sayi) {
        int toplam = 0;

        // 1'den sayıya kadar olan pozitif tam sayıları kontrol ediyoruz
        for (int i = 1; i < sayi; i++) {
            // Eğer i, sayının bir böleniyse, toplama ekliyoruz
            if (sayi % i == 0) {
                toplam += i;
            }
        }

        // Toplam, sayıya eşitse, sayı mükemmel sayıdır
        return toplam == sayi;
    }
}
