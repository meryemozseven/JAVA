package metot_dizi_string;

public class AlistirmaSorusuİki {
    public static void main(String[] args) {

        /*Her bir elemanı rastgele oluşturulmuş 3*2lik bir matriste bulunana sayıların
        * toplamını yazdıran programı yazınız.Ayrıca bu matriste yer alan en küçük ve
        *  en büyük sayıyı da mesaj olarak gösterin.*/
        int matris[][] = new int[3][2];
        int enKucukSayi = 900; int enBuyukSayi =0;
        //Random sayı atadım
        for (int satir=0;satir<matris.length;satir++){

            for (int sutun = 0;sutun<matris[satir].length;sutun ++){
                int rastgeleSayi= (int) (Math.random() * 100);
                matris[satir][sutun] =rastgeleSayi;
                System.out.println(satir + "satirfaki" + sutun + " . sutunun elemanı" + matris[satir][sutun]);
                if(enKucukSayi>rastgeleSayi){
                    enKucukSayi =  rastgeleSayi;
                }
                if(enBuyukSayi < rastgeleSayi){
                    enBuyukSayi = rastgeleSayi;
                }
            }

        }

        System.out.println("Bu matristeki en küçük sayı" + enKucukSayi + "Bu matristeki en büyük sayi" + enBuyukSayi);
        //////////////////////////////



        //max değer












    }
}
