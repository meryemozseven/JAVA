package ödev;

import java.util.Scanner;

public class GenelTekrarr {
    public static void main(String[] args) {
        /*
        Soru 11:
        Sıcak soguk oyunu yapalım. Sistem 100e kadar bir sayı üretsin. Kullanıcı bu sayıyı tahmin etmeye çalışsın.
        Kullanıcının girdiği değere göre kullanıcıyı arttır azalt diyerek uyaralım.
        Kullanıcı sayıyı bulana kadar tahmin istemeye devam edelim ve sayıyı buldugunda kaç denemeden sonra bulduğunu belirtelim.


         */
        Scanner input = new Scanner(System.in);

        System.out.println("Sıcak Soğuk Oyununa Hoş Geldiniz!!Lütfen bir sayı girin.");

        int tahminEdilenSayi = input.nextInt();
        int randomSayi = (int)(Math.random() * 101);

        while (randomSayi != tahminEdilenSayi) {

            int tekrar = 0;
            if (randomSayi > tahminEdilenSayi) {
                System.out.println(randomSayi + "sayıyı artırın");
                tahminEdilenSayi = input.nextInt();
                tekrar ++;
            }else if (randomSayi < tahminEdilenSayi) {
                System.out.println(randomSayi + "sayıyı azaltın");
                tahminEdilenSayi = input.nextInt();
                tekrar ++;
            } else if (randomSayi == tahminEdilenSayi) {
                break;

            }



        }
        System.out.println(randomSayi + "bulundu,sonlanıyor");







    }
}
