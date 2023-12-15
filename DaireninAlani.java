package chapterone;
import java.util.Scanner;

public class DaireninAlani {
    public static void main(String[] args) {
        final double PI_DEGERI = 3.141593;
        Scanner input = new Scanner(System.in);

        System.out.print("buyuk dairenin yaricapini giriniz:");
        double yaricap1 = input.nextDouble();
        double alan1 = PI_DEGERI*yaricap1*yaricap1;
        System.out.print("kucuk dairnin yaricapini giriniz:");
        double yaricap2 = input.nextDouble();
        double alan2 = PI_DEGERI*yaricap2*yaricap2;

        System.out.print("alanlarin toplami icin 1, farki icin 2 giriniz:");
        int secim = input.nextInt();

        if(secim==1) {
            double sonuc = alan1 + alan2;
            System.out.println("sonuc:" + sonuc);
        } else{
           double sonuc = alan1 - alan2;
           System.out.println("sonuc:" + sonuc);
          }
    }
    
}
