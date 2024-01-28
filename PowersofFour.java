import java.util.Scanner;

public class PowersofFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter number:");
        int num = input.nextInt();
        
        float power = 1;

        for(int i=0; i<=num; i++) {
            power *= 4;
            System.out.println( power + " ");
        }

    }
}