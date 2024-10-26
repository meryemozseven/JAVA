package Operators;

public class islemOnceligi {
    public static void main(String[] args) {

        //	1. () önce parantez içi hesaplanır
        //	2. ++ ve -- (eğer değişkenden önce ise)
        //	3. çarpma ve bölme
        //	4. toplama ve çıkarma
        //	5. = atama işlemi
        //++ ve -- (eğer değişkenden sonra ise)
        int sayi1=15;
        int sayi2 = 5;
        int sonuc = 0;

        sonuc = ((sayi1 + sayi2*2 - sayi2) + sayi2 - sayi1 *4 + sayi1);
        System.out.println(sonuc);

        ///sayi1 ve sayi2'yi çarp sonra artır
        sonuc = ((sayi1 * sayi2 + 4 / 2)+ sayi1++ * sayi2 + sayi1);
        System.out.println(sonuc);


    }
}
