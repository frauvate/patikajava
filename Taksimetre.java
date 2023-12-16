package chapterone;
import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        final double ACILIS = 10.0;
        Scanner input = new Scanner(System.in);

        System.out.print("alinan yolu km cinsinden yaziniz:");
        double yol = input.nextDouble();
        double ucret = ACILIS+(yol*2.2);

        if(ucret<=20) {
            System.out.println("odenecek miktar:" + "20TL");
        } else {
            System.out.println("odenecek miktar:" + ucret);
        }
    }
}
