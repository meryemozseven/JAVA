package Kontrol_yapisi;

import java.util.Scanner;

public class KullanicidanVeriAlma {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
     /*   int kullanicidanAlinanVeri = tara.nextInt();
        System.out.println(kullanicidanAlinanVeri);
    double kullaniciDouble = tara.nextDouble();
    System.out.println(kullaniciDouble);*/

    String isim = tara.next();
        System.out.println("kullanıcının girdiği isim:" + isim);
        //ard arda iki cümle kullanılacak durumlarda
    tara.nextLine();

    String isimSoyisim = tara.nextLine();
        System.out.println("isimSoyisim:" + isimSoyisim);
    char harf = tara.next().charAt(0);
        System.out.println(harf);





    }



}
