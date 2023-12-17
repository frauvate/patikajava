package chapterone;
import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayiyi giriniz:");
        int n1 = input.nextInt();
        System.out.print("Ikinci sayiyi giriniz:");
        int n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Seciniz:");
        int secim = input.nextInt();

        switch(secim) {
            case 1:
            System.out.println(n1 + "+" + n2 + "=" + (n1+n2));
            break;
            case 2:
            System.out.println(n1 + "-" + n2 + "=" + (n1-n2));
            break;
            case 3:
            System.out.println(n1 + "*" + n2 + "=" + (n1*n2));
            break;
            case 4:
            System.out.println(n1 + "/" + n2 + "=" + (n1/n2));
            break;
        }
    }
}