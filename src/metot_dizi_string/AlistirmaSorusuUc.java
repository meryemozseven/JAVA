package metot_dizi_string;

public class AlistirmaSorusuUc {
    public static void main(String[] args) {
        /*Verilen iki sayının en küçük ortak katını bulan uygulamayı yazınız.
        Ekok(s1,s2) * ebob(s1,s2) =  (s1*s2); buna uygun olacak şekilde bulunuz*/
        int birinciSay = 18;
        int ikinciSayi = 24;
        int ebob =1;
        for(int f=2;f<20;f++){
            if(birinciSay%f==0){
                birinciSay = birinciSay/f;

                if(ikinciSayi%f==0 ){
                    ikinciSayi = ikinciSayi/f;
                    ebob *=f;
                    System.out.println("Sayıların ortak böleni" + f);
                }
            }
        }
        System.out.println("Ebob" + ebob);
        int ekok = ebob/ikinciSayi*birinciSay;
        System.out.println("Verilen iki sayının ekoku" + ekok);


    }
}
