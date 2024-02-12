import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter a number:");
        int num = inp.nextInt();

        inp.close();

        for(int i=0; i<=num; i++) {
            for(int j=0; j<(num-1); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
