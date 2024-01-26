import java.util.Scanner;

public class StarSign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter your birth month(with numbers):");
        int month = input.nextInt();
        System.out.print("enter your birth day:");
        int day = input.nextInt();
        if(day<0 || day>31) {
            System.out.println("date invalid");
        }

        switch (month) {
            case 1:
                if(day<=21) {
                    System.out.println("your star sign is capricorn");
                } else {
                    System.out.println("your star sign is aquarius");
                }
                break;
            case 2:
                if(day<=19) {
                    System.out.println("your star sign is aquarius");
                } else {
                    System.out.println("your star sign is pisces");
                }
                break;
            case 3:
                if(day<=20) {
                    System.out.println("your star sign is pisces");
                } else {
                    System.out.println("your star sign is aries");
                }
                break;
            case 4:
                if(day<=20) {
                    System.out.println("your star sign is aries");
                } else {
                    System.out.println("your star sign is taurus");
                }
                break;
            case 5:
                if(day<=21) {
                    System.out.println("your star sign is taurus");
                } else {
                    System.out.println("your star sign is gemini");
                }
                break;
            case 6:
                if(day<=22) {
                    System.out.println("your star sign is gemini");
                } else {
                    System.out.println("your star sign is cancer");
                }
                break;
            case 7:
                if(day<=22) {
                    System.out.println("your star sign is cancer");
                } else {
                    System.out.println("your star sign is leo");
                }
                break;
            case 8:
                if(day<=22) {
                    System.out.println("your star sign is leo");
                } else {
                    System.out.println("your star sign is virgo");
                }
                break;
            case 9:
                if(day<=22) {
                    System.out.println("your star sign is virgo");
                } else {
                    System.out.println("your star sign is libra");
                }
                break;
            case 10:
                if(day<=22) {
                    System.out.println("your star sign is libra");
                } else {
                    System.out.println("your star sign is scorpio");
                }
                break;
            case 11:
                if(day<=21) {
                    System.out.println("your star sign is scorpio");
                } else {
                    System.out.println("your star sign is sagittarius");
                }
                break;
            case 12:
                if(day<=21) {
                    System.out.println("your star sign is sagittarius");
                } else {
                    System.out.println("your star sign is capricorn");
                }
                break;
            default:
            System.out.println("date invalid");
            break;
        }
    }
}
