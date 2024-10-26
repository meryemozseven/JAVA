package ödev;

public class Alistirma {
    public static void main(String[] args) {


//Dönüştürme Çalışması

        int integerDegiskeni=6;
        double doubleDegiskeni = (double) integerDegiskeni;
        System.out.println(doubleDegiskeni);
        System.out.println("**************");

//int from double
        double doubleDegiskeni2= 8D;
        int integerDegiskeni2= (int) doubleDegiskeni2;
        System.out.println(integerDegiskeni2);
        System.out.println("**************");
//Aritmetik İşlemler ve Dönüşümler

        int sayi1=5;
        int sayi2=8;
        double bolme =(double) sayi2/sayi1;
        System.out.println(bolme);
        System.out.println("**************");

        //Mod Alma ve Dönüşüm
        int sayi3=7;
        boolean tekMi = (sayi3%2==0);
        System.out.println(tekMi);
        System.out.println("**************");

 //String ve Sayı Dönüşümleri
        String sayi4="3";
        int integerDegiskeni3 = Integer.parseInt(sayi4);
        double doubleDegiskeni3 = Double.parseDouble(sayi4);
        System.out.println("Integer:" +integerDegiskeni3);
        System.out.println( "Double:" + doubleDegiskeni3);
        System.out.println("**************");

        //Sayılardan String’e Dönüşüm:
        int sayi5 =9;
        double sayi6= 7D;
        String stringDegiskeni1 = Double.toString(sayi6);
        String stringDegiskeni2 = Integer.toString(sayi5);
        System.out.println("String 1:" + stringDegiskeni1);

        System.out.println("String 2:" + stringDegiskeni2);
        System.out.println("**************");

        //or
        int sayi8 = 7;
        double sayi9 = 8D;
        String sonuc =String.valueOf(sayi8) + String.valueOf(sayi9) ;
        System.out.println("Kısa Yol: "   + sonuc);
        System.out.println("**************");

        //Karakter ve ASCII Dönüşümleri
        //char yalnız bir karakter alabilir.
        char charDegiskeni = 'a';

        int ASCIIDeger = (int) charDegiskeni;
        System.out.println(ASCIIDeger);
        System.out.println("**************");

        ////Sayıdan Karaktere Dönüşüm
        int sayi10 = 65;
        char charDegiskeni2 = (char) sayi10;
        System.out.println(charDegiskeni2);
        System.out.println("**************");


        //5. boolean Tipi ve Koşullar
        double doubleDegiskeni5 = 4D;
        boolean ondanBüyüKmÜ = (doubleDegiskeni5>10.4);
        System.out.println(ondanBüyüKmÜ);
        System.out.println("**************");













    }}
