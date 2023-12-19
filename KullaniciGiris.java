package chapterone;
import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password, newpassword;

        System.out.print("kullanici adi giriniz:");
        username = input.nextLine();
        System.out.print("sifre giriniz:");
        password = input.nextLine();

        if(username.equals("patika") && password.equals("java123")) {
            System.out.println("basariyla giris yaptiniz.");
        } else {
            System.out.println("giris basarisiz.");
            if(username.equals("patika")) {
                System.out.print("sifre yanlis. sifirlamak icin 1, tekrar denemek icin 0 girin:");
                int secim = input.nextInt();  
                if(secim==1) {
                    System.out.print("yeni sifre giriniz:");
                    newpassword = input.nextLine(); 
                    }  else {
                    System.out.print("kullanici adi giriniz:");
                    username =input.nextLine();
                    System.out.print("sifre giriniz:");
                    password = input.nextLine();
                      if(username.equals("patika") && password.equals("java123")) {
                        System.out.println("basariyla giris yaptiniz.");
                      } else {
                        System.out.println("giris basarisiz.");
                      }
                    }
                } else {
                    System.out.println("gorusmek uzere.");
                } System.out.print("tekrar giris yapmak icin 0 giriniz:");
                  int secim2 = input.nextInt();
                  if(secim2==0) {
                        System.out.print("kullanici adi giriniz:");
                        username = input.nextLine();
                        System.out.print("sifre giriniz:");
                        password = input.nextLine();
                        if(username.equals("patika") && password.equals(newpassword)) {
                            System.out.println("basariyla giris yaptiniz.");
                        } else {
                            System.out.println("giris basarisiz.");
                        }
            } else {
                System.out.println("giris basarisiz.");
            }
        }
    }
}