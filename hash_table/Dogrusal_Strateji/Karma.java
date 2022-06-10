public class Karma {
    Eleman[] tablo;
    Liste[]  table;
    boolean[] silindi;
    int N;

    public Karma(int N) {
        int i;
        table = new Liste[N];

        for (i = 0; i < N; i++)
            table[i] = new Liste();

        this.N = N;
    }

    Eleman karmaAra(int icerik) {
        int adres = karma(icerik);
        
        while(tablo[adres] != null){
            if(!(silindi[adres]) && tablo[adres].icerik == icerik)
                break;
            
            adres= (adres + 1) % N;
        }

        return tablo[adres];
    }

    void karmaEkle(Eleman ornek){
        int adres = karma(ornek.icerik);

        while(tablo[adres] != null && !silindi[adres])
            adres = (adres + 1) % N;
    

        if(tablo[adres] != null)
            silindi[adres] = false;
        
        tablo[adres] = ornek;
    }

    void karmaSil(int icerik){
        int adres = karma(icerik);

        while(tablo[adres] != null){
            if(!silindi[adres] && tablo[adres].icerik == icerik)
                break;
            
            adres = (adres +1) % N; 
        }
        silindi[adres] = true;
    }

    void tekrarKarma(){
        Eleman[] tablo = new Eleman[N];
        boolean[] silindi = new boolean[N];

        for(int i = 0; i<N ; i++){
            tablo[i] = this.tablo[i];
            silindi[i] = this.silindi[i];
        }

        this.tablo = new Eleman[2 * N];
        this.silindi = new boolean[2 * N];
        N= 2 * N;
        for(int i = 0; i < N; i++){
            if(tablo[i] != null && !silindi[i])
                karmaEkle(tablo[i]);
        }
    }

   
    int karma(int sayi){
        return sayi % N;
    }
}
