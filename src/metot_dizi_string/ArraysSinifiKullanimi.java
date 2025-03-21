package metot_dizi_string;

import java.util.Arrays;

public class ArraysSinifiKullanimi {
    public static void main(String[] args) {
        int[] sayilar = {8,9,77,41,22};
        int[] sayilar2 = {8,9,77,41,22};
        System.out.println("SıralamaA öncesi dizi");
        diziYazdir(sayilar);
        Arrays.sort(sayilar);
        Arrays.sort(sayilar,2,5);
        Arrays.parallelSort(sayilar2);
        System.out.println("\nSıralama sonrası dizi");
        diziYazdir(sayilar);


        int sonuc = Arrays.binarySearch(sayilar,11);
        System.out.println("sonuç" + sonuc);
        System.out.println("sayılar 1 ve 2 aynı mı" + Arrays.equals(sayilar,sayilar2));
        int[]yeniDizi =new int[20];
        Arrays.fill(yeniDizi,0,5,90);
        System.out.println("\nYeni dizi\n");
        diziYazdir(yeniDizi);



    }

    private static void diziYazdir(int[] sayilar) {

    }
}
