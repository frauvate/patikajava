package chapterone;
import java.util.Scanner;

public class CiftSayiBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("sayi giriniz:");
        int k = input.nextInt();

        for ( int i=0 ; i<=k ; i++ ) {
            if( i%2 <= 0 ) {
                System.out.print(i + ",");
            }
        }
    }
}
