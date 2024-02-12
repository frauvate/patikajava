import java.util.Scanner;

public class PalindromeWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir kelime girin: ");
        String kelime = scanner.nextLine();

        if (isPalindromic(kelime)) {
            System.out.println(kelime + " palindromik bir kelime.");
        } else {
            System.out.println(kelime + " palindromik bir kelime değil.");
        }

        scanner.close();
    }

    // Metot, bir kelimenin palindromik olup olmadığını kontrol eder
    private static boolean isPalindromic(String kelime) {
        int uzunluk = kelime.length();
        for (int i = 0; i < uzunluk / 2; i++) {
            if (kelime.charAt(i) != kelime.charAt(uzunluk - i - 1)) {
                return false; // Karakterler eşleşmezse, kelime palindromik değil
            }
        }
        return true; // Tüm karakterler eşleşirse, kelime palindromiktir
    }
}
