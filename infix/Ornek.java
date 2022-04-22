package infix;

public class Ornek {
    int tip, islenen, oncelik;
    char islem;
    /*tip elemanın işlem ya da
    işlenen olduğunu belirtir.
    0: işlenen
    1: işlem*/

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
    
}
