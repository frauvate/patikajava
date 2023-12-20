package chapterone;
import java.util.Scanner;

public class Karne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat,fizik,kimya,biyo,turk;
        int a = 5;

        System.out.print("matematik notunuz:");
        mat = input.nextInt();
        System.out.print("fizik notunuz:");
        fizik = input.nextInt();
        System.out.print("kimya notunuz:");
        kimya = input.nextInt();
        System.out.print("biyoloji notunuz:");
        biyo = input.nextInt();
        System.out.print("turkce notunuz:");
        turk = input.nextInt();

        if( mat<100 && fizik<100 && kimya<100 && biyo<100 && turk<100 ) {
            double ortalama = ( mat + fizik + kimya + biyo + turk ) / a;
            if( ortalama>=50) {
                System.out.println("sinifi gectiniz. oralamaniz:" + ortalama);
            } else {
                System.out.println("sinifi gecemediniz. ortalamaniz:" +  ortalama);
            }
        } else {
            System.out.println("not girisi gecersiz.");
        }
    }
}
