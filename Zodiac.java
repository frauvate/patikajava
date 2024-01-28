import java.util.Scanner;

public class Zodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter your birth year:");
        int year = input.nextInt();

        if(year%12 <= 0) {
            System.out.println("your chinese zodiac is monkey");
        }else if(year%12 <= 1) {
            System.out.println("your chinese zodiac is cockerel");
        } else if(year%12 <= 2) {
            System.out.println("your chinese zodiac is dog");
        } else if(year%12 <= 3) {
            System.out.println("your chinese zodiac is pig");
        } else if(year%12 <= 4) {
            System.out.println("your chinese zodiac is rat");
        } else if(year%12 <= 5) {
            System.out.println("your chinese zodiac is ox");
        } else if(year%12 <= 6) {
            System.out.println("your chinese zodiac is tiger");
        } else if(year%12 <= 7) {
            System.out.println("your chinese zodiac is rabbit");
        }else if(year%12 <= 8) {
            System.out.println("your chinese zodiac is dragon");
        } else if(year%12 <= 9) {
            System.out.println("your chinese zodiac is snake");
        } else if(year%12 <= 10) {
            System.out.println("your chinese zodiac is horse");
        } else if(year%12 <= 11) {
            System.out.println("your chinese zodiac is sheep");        
        }
    }
}
