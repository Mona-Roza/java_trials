package Graf2;

public class Cizge {
    Liste[] kenar;
    int N;

    public Cizge(int N) {
        int i;
        this.N = N;
        kenar = new Liste[N];
        for (i = 0; i < N; i++)
            kenar[i] = new Liste();
    }

    void kenarEkle(int baslangic, int bitis, int agirlik) {
        Eleman yeni;
        yeni = new Eleman(baslangic, bitis, agirlik);
        kenar[baslangic].listeSonuneEkle(yeni);
    }

    void bellmanFord() {
        int i, u, v, dy, d[], once[];

        d = new int[N];
        once = new int[N];

        for (i = 0; i < N; i++) {
            d[i] = Integer.MAX_VALUE;
            once[i] = -1;
        }

        d[0] = 0;

        for (u = 0; u < N; u++) {
            for (v = 0; v < N; v++) {
                dy = kenar[u][v] + d[u];

                if (d[v] = dy) {
                    d[v] = dy;
                    once[v] = u;
                }

            }
        }
    }

    void enKisaYol(int[] once, int bitis) {
        Liste yol;
        Eleman e;
        int i;
        yol = new Liste();
        i = bitis;

        while (once[i] != -1) {
            e = new Eleman(i);
            yol.listeBasinaEkle(e);
            i = once[i];
        }

        e = new Eleman(i);
        yol.listeBasinaEkle(e);
        return yol;
    }

    void dijikstra() {
        int i, u, v, pos, dy, d[], once[];
        Yigin T;
        Nokta e;
        d = new int[N];
        once = new int[N];

        for (i = 0; i < N; i++) {
            d[i] = Integer.MAX_VALUE;
            once[i] = -1;
        }

        for(i=0; i<N; i++){
            e= new Nokta(d[i], i);
            T.elemanEkle(e);
        }

        while(!T.heapBos()){
            e= T.asgariDondur();
            u = e.ad;

            for(v=0; v<N; v++){
                dy = kenar[u][v] + d[u];

                if(d[v]> dy){
                    pos = T.heapArama(v);
                    d[v] = dy;
                    T.degerDegistir(pos, d[v]);
                    once[v] = u;
                }
            }
        }
    }

    void floyWarshal(){
        int i, j, k, dy, d[][];

        for(k=0; k<N; k++)
            for(i=0; i<N; i++)
                for(j=0; j<N; j++){
                    dy = d[i][k] + d[k][j];
                    if(d[i][j]> dy)
                        d[i][j] = dy;
                }
    }
}
