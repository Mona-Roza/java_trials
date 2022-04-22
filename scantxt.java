import java.io.FileReader;
import java.util.*;

public class scantxt {
    public static void main(String[] args){
        
        int[] elems = ReadIntArrayFromFile("D:\\Codding\\java_denemeleri\\list.txt");
        int i = 1;
        for (int v : elems){
            System.out.println("Dosyadaki " + i  + ". tam sayi " + v + "'dir.");
            i++;
        }
    }

    public static int[] ReadIntArrayFromFile(String path){
        List<Integer> intList = new ArrayList<Integer>();
        Scanner sc;
        try {
            sc = new Scanner(new FileReader(path)).useDelimiter("\\s+");
        }
        catch(Exception ex){
            return null;
        }

        while (sc.hasNext()) {
            String token = sc.next();
            int num = Integer.parseInt(token);
            intList.add(num);
        }

        int[] intArray = new int[intList.size()];
        int ind = 0;
        for (Integer v:intList){
            intArray[ind++] = v.intValue();
        }
        return intArray;
    }

}