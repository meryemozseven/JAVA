package Kontrol_yapisi;

public class BreakveContinue {
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            if (i==5){
                break;
            }
            System.out.println(i);
        }
        distakifor:
        for (int a=0;a<10;a++){
            ictekifor:
            for (int b=0;b<10;b++){
                System.out.println("a:"+a+",b:"+b);
                if (a==1 && b==2){
                    break distakifor;
                }
            }


        }
        for (int i=0;i<10;i++){
            if (i==2){
                return;
            }
            System.out.println("Return komutu kullanıldı,ilgili metottan çıkıldı.:"+i);
        }
        for (int i=0;i<10;i++){
            if (i==2){
                continue;
            }
            System.out.println(i);
        }





    }
}
