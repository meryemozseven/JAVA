package ödev;

import java.util.Scanner;

public class GenelTekrarIki {
    public static void main(String[] args) {
        /*
        * SORU 12:
                Kullanıcıdan sürekli olarak sayı alan ve de kullanıcı 0a bastığında
                girdiği sayıların çarpımını sonuç olarak gösteren programı yazınız.
       */
        Scanner sc = new Scanner(System.in);
        int n ;
        int sonuc = 1;
        boolean herhangiBirDegerGirildiMi = false;

        while (true) {
            System.out.println("Lütfen bir sayı girin (çıkmak için 0 girin):");
            n = sc.nextInt();

            if (n == 0) { // 0 girilirse döngüden çık
                break;

            }

            sonuc *= n;
            herhangiBirDegerGirildiMi = true;

        }
        if (herhangiBirDegerGirildiMi) {
            System.out.println("Girdiğiniz sayıların çarpımı: " + sonuc);

        }else {
            System.out.println("sayı girmelisin");


        }


    }
}
