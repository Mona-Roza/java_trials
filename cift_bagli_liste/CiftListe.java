package cift_bagli_liste;

public class CiftListe {
    CiftEleman bas;
    CiftEleman son;

    public CiftListe(){
        bas = null;
        son = null;
    }

    void listeBasinaEkle(CiftEleman yeni){
        if(son==null){
            son = yeni;
        }else{
            bas.geri = yeni;
        }
        yeni.ileri =bas;
        bas = yeni;
    }

    void listeSonunaEkle(CiftEleman yeni){
        if(bas==null){
            bas=yeni;
        }
        else{
            son.ileri = yeni;
        }
        yeni.geri = son;
        son = yeni;
    }

    void listeOrtaEkle(CiftEleman yeni, CiftEleman once){
        yeni.ileri = once.ileri;
        yeni.geri = once;
        once.ileri.geri = yeni;
        once.ileri = yeni;
    }

    void listeBasiSil(){
        bas=bas.ileri;
        if(bas==null){
            son= null;
        }else{
            bas.geri = null;
        }
    }

    void listeSonuSil(){
        son=son.geri;
        if(son==null){
            bas=null;
        }else{
            son.ileri =null;
        }
    }

    void listeOrtadanSil(CiftEleman s){
        s.ileri.geri=s.geri;
        s.geri.ileri = s.ileri;
    }
}
