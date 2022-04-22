public class max {
    int Max(int[] dizi){
        int tmp = dizi[0];
        for(int i=0; i<dizi.length; i++){
            if(tmp<dizi[i]){
                tmp = dizi[i];
            }
        }
        return tmp;
    }
}
