package chapterone;
import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double elmakg = 3.67;
        double armutkg = 2.14;
        double domatkg = 1.11;
        double muzkg = 0.95;
        double patlkg = 5.0;

        System.out.print("armut kaç kg?:");
        double armut = input.nextDouble();
        System.out.print("elma kaç kg?:");
        double elma = input.nextDouble();
        System.out.print("domates kaç kg?:");
        double domates = input.nextDouble();
        System.out.print("muz kaç kg?:");
        double muz = input.nextDouble();
        System.out.print("patlican kaç kg?:");
        double patlican = input.nextDouble();

        double toplam = (armut*armutkg) + (elma*elmakg) + (domates*domatkg) + (muz*muzkg) + (patlican*patlkg);
        System.out.println("toplam tutar:" + toplam);
            }
}
