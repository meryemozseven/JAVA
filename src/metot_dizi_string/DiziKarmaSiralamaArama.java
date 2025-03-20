package metot_dizi_string;

public class DiziKarmaSiralamaArama {
    public static void main(String[] args) {
        int []sayilar= {7,77,88,5,6};

       /* diziKarma(sayilar);
        System.out.println("Dizinin karılmış hali");
        diziYazdir(sayilar);*/
        selectionSort(sayilar);
       int sonuc =  binarySearch(sayilar,77);
        System.out.println(sonuc);

    }
    public static void diziKarma(int[]sayilar){
        for (int i=sayilar.length-1;i>0;i--){
            int rastgeleIndex =(int)(Math.random()*(i+1));
            int gecici = sayilar[i];
            sayilar[i]= sayilar[rastgeleIndex];
            sayilar[rastgeleIndex] = gecici;
            System.out.println(sayilar[i]);


        }


    }
    public static void selectionSort(int[] sayilar) {
        for (int i = 0;i< sayilar.length-1;i++){
            int oAnkiEnKucukDeger = sayilar[i];
            int oAnkiIndexEnKucukElemanIndex = i;
            for (int j = i+1 ;j<sayilar.length;j++){
                if(oAnkiEnKucukDeger>sayilar[j]){
                    oAnkiEnKucukDeger =sayilar[j];
                    oAnkiIndexEnKucukElemanIndex = j;
                }
            }
            if(oAnkiIndexEnKucukElemanIndex != i){
                sayilar[oAnkiIndexEnKucukElemanIndex] = sayilar[i];
                sayilar[i]=oAnkiEnKucukDeger;
            }
        }
    }
    public static int binarySearch(int []sayilar,int aranacakDeger) {
        int maxDegerIndex = sayilar.length - 1;
        int minDegerIndex = 0;
        while (maxDegerIndex >= minDegerIndex) {
            int ortaIndex = (maxDegerIndex + minDegerIndex) / 2;
            if (sayilar[ortaIndex] > aranacakDeger) {
                maxDegerIndex = ortaIndex - 1;

            } else if (aranacakDeger == sayilar[ortaIndex]) {
                return ortaIndex;
            } else {
                minDegerIndex = ortaIndex + 1;
            }}
            return -minDegerIndex -1;

        }
    public static void diziYazdir(int[]sayilar){
        for (int i:sayilar){
            System.out.println(i +",");
        }
    }
}
