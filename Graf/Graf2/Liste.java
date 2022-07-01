package Graf2;

public class Liste {
    Eleman bas;
    Eleman son;

    public  Liste() {
        bas = null;
        son = null;
    }

    void listeBasinaEkle(Eleman yeni) {
        if (son == null) { // Liste boşsa
            son = yeni;
        }
        yeni.ileri = bas;
        bas = yeni;
    }

    void listeSonuneEkle(Eleman yeni) {
        if (bas == null) {
            bas = yeni;
        } else {
            son.ileri = yeni;
        }
        son = yeni;
    }

    void listeOrtasınaEkle(Eleman yeni, Eleman once) {
        yeni.ileri = once.ileri;
        once.ileri = yeni;
    }

    Eleman listeAra(int deger) {
        Eleman tmp;
        tmp = bas;

        while (tmp != null) {
            if (tmp.icerik == deger) {
                return tmp;
            }
            tmp = tmp.ileri;
        }
        return null;
    }

    Eleman elemanI(int i) {
        Eleman tmp = bas;
        int j = 0;

        while(tmp !=null && j<i){
            j++;
            tmp = tmp.ileri;
        }
        return tmp;
    }

    void listeBasiSill(){
        bas = bas.ileri;

        if(bas==null){
            son = null;
        }
    }

    void listeSonuSil(){
        Eleman tmp, once;
        tmp = bas;
        once = null;

        while(tmp != son){
            once=tmp;
            tmp= tmp.ileri;
        }

        if(once == null){
            bas = null;
        }else{
            once.ileri = null;
        }
        son= once;
    }

    void listeOrtasındanSil(Eleman s){
        Eleman tmp, elemanonce;
        tmp=bas;
        elemanonce = null;

        while(tmp != s){
            elemanonce = tmp;
            tmp = tmp.ileri;
        }
        elemanonce.ileri = s.ileri;
    }

    public int elemanSayisi(){
        int sayac = 0; 
        Eleman tmp;
        tmp = bas;

        while(tmp != null){
            tmp= tmp.ileri;
            sayac++;
        }           
        return sayac;
    }
}
