package yigin_baglı_liste;

public class Yigin {
    Eleman ust;

    public Yigin(){
        ust = null;
    }

    boolean yiginBos(){
        if(ust==null)
            return true;
        else 
            return false;
    }

    void yiginaEkle(Eleman yeni){
        yeni.ileri = ust;
        ust=yeni;
    }

    Eleman yiginSil(){
        Eleman e = ust;

        if(!yiginBos())
            ust= ust.ileri;
            
        return e;
    }
}
