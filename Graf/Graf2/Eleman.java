package Graf2;

public class Eleman {
    int baslangic, bitis, agirlik, icerik;
    Eleman ileri;

    public Eleman(int baslangic, int bitis, int agirlik){
        this.baslangic = baslangic;
        this.bitis = bitis;
        this.agirlik = agirlik;
     
        ileri = null;
    }
}
