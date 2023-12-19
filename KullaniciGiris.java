package chapterone;
import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password;

        System.out.print("kullanici adi giriniz:");
        username = input.nextLine();
        System.out.print("sifre giriniz:");
        password = input.nextLine();

        if(username.equals("patika") && password.equals("java123")) {
            System.out.println("basariyla giris yaptiniz.");
        } else {
            System.out.println("giris basarisiz.");
        }
    }
}
