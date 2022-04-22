package yigin_postfix;

public class Yigin {
    Ornek dizi[];
    int ust, N;
    /*
     * N: eleman sayısı
     * ust: en üstteki
     * elemanın indisi
     */

    public Yigin(int N) {
        dizi = new Ornek[N];
        this.N = N;
        ust = -1;
    }

    Ornek ust() {
        return dizi[ust];
    }

    boolean yiginDolu() {
        if (ust == N - 1)
            return true;
        else
            return false;
    }

    boolean yiginBos() {
        if (ust == -1)
            return true;
        else
            return false;
    }

    void yiginaEkle(Ornek yeni) {
        if (!yiginDolu()) {
            ust++;
            dizi[ust] = yeni;
        }
        /*
         * Direkt Ornek class'ının bir nesnesini parametre
         * olarak aldığı için değer almamıza gerek kalmadı
         */
    }

    Ornek yigindanSil() {
        if (!yiginBos()) {
            ust--;
            return dizi[ust + 1];
        }

        return null;
    }

   void arkaGosterim(Ornek[] ifade){
       Ornek e, e1;
       Yigin y = new Yigin(100);

       for(int i=0; i<ifade.length; i++){
           e = ifade[i];
           if(e.tip == 0){
                System.out.print(e.islenen);
           }else{
                if(e.islem == '('){
                    y.yiginaEkle(e);
                }else{
                    if(e.islem == ')'){
                        e1 = y.yigindanSil();
                        while(e1.islem != '('){
                            System.out.print(e1.islem);
                            e1 = y.yigindanSil();
                        }
                    }else{
                        while(e.oncelik <= y.ust().oncelik){
                            e1= y.yigindanSil();
                            System.out.print(e1.islem);
                        }
                        y.yiginaEkle(e);
                    }
                }
            }
       }
       while(!y.yiginBos()){
           e1 = y.yigindanSil();
           System.out.print(e1.islem);
       }
   }
}
