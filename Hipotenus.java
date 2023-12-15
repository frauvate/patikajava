package chapterone;
import java.util.Scanner;
import java.lang.Math;

public class Hipotenus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ucgenin birinci kenarini giriniz:");
        double kenar1 = input.nextDouble();
        System.out.print("ucgenin ikinci kenarinş giriniz:");
        double kenar2 = input.nextDouble();
        double hipotenus = (kenar1*kenar1) + (kenar2*kenar2);
        System.out.println("dik ucgenin hipotenusu:" + Math.sqrt(hipotenus));   
     }
}
