class Main{
    public static void main(){

    }

    int ardisil(int[] Dizi, int N, int aranan){
        
        for(int k=0; k<N; k++){
            if(Dizi[k] == aranan)
                return k;
        }
        
        return -1;
    }

    int ikiliArama(int[] D, int N, int aranan){
        int orta, ilk =0, son=N-1;

        while(ilk<=son){
            orta= (ilk + son)/2;
            if(aranan == D[orta])
                return orta;
            else if(aranan>D[orta])
                ilk = orta + 1;
            else
                son = orta -1;
        }

        return -1;
    }
}