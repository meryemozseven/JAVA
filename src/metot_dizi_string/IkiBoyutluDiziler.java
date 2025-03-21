package metot_dizi_string;

public class IkiBoyutluDiziler {
    public static void main(String[] args) {
        //2X3'lük bir matris
        int[][]sayilar=new int[2][3];
        sayilar[0][0]=1;
        sayilar[0][1]=2;
        sayilar[0][2]=3;
        sayilar[1][0]=4;
        sayilar[1][1]=5;
        sayilar[1][2]=6;
//3*3 lük matris
        int[][] sayilar2={{1,2,3},{4,5,6},{7,8,9}};;
        for(int satir=0;satir<sayilar.length;satir++){
            //sayilar[satirr] belirli bir satırdaki elemanları temsil eden bir dizi
            //olduğundan sayilar[satir].length o saırdaki sütun sayısını verir
            for(int sutun=0;sutun<sayilar[satir].length;sutun++){
                System.out.println(satir + ". satır " + sutun+ ". sutundaki değer " + sayilar[satir][sutun]);
            }


        }
        System.out.println("++++++++++++++++++++++++++++++++");

        int [][]borclar ={ {0,100,200} , {350,0,250} , {150,500,0} };
        String[]kisiler ={"Emre","Hasan","Ali"} ;
        for (int a =0;a<borclar.length;a++){
            for(int sutun2=0;sutun2<borclar[a].length;sutun2++){

                    if(a != sutun2) {
                        int alacak = borclar[a][sutun2]-borclar[sutun2][a];
                        if(alacak<0){
                            System.out.println(kisiler[a] + "'nın " +kisiler[sutun2] + "'den alacağı " +(-alacak) );


                    }

                }
            }

        }
        }





    }
