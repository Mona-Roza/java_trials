public class Heap {
    Nokta dizi[];
    int tane;

    public Heap(int N) {
        dizi = new Nokta[N];
        tane = 0;
    }

    boolean heapBos() {
        if (tane == 0)
            return true;
        else
            return false;
    }

    void asagiIn(int no) {
        int altsol, altsag;
        altsol = 2 * no + 1;
        altsag = 2 * no + 2;

        while ((altsol < tane && dizi[no].icerik < dizi[altsol].icerik)
                || (altsag < tane && dizi[no].icerik < dizi[altsag].icerik)) {

            if (altsag >= tane || dizi[no].icerik < dizi[altsag].icerik) {
                yerDegistir(no, altsol);
                no = altsol;
            } else {
                yerDegistir(no, altsag);
                no = altsag;
            }

            altsol = 2 * no + 1;
            altsag = 2 * no + 2;
        }
    }

    void yerDegistir(int no, int altsol) {
    }

    Nokta azamiDondur() {
        Nokta tmp = dizi[0];
        dizi[0] = dizi[tane - 1];
        asagiIn(0);
        tane--;
        return tmp;
    }

    void heapEkle(Nokta yeni) {
        tane++;
        dizi[tane - 1] = yeni;
        yukariCik(tane - 1);
    }

    void yukariCik(int no) {
        int ustdal = (no - 1) / 2;
        while (ustdal >= 0 && dizi[ustdal].icerik < dizi[no].icerik) {
            yerDegistir(ustdal, no);
            no = ustdal;
            ustdal = (no - 1) / 2;
        }
    }

    int heapArama(int ad){
        for(int i =0; i< tane; i++)
            if(dizi[i].ad == ad)
                return i;

        return -1;
    }

    void degerDegistir(int k, int yeni) {
        int eski = dizi[k].icerik;
        dizi[k].icerik = yeni;

        if (eski > yeni)
            asagiIn(k);
        else
            yukariCik(k);
    }
}
