package chapterone;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your first number:");
        int no1 = input.nextInt();
        System.out.print("enter your second number:");
        int no2 = input.nextInt();
        System.out.print("enter your third number:");
        int no3 = input.nextInt();

        if((no1>no2) && (no1>no3)) {
            if(no2>no3) {
                System.out.println("no1>no2>no3");
            } else {
                System.out.println("no1>no3>no2");
            }
        } else if((no2>no1) && (no2>no3)) {
            if(no1>no3) {
                System.out.println("no2>no1>no3");
            } else {
                System.out.println("no2>no3>no1");
            }
        } else if((no3>no1) && (no3>no2)) {
            if(no1>no2) {
                System.out.println("no3>no1>no2");
            } else {
                System.out.println("no3>no2>no1");
            }
        }
    }
}
