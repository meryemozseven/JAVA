package metot_dizi_string;

public class metotlaraDiziGöndermekVeAlmak {
    public static void main(String[] args) {
        int sayilar[]={1,2,3};
       // diziGoster(sayilar);
        System.out.println( "metottan önce index 0" + sayilar[0]);

       // degeriBirArtir(sayilar[0]);

        diziDegerleriniBirArttir(sayilar);
        System.out.println( "metottan sonra index 0" + sayilar[0]);
        toplaminiBul(5,7);


    }

    private static void toplaminiBul(int... parameterList) {

        int toplam = 0;
        for (int oankiSayi :parameterList) {
            toplam += oankiSayi;
            System.out.println("gelen sayıların toplamı" + toplam);
        }
    }


    private static void diziDegerleriniBirArttir(int[] sayilar) {
        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i]++;  // Her elemanı 1 artır
        }
    }

    private static void degeriBirArtir(int i) {
        i++;
    }

    private static void diziGoster(int[] sayilar) {
        for (int i:sayilar) {
            System.out.println("sayi"+i);
        }
    }
}
