package ödev;

import java.util.Scanner;

public class GenelTekrarDort {
    public static void main(String[] args) {
       /* Kullanıcıdan aldığınız
        integer değere kadar olan tüm asal sayıları
        yazdıran programı yazınız. 10 için ekranda 2,3,5,7 değerleri olmalıdır.
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir değer giriniz,bu değere kadar olan asal sayıları söyleyeceğim");
        int kullaniciGirisi = sc.nextInt();

        for(int sayi =2;sayi<kullaniciGirisi;sayi++){
            boolean asal =true;

           // sayiyi isleme sokacaz
            for(int newsayi =2;newsayi<=Math.sqrt(sayi);newsayi++) {

                int sonuc = sayi % newsayi;
                if (sonuc == 0) {
                    asal = false;
                    break;
                }

            }
                if(asal){
                    System.out.println(sayi);
                }

                }

                }
                                            }

