package chapterone;
import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("faktoriyeli alinacak sayiyi giriniz:");
        int sayi = inp.nextInt();
        faktoriyel(sayi);

        System.out.println(sayi + " " + "sayisinin faktoriyeli:" + " " + faktoriyel(sayi));
    }
    static int faktoriyel(int x) {
        int sonuc = 1;
        for(int i = 1 ; i <= x ; i++) {
            sonuc = sonuc*i;
        }
        return sonuc;
    }
}