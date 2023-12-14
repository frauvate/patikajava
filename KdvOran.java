package chapterone;
import java.util.Scanner;

public class KdvOran {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("urun fiyatini giriniz:");
    double fiyat = input.nextDouble();
    double kdv = 0.18;

    double kdvmiktar = fiyat*kdv;
    double kdvlifiyat = fiyat+kdvmiktar;
    System.out.println("urun fiyati:" + fiyat);
    System.out.println("kdv orani:" + kdv);
    System.out.println("kdv'li fiyat:" + kdvlifiyat);
    }
}