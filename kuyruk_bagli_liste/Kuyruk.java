package kuyruk_bagli_liste;

public class Kuyruk {
    Eleman  bas, son;

    public Kuyruk(){
        bas=null;
        son = null;
    }

    boolean kuyrukBos(){
        if(bas==null)
            return true;
        else    
            return false;
    }

    void kuyrugaekle(Eleman yeni){
        if(!kuyrukBos())
            son.ileri = yeni;
        else    
            bas =yeni;

        son=yeni;
    }

    Eleman kuyrukSil(){
        Eleman sonuc;
        sonuc =bas;

        if(!kuyrukBos()){
            bas =bas.ileri;
             if(bas == null)
                son = null;
        }
        return sonuc;
    }
}
