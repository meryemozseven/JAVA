package metot_dizi_string;

public class DizilerinKopyalanmasi {
    public static void main(String[] args) {
        int anadizi[]={1,7,9};
        int[] kopyaDizi = new int[anadizi.length];
        for (int index = 0; index < anadizi.length; index++) {
            kopyaDizi[index] = anadizi[index];
        }

        //arraycopy
        int []kopyaDizi2 =new int[anadizi.length];
        System.arraycopy(anadizi,0,kopyaDizi2,0,anadizi.length);
        //diziYazdir(kopyaDizi2);
        int[] tersiOlusturulmusDizi = tersiniOlustur(anadizi);





    }
    public static void diziYazdir(int[] yazdirilacakDizi){
        for(int sayi : yazdirilacakDizi){
            System.out.println("Kopya Dizi Elemanı"+sayi);

        }
    }

    public static int[] tersiniOlustur(int[] dizi){
        int newDizi[] =new int[dizi.length];

        for(int i=0, j=dizi.length-1; i<dizi.length; i++, j--){
            newDizi[j] =dizi[i];
        }
        return newDizi;

    }
    /*
    public static void tersCevir(int[] dizi) {
    int left = 0, right = dizi.length - 1;
    while (left < right) {
        int temp = dizi[left];
        dizi[left] = dizi[right];
        dizi[right] = temp;
        left++;
        right--;
    }
}
Bu yöntem ek dizi kullanmadan, diziyi yerinde (in-place) ters çevirir. */
}
