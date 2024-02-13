import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matrisin satır sayısını girin: ");
        int satir = scanner.nextInt();
        System.out.print("Matrisin sütun sayısını girin: ");
        int sutun = scanner.nextInt();

        // Matris oluştur
        int[][] matris = new int[satir][sutun];

        // Matrisi kullanıcıdan al
        System.out.println("Matrisin elemanlarını girin:");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print("Matris[" + i + "][" + j + "]: ");
                matris[i][j] = scanner.nextInt();
            }
        }

        // Matrisin transpozunu oluştur
        int[][] transpoz = new int[sutun][satir];
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                transpoz[j][i] = matris[i][j];
            }
        }

        // Matrisin transpozunu ekrana yazdır
        System.out.println("Matrisin Transpozu:");
        for (int i = 0; i < sutun; i++) {
            for (int j = 0; j < satir; j++) {
                System.out.print(transpoz[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
