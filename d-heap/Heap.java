class Heap{
    Nokta dizi[];
    int tane, d;

    public Heap(int N, int d){
        dizi = new Nokta[N];
        tane = 0;
        this.d = d;
    }

    void asagiIn(int no){
        int i, cocuk, buyukCocuk=0, deger;

        do{
            deger = dizi[no].icerik;

            for(i=1; i<=d && d*no+i <tane; i++){
                cocuk = d * no + i ; 

                if(deger < dizi[cocuk].icerik){
                    buyukCocuk = cocuk;
                    deger = dizi[cocuk].icerik;
                }
            }

            if(deger != dizi[no].icerik){
                yerDegistir(no, buyukCocuk);
                no = buyukCocuk;
            }
        }while(deger != dizi[no].icerik);

    }

    void yerDegistir(int no, int buyukCocuk) {
    }
}