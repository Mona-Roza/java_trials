public class Karma {
    Liste[] tablo;
    int N;

    public Karma(int N) {
        int i;
        tablo = new Liste[N];

        for (i = 0; i < N; i++)
            tablo[i] = new Liste();

        this.N = N;
    }

    Eleman karmaAra(int icerik) {
        int adres;
        adres = karma(icerik);
        return tablo[adres].listeAra(icerik);
    }

    void karmaEkle(Eleman eleman){
        int adres;
        adres = karma(eleman.icerik);
        tablo[adres].listeSonunaEkle(eleman);
    }

    void karmaSil(int icerik){
        Eleman eleman;
        int adres;
        adres = karma(icerik);
        eleman = tablo[adres].listeAra(icerik);

        if(eleman !=null)
            tablo[adres].listeOrtasındanSil(eleman);
    }

    int karma(int sayi){
        return sayi % N;
    }
}
