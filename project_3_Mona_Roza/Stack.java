public class Stack {
    public char[] s;
    public int N;

    public Stack(int cap) {
        s = new char[cap];
    }

    public int size() {
        return N;
    }

    public boolean isEmpty(){
        return N == 0;
    }


    public void push(char item) {
        s[N++] = item;
    }

    public char pop() {
        return s[--N];
    }
    
    
    // Bu fonksiyon parametre olarak aldigi iki yiginin icerigi ayni ise true aksi halde false degerini dondurur.
    // Iki yiginda bos ise bu fonksiyon true degerini dondurur.
    // Iki yiginin da icerigi ayni fakat kapasiteleri farkli ise (s dizisinin eleman sayilari farkli ise) fonksiyon true degerini dondurur.
    // Fonksiyon taniminda (function signature) herhangi bir degisiklik yapmayiniz.
    
    public static boolean Equal(Stack s1, Stack s2){
        if(s1.N == 0 && s2.N == 0)
        {
            return true;
        }else if(s1.N != s2.N){
            if(s1.N < s2.N){
                int i=0;
                for(i = 0; i<s1.N; i++){
                    if(s1.s[i] != s2.s[i]){
                        return false;
                    }else{
                        continue;
                    }
                }
                
                for(int j=i; j<s2.N; j++){
                    if(s2.s[i] != ' '){
                        return false;
                    }
                }
                return true;
            }else{
                int i=0;
                for(i = 0; i<s2.N; i++){
                    if(s1.s[i] != s2.s[i]){
                        return false;
                    }else{
                        continue;
                    }
                }
                int j = --i;
                for(j++; j<s1.N; j++){
                    if(s1.s[i] != ' '){
                        return false;
                    }
                }
                return true;
            }

        }else if(s1.N == s2.N && s1.N!=0 && s2.N !=0){
            for(int i = 0; i<s1.N; i++){
                if(s1.s[i] != s2.s[i]){
                    return false;
                }else{
                    continue;
                }
            }
            return true;
        }
        return false;
    }
}
