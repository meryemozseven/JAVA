package metot_dizi_string;

import java.util.Scanner;


public class MetotOrnek {
    public static void main(String[] args) {

        int kullanicininGirisi= menuuGoster();

        /*kullanicininGirisi = -1;
     while (kullanicininGirisi != 0) {
            kullanicininGirisi = menuuGoster();}*/

        for(;;){
            kullanicininGirisi=menuuGoster();
            if(kullanicininGirisi==0){
                break;
            }
                Scanner input = new Scanner(System.in);
                System.out.println("Lütfen birinci sayınızı Girin");
                int birinciSayisi = input.nextInt();
                System.out.println("Lütfen ikinci sayınızı Girin");
                int ikinciSayisi = input.nextInt();
                switch (kullanicininGirisi){
                    case 1:
                        System.out.println("iki sayının toplamı:" + sayilarinToplami(birinciSayisi,ikinciSayisi));
                        break;
                    case 2:
                        System.out.println("iki sayının Çarpımı:" + sayilarinCarpimi(birinciSayisi,ikinciSayisi));
                        break;


            }




            }




    }

    public static int sayilarinToplami(int a, int b) {
        return(a+b);
    }

    public static int sayilarinCarpimi(int x, int y) {
        return(x*y);
    }

    public static int menuuGoster() {
        System.out.println("Lütfen menüden bir seçenek seçiniz,çıkmak için 0 tuşlayınız.");
        System.out.println("++++++++++++++Menu++++++++++++++");
        System.out.println("1-İki Sayının Toplamını bul");
        System.out.println("2-İki Sayının Çarpımını bul");
        System.out.println("Çıkmak için 0 tuşla");
        Scanner input = new Scanner(System.in);
        int kullaniciGirisi = input.nextInt();
        return kullaniciGirisi;
    }
}
