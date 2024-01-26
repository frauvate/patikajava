package chapterone;
import java.util.Scanner;

public class StarSign {
    public static void main(String[] args) {
        Scanner input = new scanner(System.in);

        System.out.print("enter your birth month(all lower case):")
        String month = input.nextline();
        System.out.print("enter your birth day:");
        int day = input.nextInt();

        switch (month) {
            case january:
                if(day<=21) {
                    System.out.println("your star sign is capricorn");
                } else {
                    System.out.println("your star sign is aquarius");
                }
            case february:
                if(day<=19) {
                    System.out.println("your star sign is aquarius");
                } else {
                    System.ot.println("your star sign is pisces");
                }
            case march:
                if(day<=20) {
                    System.out.println("your star sign is pisces");
                } else {
                    System.out.println("your star sign is aries");
                }
            case april:
                if(day<=20) {
                    System.out.println("your star sign is aries");
                } else {
                    System.out.println("your star sign is taurus");
                }
            case may:
                if(day<=21) {
                    System.out.println("your star sign is taurus");
                } else {
                    System.out.println("your star sign is gemini");
                }
            case june:
                if(day<=22) {
                    System.out.println("your star sign is gemini");
                } else {
                    System.out.println("your star sign is cancer");
                }
            case july:
                if(day<=22) {
                    System.out.println("your star sign is cancer");
                } else {
                    System.out.println("your star sign is leo");
                }
            case august:
                if(day<=22) {
                    System.out.println("your star sign is leo");
                } else {
                    System.out.println("your star sign is ")
                }
            case september:
                if(day<=22) {
                    System.out.println("your star sign is virgo");
                } else {
                    System.out.println("your star sign is libra")
                }
            case october:
                if(day<=22) {
                    System.out.println("your star sign is libra");
                } else {
                    System.out.println("your star sign is scorpio");
                }
            case november:
                if(day<=21) {
                    System.out.println("your star sign is scorpio");
                } else {
                    System.out.println("your star sign is sagittarius");
                }
            case december:
                if(day<=21) {
                    System.out.println("your star sign is dagittarius");
                } else {
                    System.out.println("your star sign is capricorn");
                }
        }
    }
}
