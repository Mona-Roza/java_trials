/*Odev4 DiziCarpim Arguman olarak icinde tamsayilarin saklandigi ve
bu sayilarin bosluk karakteri ile birbirlerin ayrildigi bir metin 
dosyasinin konumunu (path, yol, dosya ismi) alan ve bu dosyadaki sayilarin 
carpimini ekrana yazdiran bir program yaziniz. Metin dosyasi bos bir dosya 
ise (icinde hic tamsayi bulunmazsa program ekrana 1 (carpma isleminin 
etkisiz elemani) yazdirmalidir. */

import java.io.FileReader;
import java.util.*;

public class odev4_dizicarpim {
    public static void main(String[] args) {
        int carpim = 1;
        String path = args[0];
        try {
            int[] elems = ReadIntArrayFromFile(path);
            int i = 1;
            for (int v : elems) {
                carpim *= v;
                i++;
            }
            System.out.println(carpim);
        } catch (Exception e) {
            System.out.println(carpim);
        }

    }

    public static int[] ReadIntArrayFromFile(String path) {
        List<Integer> intList = new ArrayList<Integer>();
        Scanner sc;
        try {
            sc = new Scanner(new FileReader(path)).useDelimiter("\\s+");
        } catch (Exception ex) {
            return null;
        }

        while (sc.hasNext()) {
            String token = sc.next();
            int num = Integer.parseInt(token);
            intList.add(num);
        }

        int[] intArray = new int[intList.size()];
        int ind = 0;
        for (Integer v : intList) {
            intArray[ind++] = v.intValue();
        }
        return intArray;
    }
}