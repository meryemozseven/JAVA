package ödev;


import java.util.Scanner;

public class If_else_alistirma_iki {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        int sansliSayi = (int) (Math.random() * 99 + 1);
        System.out.println("Lütfen tahmininizi giriniz : \n");
        int tahminEdilenSayi= tara.nextInt();

        //87 üretilen sayı kullanıcı tahmini 78
        int sansliSayiBirinciBasamak = sansliSayi / 10 ;
        int sansliSayiIkinciBasamak = sansliSayi % 10 ;

        int tahminEdilenSayiBirinciBasamak = tahminEdilenSayi / 10 ;
        int tahminEdilenSayiIkinciBasamak = tahminEdilenSayi % 10 ;

        if(sansliSayi == tahminEdilenSayi){
            System.out.println("Tebrikler 10000 TL kazandınız sanslı sayı:"+sansliSayi + " sizin tahmininiz :"+tahminEdilenSayi);
        }
        else if(sansliSayiBirinciBasamak == tahminEdilenSayiIkinciBasamak && sansliSayiIkinciBasamak == tahminEdilenSayiBirinciBasamak){
            System.out.println("Tebrikler 5000 TL kazandınız sanslı sayı:"+sansliSayi + " sizin tahmininiz :"+tahminEdilenSayi);
        }
        else if(sansliSayiBirinciBasamak == tahminEdilenSayiBirinciBasamak
                || sansliSayiBirinciBasamak == tahminEdilenSayiIkinciBasamak
                || sansliSayiIkinciBasamak == tahminEdilenSayiBirinciBasamak
                || sansliSayiIkinciBasamak == tahminEdilenSayiIkinciBasamak)
        {
            System.out.println("Tebrikler 1000 TL kazandınız sanslı sayı:"+sansliSayi + " sizin tahmininiz :"+tahminEdilenSayi);
        }
        else{
            System.out.println("Malesef ödül kazanamadınız sanslı sayı:"+sansliSayi + " sizin tahmininiz :"+tahminEdilenSayi);
        }
    }


}

