package Kontrol_yapisi;

public class IfElseKullanimi {
    public static void main(String[] args) {
        int benimYasim =85;
        int onunYasi =85;
        int sayi1 = 44;
        int sayi2=55;
        if (benimYasim > onunYasi) {
            System.out.println("Benim yaşım büyük ve:" + benimYasim);
        } else if (benimYasim < onunYasi) {
            System.out.println("Benim yaşım küçük ve :" + benimYasim);

        }else {
            System.out.println("Yaşlarımız Eşit ve:" + onunYasi);
        }
////Tek satırlık işlem ise bu biçimde dde çalışır
        if (benimYasim<100)
            System.out.println("Yaşım 100den küçük");


        ////else kendisine en yakın olan if'e aittir
        // Eğer aynı blok içinde ard arda if kullanılmışsa, else en yakındaki if için kullanılır.

        if(sayi1 > sayi2) {
            if(sayi1 > 0) {
                System.out.println("Burası çalıştı");
            } else {
                System.out.println("Else kısmı çalıştı");
            }
        }
//buradaki else sayi1>0 için çalışır.
        //eğer birinci if ile ilgili olmasını istiyorsanız {} kullanmalısınız.

        int a=10,b=5,c=0;
        if (a>b){
            c=(a-b);
        }else{
            c=(b-a);
        }
        //if tenary kullanımı
        c=(a>b) ? (a-b) : (b-a);


    }
}
