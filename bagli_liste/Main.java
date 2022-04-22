package bagli_liste;

public class Main {
public static void main(String[] args) {
        
    }

    Liste birlestir(Liste l1, Liste l2){
        Liste tmp;

        if(l1.bas ==null){
            return l2;
        }
        if(l2.bas == null){
            return l1;
        }

        tmp= new Liste();
        tmp.bas = l1.bas;
        tmp.son = l2.son;
        l1.son.ileri =l2.bas;
        return tmp;

    }
}
