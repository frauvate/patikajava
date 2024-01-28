import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("enter number:");
        int number = input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow;

        //sayının bsamak sayısını bulma
        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }

        //sayının basamaklarındaki rakamların değerlerini bulma
        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10; //sayının son basamağını basvalue'ya atar
            // 1*1*1*1 = 1^4
            basPow = 1;
            //her basamak için üs hesaplar 
            for (int i = 1; i <= basNumber; i++) {
                basPow *= basValue;
            }
            result += basPow; //üssü hesaplanan sayıları toplama
            tempNumber /= 10; //bir sonraki basamağa geçmek için
        }

        if (result == number) {
            System.out.println(number + " is an armstrong number.");
        } else {
            System.out.println(number + " is not an armstrong number.");
        }
    }
}
