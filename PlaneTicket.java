import java.util.Scanner;

public class PlaneTicket {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("mesafe giriniz:");
        double way = input.nextDouble();
        System.out.print("yasinizi giriniz:");
        int age = input.nextInt();
        System.out.print("yolculuk tipi giriniz(tek yon icin 1, gidis donus icin 2 giriniz.):");
        int type = input.nextInt();
        double normal = way*0.1;


        if(age<12) {
            double disc = normal*0.5;
        } else if(age<=24) {
            double disc = normal*0.1;
        } else if(age>65) {
            double disc = normal*0.3;
        } else {
            System.out.println("no discount for age");
        }

        if(type != 1) {
            double disc2 = normal*0.2;
            if(age<12) {
                double disc = normal*0.5;
                double finprice = normal - disc - disc2;
                System.out.println("indirimli tutar:" + finprice);
            } else if(age<=24) {
                double disc = normal*0.1;
                double finprice = normal - disc - disc2;
                System.out.println("indirimli tutar:" + finprice);
            } else if(age>65) {
                double disc = normal*0.3;
                double finprice = normal - disc - disc2;
                System.out.println("indirimli tutar:" + finprice);
            } else {
                System.out.println("no discount for age");
                double finprice = normal - disc2;
                System.out.println("indirimli tutar:" + finprice);
            }
        } else {
            System.out.println("no discount for type");
        }

        System.out.println("normal tutar:" + normal);
    }
}
