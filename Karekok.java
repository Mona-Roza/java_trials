class Karekok {
    public static void main(String[] args) {
        int sayi=5;
        int sayitutac= sayi;
        double kok=1;
        for( int i=0; i<sayitutac; i++){
            kok=(sayi/kok+kok)/2;
        }
        System.out.println(kok);
    }
}