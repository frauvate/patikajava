package chapterone;
import java.util.Scanner;
import java.lang.Math;

public class UcgeninAlani {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ucgenin birinci kenarini giriniz:");
        int kenar1 = input.nextInt();
        System.out.print("ucgenin ikinci kenarinş giriniz:");
        int kenar2 = input.nextInt();
        System.out.print("ucgenin ucuncu kenarini giriniz:");
        int kenar3 = input.nextInt();

        int cevre = kenar1+kenar2+kenar3;
        int u = cevre/2;
        int alan = u*(u-kenar1)*(u-kenar2)*(u-kenar3);
        System.out.println("ucgenin alani:" + Math.sqrt(alan));
    }
    
}
