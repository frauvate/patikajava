package chapterone;
import java.util.Scanner;

public class Recommend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please write the temperature(degrees):");
        int temp = input.nextInt();

        if(temp<5) {
            System.out.println("we recommend: skiing");
        } else if(temp<15) {
            System.out.println("we recommend: movie theatre");
        } else if(temp<25) {
            System.out.println("we recommend: picnic");
        } else if(temp>=25) {
            System.out.println("we recommend: swimming");
        }
    }
}
