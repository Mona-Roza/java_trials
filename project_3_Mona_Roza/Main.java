public class Main {
    public static void main(String args[]){
        String s1_string = args[0];
        String s2_string = args[1];

        Stack s1 = new Stack(s1_string.length());
        Stack s2 = new Stack(s2_string.length());
      

        for (int i = 0; i < s1_string.length(); i++){
            char c = s1_string.charAt(i);
            if(c == '%')
                s1.pop();
            else
                s1.push(c);  
        }

        for (int i = 0; i < s2_string.length(); i++){
            char c = s2_string.charAt(i);
            if(c == '%')
                s2.pop();
            else
                s2.push(c);
        }
       
        System.out.println(Stack.Equal(s1, s2));
    }
}
