package metot_dizi_string;

public class IkiBoyutluDiziUygulama {
    public static void main(String[] args) {
        int [][] notDizisi= { {85,90,78,88}, {76,85,80,82} ,{90,92,88,95} ,{65,70,75,80}, {88,86,91,89}};
        String[]ogrenciler={"Ahmet","Elif","Ece","Kaan","Hande"};
        for (int satir = 0; satir<notDizisi.length;satir++){
            int toplam = 0;

            for (int sutun = 0;sutun<notDizisi[satir].length;sutun ++){
                int satirSay =notDizisi[satir][sutun];
                toplam+=satirSay;
            }
            double ort= 0;
            ort = toplam/notDizisi[satir].length;
            System.out.println(ogrenciler[satir] + " isimli öğrencinin not ortalaması " + ort +"'dır.");

        }



    }
}
