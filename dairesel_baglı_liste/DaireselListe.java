package dairesel_baglı_liste;

public class DaireselListe {
    CiftEleman bas;

    public DaireselListe() {
        bas = null;
    }

    void listeyeEkle(CiftEleman yeni) {

        if (bas == null) {
            yeni.ileri = yeni;
            yeni.geri = yeni;
        } else {
            yeni.ileri = bas;
            yeni.geri = bas.geri;
            bas.geri.ileri = yeni;
            bas.geri = yeni;
        }
        bas =yeni;
    }

    void listeBasiSil(){
        if(bas.ileri == bas){
            bas = null;
        }else{
            bas.geri.ileri = bas.ileri;
            bas.ileri.geri = bas.geri;
            bas = bas.ileri;
        }
    }
}
