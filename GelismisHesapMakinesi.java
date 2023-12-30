package chapterone;
import java.util.Scanner;

public class GelismisHesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1-Toplam" + /n + "2-Fark" + /n + "3-Carpim" + /n + "4-Bolum" + /n + "5-Uslu Sayi /n 6-Faktoriyel /n 7-Dikdortgen alan /n  8-Daire Alan");
            int select;   
            System.out.print("Lütfen bir işlem seçiniz :");
            select = input.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    squareArea();
                    break;
                case 8:
                    circleArea();
                default:
                    System.out.println("Yanlis bir değer girdiniz, tekrar deneyiniz.");
            }
    }
    static void plus() {
        Scanner inp = new Scanner(System.in);
        int number, result = 1;
        while(true) {
            System.out.print("sayi:");
            number = inp.nextInt();
            if(number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("sonuc:" + result);
    }
    static void minus() {
        Scanner inp = new Scanner(System.in);
        System.out.print("kac adet sayi gireceksiniz:");
        int counter = inp.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print("sayi:");
            number = inp.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("sonuc:" + result);
    }
    static void times() {
        Scanner inp = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print("sayi:");
            number = inp.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("sonuc" + result);
    }
    static void divided() {
        Scanner inp = new Scanner(System.in);
        System.out.print("kac adet sayi gireceksiniz:");
        int counter = inp.nextInt();
        double number, result = 0.0;

        for (int i = 1; i<=counter; i++) {
            System.out.print("sayi:");
            number = inp.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("boleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.println("Sonuç : " + result);
    }
    static void power() {
        Scanner inp = new Scanner(System.in);
        System.out.print("taban degeri giriniz:");
        int base = inp.nextInt();
        System.out.print("us degeri giriniz:");
        int exponent = inp.nextInt();
        int result = 1;

          for (int i = 1; i <= exponent; i++) {
            result *= base;
          }
        System.out.println("sonuc:" + result);
    }
    static void factorial() {
        Scanner inp = new Scanner(System.in);
        System.out.print("sayi:");
        int number = inp.nextInt();
        int result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println("sonuc:" + result);
    }
    static void squareArea() {
        Scanner inp = new Scanner(System.in);
        System.out.print("birinci kenar:");
        int side1 = inp.nextInt();
        System.out.print("ikinci kenar:");
        int side2 = inp.nextInt();

        int area = side1 * side2;
        System.out.println("sonuc:" + area);
    }
    static void circleArea() {
        final double PI = 3.14;
        Scanner inp = new Scanner(System.in);
        System.out.print("yaricap degeri:");
        double radius = inp.nextDouble();
        double area = radius*radius*PI;
        System.out.println("sonuc:" + area);
    }
}