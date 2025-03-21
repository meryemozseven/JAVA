package metot_dizi_string;

import java.util.Scanner;

public class ikiBoyutluDiziUygulamaIki {
    /*
    Bir spor salonunun üyelik sistemini yöneten bir 2D dizi oluştur. Dizinin satırları farklı üyeleri, sütunları ise şu bilgileri temsil etsin:
    Üye ID (int)
    Adı (String)
    Soyadı (String)
    Üyelik Başlangıç Yılı (int)
    Abonelik Türü (String) → ("Standart", "Premium", "VIP")
    Ardından şu işlemleri gerçekleştiren bir program yaz:

    ✅ Tüm üyeleri ekrana listele.
    ✅ En eski üyelik yılına sahip üyeyi bul ve ekrana yazdır.
    ✅ Kullanıcıdan bir abonelik türü al, bu türde olan tüm üyeleri ekrana listele.
    ✅ Kullanıcıdan bir üye ID’si al, eğer üye varsa bilgilerini ekrana yazdır. Eğer üye bulunamazsa "Bu ID’ye ait üye yok." mesajı ver.

     */
    public static void main(String[] args) {



                int[] ids = {101, 102, 103, 104, 105};
                String[] names = {"Ali", "Ayşe", "Mehmet", "Zeynep", "Can"};
                String[] surnames = {"Yılmaz", "Kaya", "Demir", "Çelik", "Koç"};
                int[] years = {2015, 2018, 2020, 2012, 2019};
                String[] subscriptions = {"VIP", "Premium", "Standart", "VIP", "Premium"};

                Scanner scanner = new Scanner(System.in);


                System.out.println("Tüm Üyeler:");
                for (int i = 0; i < ids.length; i++) {
                    System.out.println(ids[i] + " - " + names[i] + " " + surnames[i] + ", Başlangıç Yılı: " + years[i] + ", Abonelik: " + subscriptions[i]);
                }


                int oldestYear = years[0];
                int oldestIndex = 0;
                for (int i = 1; i < years.length; i++) {
                    if (years[i] < oldestYear) {
                        oldestYear = years[i];
                        oldestIndex = i;
                    }
                }
                System.out.println("\nEn eski üyelik: " + names[oldestIndex] + " " + surnames[oldestIndex] + ", Yıl: " + years[oldestIndex]);


                System.out.print("\nListelemek istediğiniz abonelik türünü girin (Standart, Premium, VIP): ");
                String type = scanner.next();
                System.out.println("\n" + type + " aboneliğine sahip üyeler:");
                boolean found = false;
                for (int i = 0; i < ids.length; i++) {
                    if (subscriptions[i].equals(type)) {
                        System.out.println(ids[i] + " - " + names[i] + " " + surnames[i]);
                        found = true;
                    }
                }
                if (!found) System.out.println("Bu türde üye bulunamadı.");


                System.out.print("\nBilgilerini görmek istediğiniz üye ID'sini girin: ");
                int searchId = scanner.nextInt();
                found = false;
                for (int i = 0; i < ids.length; i++) {
                    if (ids[i] == searchId) {
                        System.out.println("Üye Bilgisi: " + names[i] + " " + surnames[i] + ", Başlangıç Yılı: " + years[i] + ", Abonelik: " + subscriptions[i]);
                        found = true;
                        break;
                    }
                }
                if (!found) System.out.println("Bu ID’ye aiit üye yok.");

                scanner.close();
            }
        }











