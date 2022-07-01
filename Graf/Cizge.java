public class Cizge{
    int[][] kenar;
    int N;

    public Cizge(int N){
        int i, j;
        this.N = N;
        kenar = new int [N][N];

        for(i=0; i<N; i++){
            for(j=0; j<N; j++){
                kenar[i][j] = 0;
            }
        }
    }
}