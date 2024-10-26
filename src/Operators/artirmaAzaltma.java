package Operators;

public class artirmaAzaltma {
    public static void main(String[] args) {
        int sayi1 = 10;
        //sayi2'ye hem sayi1 atanmış hem de sayi1'in değeri değişmistir.
        int sayi2 = ++sayi1;
        int sayi3 = sayi1--;

        System.out.println("sonuc: " + ((sayi1) + (--sayi2) + (sayi3++)));
        System.out.println("sonuc: " + (sayi1) + (--sayi2) + (sayi3++));


       //string sonrası toplama
        System.out.println("meryem" + "özseven");
        System.out.println(sayi1+sayi2);
        System.out.println("meryem" + (sayi1+sayi2));


        //



    }
}
