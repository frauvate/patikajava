package chapterone;
import java.util.Scanner;

public class OrtalamaHesapla {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("vize notu giriniz:");
        double vize = input.nextDouble();
        System.out.print("final notu giriniz:");
        double fnl = input.nextDouble();
        double ortalama = vize*0.4 + fnl*0.6;
        System.out.println("ortalamaniz:" + ortalama);
    }
}