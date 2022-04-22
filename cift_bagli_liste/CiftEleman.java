package cift_bagli_liste;

public class CiftEleman {
    int icerik;
    CiftEleman ileri;
    CiftEleman geri;

    public CiftEleman(int icerik){
        this.icerik = icerik;
        ileri=null;
        geri=null;
    }
}
