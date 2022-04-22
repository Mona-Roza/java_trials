package yigin_dizi;

public class Yigin {
    Ornek dizi[];
    int ust, N;
    /*N: eleman sayısı
    ust: en üstteki
    elemanın indisi*/

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

    boolean yiginBos(){
        if(ust== -1)
            return true;
        else
            return false;
    }

    void yiginaEkle(Ornek yeni){
        if(!yiginDolu()){
            ust++;
            dizi[ust] = yeni;
        }
        /*Direkt Ornek class'ının bir nesnesini parametre 
        olarak aldığı için değer almamıza gerek kalmadı*/
    }

    Ornek yigindanSil(){
        if(!yiginBos()){
            ust--;
            return dizi[ust+1];
        }
        
        return null;
    }
}