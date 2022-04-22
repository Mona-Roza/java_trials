package yigin_postfix;

public class Ornek {
    int tip, islenen, oncelik;
    char islem;
    int icerik;
    
    public Ornek(char islem){
        this.tip=1;
        this.islem = islem;

        switch(islem){
            case '(':
                oncelik=0;
                break;
            case '+':
            case '-':
                oncelik=1;
                break;
            case '*':
            case '/':
                oncelik=2;
                break;
            case ')':
                oncelik=3;
                break;
        }
    }

    public Ornek(int icerik)
    {
        this.icerik = icerik;
    }
}