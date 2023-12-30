package chapterone;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("fibonacci dizisinin kacinci terimini gormek istiyorsunuz?:");
        int terim = input.nextInt();
        System.out.println(terim + "'ci terim:" + " " + fibo(terim));
    }
    static int fibo(int x) {
        if(x == 1 || x == 2) {
            return 1;
        }
        return fibo(x-1) + fibo(x-2);
    }
}
