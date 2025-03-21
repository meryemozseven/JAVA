package metot_dizi_string;

public class AlistirmaSorusuBir {
    public static void main(String[] args) {
        int[]sayilar = new int[30];
        for (int i=0;i<sayilar.length;i++){
            sayilar[i] = (int) (Math.random() * 100);
        }
        for (int i:sayilar){
            System.out.println(i);
        }
        //ortalama hesaplama
        int toplam = 0;
        for (int j=0;j<sayilar.length;j++){
            toplam+=sayilar[j];
        }
        int ort = toplam/sayilar.length;
        System.out.println("Sayıların ortalaması" + ort);
        int toplam2 =0;
        for(int k=0;k<sayilar.length;k++){
            if(sayilar[k]<ort){
                toplam2+=1;
            }
        }
        System.out.println("Ortalamadan küçük olan sayı sayısı" + toplam2);




    }
}
