package metot_dizi_string;

public class DiziKarmaSiralamaArama {
    public static void main(String[] args) {
        int []sayilar= {7,77,88,5,6,7};
        diziYazdir(sayilar);
        diziKarma(sayilar);


    }
    public static void diziKarma(int[]sayilar){
        for (int i=sayilar.length-1;i>0;i--){
            int gecici=sayilar[i];
            int rastgeleIndex =(int)(Math.random()*(i+1));
            sayilar[i]=sayilar[rastgeleIndex];
            sayilar[rastgeleIndex]=gecici;
            System.out.println(gecici);

        }


    }
    public static void diziYazdir(int[]sayilar){
        for (int i:sayilar){
            System.out.println(i +",");
        }
    }
}
