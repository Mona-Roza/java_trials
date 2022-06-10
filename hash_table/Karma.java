public class Karma{
    Ornek[] tablo;
    boolean[] silindi;
    int N;
    
    public Karma(int N){
        tablo = new Ornek[N];
        silindi = new boolean[N];
        this.N = N;
    }

    int karma(int sayi){
        return sayi%N;
    }

    int karma(String katar, int N){
        int i, pozisyon = 0;

        for(i=0; i<katar.length(); i++){
            pozisyon = 39 * pozisyon + katar.charAt(i);
        }

        pozisyon = pozisyon % N;
        return pozisyon;
    }
}