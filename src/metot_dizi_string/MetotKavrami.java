package metot_dizi_string;

public class MetotKavrami {
    public static void main(String[] args) {


        menuGoster();
        sayilariTopla(5, 7);
        int sayi = 5;
        sayiyiDegistir(sayi);
        System.out.println("sayının değeri" + sayi);

        int donenDeger = sayilarinFarki(5, 1);
        System.out.println("Sayılarımızın Farki:" + donenDeger);
        //parametre almayan ve geriye değer döndüren
        double rastgeleDeger = Math.random();
        System.out.println("Ratgele Değer" + rastgeleDeger );


    }




    /*parametre alan ve değer döndüren*/
    public static int sayilarinFarki(int a, int b) {
        //System.out.println("Sayıların farki:" +(a-b));
        return(a-b);



    }

    public static void sayiyiDegistir(int x) {
        x=x+10;
        System.out.println("gelen sayının 10 fazlası"+x);


    }

    public static void sayilariTopla(int birinciSayi,int ikinciSayi){
        System.out.println("toplam:" + (birinciSayi+ikinciSayi));


    }
    /*parametre almayan ve değer döndürmeyen*/
    public static  void menuGoster(){
        System.out.println("İki Sayının Toplamını bul");
        System.out.println("İki Sayının Çarpımını bul");
        System.out.println("İki Sayının Bölümünü bul");
        System.out.println("İki Sayının Farkini bul");


           }


}
