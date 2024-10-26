package Kontrol_yapisi;

public class ForDongu {
    public static void main(String[] args) {
        for (int i=0 ; i<10; i++)
        {
            System.out.println(i);

        }
        for(int i=0, j=0; (i+j <10 ); i++, j++){
            System.out.println(i+j);
        }
        for(int i = 5; i<10 ; i++); {
//compiler hatası vermez ama mantık hatası vardır,
        }
        /*
        for(; ;){
            System.out.println("sonsuz döngü");
        }

        */


    }
}
