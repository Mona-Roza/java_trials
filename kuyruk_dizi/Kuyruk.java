package kuyruk_dizi;

public class Kuyruk {
    Ornek dizi[];
    int bas, son, N;
    //N eleman sayisi

    public Kuyruk(int N){
        dizi = new Ornek[N];
        this.N = N;
        bas =0;
        son = 0;
    }
    
    boolean kuyrukDolu(){
        if(bas== (son+1) % N)
            return true;
        else
            return false;
    }

    boolean kuyrukBos(){
        if(bas==son)
            return true;
        else 
            return false;
    }

    void kuyrugaEkle(Ornek yeni){
        if(!kuyrukDolu()){
            dizi[son] = yeni;
            son = (son +1) % N;
        }
    }

    Ornek kuyruktanSil(){
        Ornek sonuc;

        if(!kuyrukBos()){
            sonuc = dizi[bas];
            bas = (bas + 1) % N;
            return sonuc;
        }
        return null;
    }

    void kuyrukYaz(){
        int i=0;
        while(i<son){
            System.out.print(" [ " + dizi[i].icerik + " ]" + " -->");
            i++;
        }
        System.out.print("[ NULL ]");
    }
}
