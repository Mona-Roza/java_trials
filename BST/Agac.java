public class Agac {
    Dugum kok;

    public Agac(){
        kok = null;
    }

    Dugum agacAraRecursive(int eleman){
        if(kok.icerik == eleman)
            return this.kok;
        else{
            if(icerik>eleman)
                if(sol!=null)
                    return sol.agacAraRecursive(eleman);
                else    
                    return null;
            else
                if(sag !=null)
                    return sag.agacAraRecursive(eleman);
                else
                    return null;
        }
    }

    Dugum agacAraIterative(int eleman){
        Dugum d = kok;

        while(d != null){
            if(d.icerik == eleman)
                return d;
            else 
                if(d.icerik > eleman)
                    d = d.sol;
                else 
                    d = d.sag;
        }
        return null;
    }

    Dugum asgariAraRecursive(){
        if(sol == null)
            return this;
        else 
            return sol.asgariAraRecursive();
    }

    Dugum asgariAraIterative(){
        Dugum sonuc = this;

        while(sonuc.sol != null)
            sonuc = sonuc.sol;
        
        return sonuc;
    }

    Dugum azamiAraRecursive(){
        if(sag == null)
            return this;
        else 
            return sag.asgariAraRecursive();
    }

    Dugum azamiAraIterative(){
        Dugum sonuc = this;

        while(sonuc.sag != null)
            sonuc = sonuc.sag;
        
        return sonuc;
    }

    void agacaEkle(Dugum yeni){
        Dugum y = null;
        Dugum x = kok;

        while(x != null){
            y=x;
            if(yeni.icerik <x.icerik)
                x= x.sol;
            else
                x = x.sag;
        }

        if(y==null)
            kok = yeni;
        else
            if(yeni.icerik < y.icerik)
                y.sol = yeni;
            else 
                y.sag = yeni;
    }

    Dugum agacSil(Dugum kok, int icerik){
        this.kok = kok;
        if(kok == null)
            return kok;
        if( icerik < kok.icerik)
            kok.sol = agacSil(kok.sol, icerik);
        else if(icerik > kok.icerik)
            kok.sag = agacSil(kok.sag, icerik);
        else{
            //0 ya da 1 childi olan düğümden silme
            if(kok.sol == null)
                return kok.sag;
            else if(kok.sag == null)
                return kok.sol;
            //2 childli düğümden silme
            //soldaki en büyük ya da sağdaki 
            //en küçük cocuğu bul
            kok.icerik = kok.sag.asgariAra().icerik;
            kok.sag = agacSil(kok.sag, kok.icerik);
        }
        return kok;
    }
}



