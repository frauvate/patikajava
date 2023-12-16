package chapterone;
import java.util.Scanner;
import java.lang.Math;

public class VucutKitleIndeks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("boyunuzu metre cinsinden giriniz:");
        double boy = input.nextDouble();
        System.out.print("kilonuzu kg cinsinden giriniz:");
        double kilo = input.nextDouble();

        double indeks = kilo/(boy*boy);

        System.out.print("cinsiyetinizi kadin icin 1 erkek icin 2 seklinde yaziniz:");
        int secim = input.nextInt();
        if(secim==1) {
            if(indeks<=23) {
                System.out.println("vucut kitle indeksiniz:" + indeks + "kilolu degil");
            } else {
                System.out.println("vucut kitle indeksiniz:" + indeks + "kilolu");
            }
        } else {
            if(indeks<=25) {
                System.out.println("vucut kitle indeksiniz:" + indeks + "kilolu degil");
            } else {
                System.out.println("vucut kitle indeksiniz:" + indeks + "kilolu");
            }
        }
    }
}
