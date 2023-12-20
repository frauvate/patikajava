package chapterone;
import java.util.Scanner;

public class TekSayiToplam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("sayi giriniz:");
        int sayi = input.nextInt();

        for( int i=0 ; i<=sayi ; i++ ) {
            if(sayi%2!=0) {
               int toplam = toplam + i;
            }
        } System.out.println("girilen sayiyiya kadar olan tek sayilarin toplami:" + toplam);
    }
}
