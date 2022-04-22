package polinom;

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

    void sirala()
    {
        Eleman current = bas, index = null;
 
        int temp;
 
        if (bas == null) {
            return;
        }
        else {
            while (current != null) {
                index = current.ileri;
 
                while (index != null) {
                    if (current.us > index.us) {
                        temp = current.us;
                        current.us = index.us;
                        index.us = temp;
                    }
 
                    index = index.ileri;
                }
                current = current.ileri;
            }
        }
    }

    Liste topla(Liste p1, Liste p2){
        Eleman i=p1.bas, j=p2.bas, k, yeni;
        Liste sonuc = new Liste();
        int katsayi, us;

        while(i!=null && j != null){
            if(i.us == j.us){
                katsayi = i.katsayi+ j.katsayi;
                us = i.us;
                i = i.ileri;
                j = j.ileri;
            }
            else{
                if(i.us> j.us){
                    katsayi =i.katsayi;
                    us= i.us;
                    i =i.ileri;
                }else{
                    katsayi = j.katsayi;
                    us = j.us;
                    j= j.ileri;
                }
            }
            if(katsayi!=0){
                yeni = new Eleman(katsayi, us);
                sonuc.listeBasinaEkle(yeni);
            }
        }
        if(i == null){
            k=j;
        }else{
            k=i;
        }
        while(k!=null){
            yeni = new Eleman(k.katsayi, k.us);
            sonuc.listeBasinaEkle(yeni);
            k = k.ileri;
        }
        return sonuc;
    }

    Liste carp(Liste p1, Liste p2){
        Eleman i= p1.bas, j, yeni, once;
        Liste sonuc = new Liste();
        int katsayi, us;

        while(i!=null){
            j= p2.bas;

            while(j!=null){
                katsayi= i.katsayi * j.katsayi;
                us= i.us +j.us;
                yeni = new Eleman(katsayi, us);
                sonuc.listeBasinaEkle(yeni);
                j= j.ileri;
            }
            i = i.ileri;
        }
        sonuc.sirala();
        i = sonuc.bas;
        once=null;

        while(i != null){
            j= i.ileri;

            while( j != null && j.us == i.us){
                i.katsayi += j.katsayi;
                i.ileri = j.ileri;
                j = j.ileri;
            }

            if(i.katsayi == 0){
                once.ileri = j;
            }else{
                once =i;
            }
            i=j;
        }
        return sonuc;
    }
}
