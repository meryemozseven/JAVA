package metot_dizi_string;

import java.util.Scanner;

public class MetotOrnekUc {
    public static void main(String[] args) {
       int kullaniciSecimi = 0;
   /*     while (kullaniciSecimi != 0){
            kullaniciSecimi = menuGoster();

        }*/
        for (;;){
            kullaniciSecimi = menuGoster();
            if(kullaniciSecimi == 0){
                break;
            }
            Scanner tara = new Scanner(System.in);
            System.out.println("1.sayı?");
            int birinciSayi = tara.nextInt();
            System.out.println("2.sayı?");
            int ikinciSayi = tara.nextInt();
            switch (kullaniciSecimi){
                case 1:
                    ikiSayiyiCarp(birinciSayi,ikinciSayi);
                    break;
                case 2:
                    ikiSayininToplami(birinciSayi,ikinciSayi);
                    break;
                case 3:
                    ikiSayininKuvveti(birinciSayi,ikinciSayi);
            }
        }
    }

    private static void ikiSayininKuvveti(int birinciSayi, int ikinciSayi) {
        double sonuc = Math.pow(birinciSayi,ikinciSayi);
        System.out.println("Sayıların kuvveti"   + sonuc);
    }

    public static void ikiSayiyiCarp(int birinciSayi, int ikinciSayi){
        System.out.println("Sayıların Çarpımı:" + birinciSayi*ikinciSayi);
    }
    public static void ikiSayininToplami(int birinciSayi, int ikinciSayi){
        System.out.println("İki sayı toplamı:" + birinciSayi+ikinciSayi);
    }
    public static int menuGoster(){

        System.out.println("************MENU**********");
        System.out.println("1-iki sayının çarpımı");
        System.out.println("2-iki sayının toplamı");
        System.out.println("3-iki sayının kuvveti");
        System.out.println("çıkmak için 0'a bas");
        Scanner tara  = new Scanner(System.in);
        int secim = tara.nextInt();
        return secim;


    }
}
