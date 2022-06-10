public class Eleman {
    int icerik; //Elemanın içindeki veri
    Eleman ileri; //Bir sonraki elemanı gösteren işaretçi

    public Eleman(int icerik){
        this.icerik=icerik;
        ileri=null;
    }
}
