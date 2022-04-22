package polinom;

public class Eleman {
    int katsayi;
    int us;
    Eleman ileri;

    public Eleman(int katsayi, int us){
        this.katsayi = katsayi;
        this.us = us;
        ileri =null;
    }
}
