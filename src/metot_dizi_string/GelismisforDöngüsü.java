package metot_dizi_string;
/*  For-each, dizinin orijinal elemanlarını değiştiremez, ama okuyarak başka bir değişkende işlem yapabilir.
❌ For-each ile dizinin içeriğini güncellemek mümkün değil.
📌 Eğer elemanları değiştirmek istiyorsan, klasik for döngüsü kullan! */
public class GelismisforDöngüsü {
    public static void main(String[] args) {
        int[] sayilar = {5, 10, 4, 3};  // Dizi tanımı düzeltildi.

        for (int oankisayi : sayilar) {  // Gelişmiş for döngüsü
            System.out.println(oankisayi);
        }
        String isimler [] ={"karen","emre","hasan"};
        diziYazdir(isimler);
    }
    //bir uygulamanın iççinde iki kez aynı şeyi yapan bir task varsa burada metot oluşturulmalı
    public static void diziYazdir(String dizi[]){
        for (String s : dizi) {
            System.out.println("for each isim : " +s);
        }


    }
}

