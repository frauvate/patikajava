package chapterone;

import java.util.Scanner;

public class PalindromSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("write your number:");
        int giris = inp.nextInt();
        System.out.println("is" + " " + giris + "a palindromic number:" + palindrom(giris));
    }
    static boolean palindrom(int sayi) {
        int gecici = sayi, tersSayi = 0, sonSayi;
        while(gecici != 0) {
            sonSayi = gecici % 10; //girilen sayinin son basamagini bulur.
            tersSayi = (tersSayi*10) + sonSayi; //bulunan son basamagi yeni sayimizin ilk basamagi olarak yerlestirir.
            gecici = gecici / 10; //sayinin son baamagini siler.
        } // baslangicta girilen sayiyi ters cevirir. ornegin 247 => 742 gibi.
        if(tersSayi == sayi) {
            return true;
        } else {
            return false;
        }
    } 
}
