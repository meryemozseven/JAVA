package metot_dizi_string;

import java.util.Random;
import java.util.Scanner;
//Kullanıcının girdiği öğrenci sayısı ve kullanıcının girdiği toplam soru sayısına bağlı olarak,
// öğrencilerin soruya verdiği cevapları tutan bir matris düzenleyin.
// Bu değerleri rastgele olarak olusturun. Değerler A,B,C,D,E  olmalı.
//Bir de doğru cevapları tutan tek boyutlu bir diziniz olsun. Bu da rastgele oluşturulmalı.
//Sonrasında bu değerleri karşılaştırarak her bir öğrencinin kaç doğru ve yanlışı olduğunu gösteren programı yazınız.

public class AlistirmeSorusuDort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen öğrenci sayısını giriniz");
        int ogrenciSayisi = input.nextInt();
        System.out.println("Lütfen soru sayısını giriniz");
        int soruSay = input.nextInt();
        char sorular[][] = new char[ogrenciSayisi][soruSay];
        char cevaplar[] = new char[soruSay];
        Random random = new Random();
        cevapAnahtariOlustur(cevaplar);
        rastgeleCevap(sorular);
        //diziyi gösterelim
        diziGoster(sorular);
cevaplariDegerlendir(sorular,cevaplar);
    }
    private static char[][] rastgeleCevap(char[][] sorular){
        char rastgelHarf[] = {'A','B','C','D','E'};

        Random random = new Random();

        for (int satir=0;satir<sorular.length;satir++){

            for (int sutun = 0; sutun < sorular[satir].length; sutun++){
                sorular[satir][sutun] = rastgelHarf[random.nextInt(rastgelHarf.length)];
            }
            System.out.println();

        }
        return sorular;

    }
    public static char[] cevapAnahtariOlustur(char[] cevaplar ){
        char []secenekler = {'A','B','C','D','E'};
        Random random = new Random();

        for(int i =0;i<cevaplar.length;i++){
            cevaplar[i] = secenekler[random.nextInt(secenekler.length)];
            System.out.println("Cevap anahtarı:" + cevaplar[i]);
        }
        return cevaplar;



    }
    public static void diziGoster(char[][] sorular){
        for (int satir=0;satir<sorular.length;satir++){


            for (int sutun = 0;sutun<sorular[satir].length;sutun ++){
                System.out.print(sorular[satir][sutun] + " ");
            }
            System.out.println();

        }
    }
    public static void cevaplariDegerlendir(char[][] rastgeleCevap, char[] cevaplar){
        int toplamDogruCevap = 0;
        int yanlisCevap = 0;
        for (int satir=0;satir<rastgeleCevap.length;satir++){
int dogru = 0;
            int yanlis = 0;

            for (int sutun = 0; sutun < rastgeleCevap[satir].length; sutun++){

                if(cevaplar[sutun] == rastgeleCevap[satir][sutun]){
                    dogru++;
                }else {
                    yanlis++;
                }

            }
            toplamDogruCevap+=dogru;
            yanlisCevap+=yanlis;
            System.out.println((satir + 1) + ". öğrencinin doğru cevap sayısı: " + dogru + ", yanlış cevap sayısı: " + yanlis);


        }
        System.out.println("ToplamDoğrucevap" + toplamDogruCevap + "yanlış" +yanlisCevap);


    }

    }


