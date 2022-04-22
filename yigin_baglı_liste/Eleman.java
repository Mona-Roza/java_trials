package yigin_baglı_liste;

public class Eleman {
    int icerik; 
    Eleman ileri; 

    public Eleman(int icerik){
        this.icerik=icerik;
        ileri=null;
    }
}
