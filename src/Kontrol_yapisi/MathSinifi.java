package Kontrol_yapisi;

public class MathSinifi {
    public static void main(String[] args) {
        System.out.println("pi sayısı:" +Math.PI);
        System.out.println("-9'un mutlak değeri:" +Math.abs(-9));
        /*
        Abs(x) : x değişkeninin mutlak değeri

        Ceil(x) : x değişkenini bir üst tam sayıya dönüştürür. Math.ceil(8.3) = 9 gibi.

        exp(x) : x in kuvvetlerını hesaplanmada kullanılır.

        Pow(x,y): x in y ninci kuvveti

        sqrt(x) : x in karekökü

        Max(x,y) ve Min(x,y) büyük ve küçük değer için kullanılır.

        random() : Rastgele sayı üretmek için kullanılır. 0 ile 1 arasında double değer üretir.
         */
        int onaKadarRastgeleSayi = (int)(Math.random()*11);
        int ikiyeKadarRastgeleSayi = (int)(Math.random()*2+1);

        //üretilecek sayıda 0 olmasın diyorsan Math.random *(üst_sinir+1)
        //üretilecek sayıda 0 olsun diyorsan (Math.random *üst_sinir)+1



    }
}
