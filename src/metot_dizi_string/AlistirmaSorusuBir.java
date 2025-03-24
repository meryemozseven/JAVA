package metot_dizi_string;

public class AlistirmaSorusuBir {
    public static void main(String[] args) {
        int[]sayilar = new int[100];
        int toplam = 0;

        for (int i=0;i<sayilar.length;i++){
            int rastgeleSayilar = (int) (Math.random() * 100);
            sayilar[i]= rastgeleSayilar;
            toplam += rastgeleSayilar;


        }
        double ort = (double)toplam/sayilar.length;
        System.out.println("Sayıların ortalaması" + ort);


        //ortalamadan küçük değer sayısını hesaplama
        int ortalaamAltiDeger =0;
        for(int k=0;k<sayilar.length;k++){
            if(sayilar[k]<ort){
                ortalaamAltiDeger+=1;
            }
        }
        System.out.println("Ortalamadan küçük olan sayı sayısı" + ortalaamAltiDeger);




    }
}
