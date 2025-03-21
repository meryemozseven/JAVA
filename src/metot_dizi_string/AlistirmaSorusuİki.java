package metot_dizi_string;

public class AlistirmaSorusuİki {
    public static void main(String[] args) {

        /*Her bir elemanı rastgele oluşturulmuş 3*2lik bir matriste bulunana sayıların
        * toplamını yazdıran programı yazınız.Ayrıca bu matriste yer alan en küçük ve
        *  en büyük sayıyı da mesaj olarak gösterin.*/
        int matris[][] = new int[3][2];
        //Random sayı atadım
        for (int satir=0;satir<matris.length;satir++){

            for (int sutun = 0;sutun<matris[satir].length;sutun ++){
                matris[satir][sutun] = (int) (Math.random() * 100);
            }

        }
        //////////////////////////////
        //DİZİYİ GÖSTERDİM
        for (int satir=0;satir<matris.length;satir++){

            for (int sutun = 0;sutun<matris[satir].length;sutun ++){
                System.out.print(matris[satir][sutun] + " ");
            }
            System.out.println();

        }

        //max değer
                int maxDeger = matris[0][0];
                for (int i=0;i<matris.length;i++){

                    for (int j = 0;j<matris[i].length;j ++){
                       if(matris[i][j]>maxDeger){
                           int geciciDegisken = matris[i][j];
                           maxDeger = geciciDegisken;
                       }else {
                           System.out.println(maxDeger);
                       }
                    }

                }
                System.out.println("Dizinin en büyük değeri" + maxDeger);











    }
}
