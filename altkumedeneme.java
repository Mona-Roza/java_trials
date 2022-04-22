public class altkumedeneme {
    public static void main(String[] args) {
        int[] gelenList = { 5,3, 4, 2, 1 };

        int[] sorted = kumeSirala(5, gelenList);
        for (int element : sorted) {
            System.out.println(element);
        }
        System.out.println(nElemanliKacAltKumeVar(3, 2
        ));

    }

    // kac elemanlı bir alt küme olusturacağını belirleyen ve içini dolduran
    // fonksiyon
    public static int[] alkumeolusturucu(int altkumeninElemanSayisi, int kume[]) {
        int altKumeSayisi = nElemanliKacAltKumeVar(kume.length, altkumeninElemanSayisi);
        int[] altkumeler;
        altkumeler = new int[altKumeSayisi];
        int[] altkume;
        altkume = new int[altkumeninElemanSayisi];
        for (int i = 0; i < altkumeninElemanSayisi; i++) {
            for (int j = 0; j < i; j++) {

            }
        }
        return altkumeler;
    }

    // kombinasyon hesabı yapar
    public static int nElemanliKacAltKumeVar(int n, int r) {
        int k, l, m, sonuc;
        k = faktoriyel(n);
        l = faktoriyel(r);
        m = faktoriyel(n - r);
        sonuc = k / (l * m);
        return sonuc;
    }

    public static int faktoriyel(int n) {
        int faktoriyel = 1;
        for (int i = 1; i <= n; i++) {
            faktoriyel *= i;
        }

        return faktoriyel;
    }

    public static int[] kumeSirala(int kumeninElemanSyisi, int kume[]) {
        int[] siraliKume = kume;
        int tut = 0;
        for (int k = 0; k < siraliKume.length - 1; k++) {
            for (int y = 0; y < siraliKume.length - 1; y++) {
                if (siraliKume[y] > siraliKume[y + 1]) {
                    tut = siraliKume[y];
                    siraliKume[y] = siraliKume[y + 1];
                    siraliKume[y + 1] = tut;
                }
            }
        }
        return siraliKume;
    }
}