package metot_dizi_string;

public class AlistirmaSorusuUc {
    public static void main(String[] args) {
        /*Verilen iki sayının en küçük ortak katını bulan uygulamayı yazınız.
        Ekok(s1,s2) * ebob(s1,s2) =  (s1*s2); buna uygun olacak şekilde bulunuz*/
        int birinciSay = 18;
        int ikinciSayi = 24;

        ebobBul(birinciSay,ikinciSayi);



    }

    private static void ebobBul(int birinciSay, int ikinciSayi) {
        int ebob =1;
        int kontrol = 2;
        while(kontrol<= birinciSay && kontrol<=ikinciSayi){
            if (birinciSay%kontrol ==0 && ikinciSayi%kontrol ==0){
                ebob = kontrol;
            }
            kontrol++;
        }



    }

}
