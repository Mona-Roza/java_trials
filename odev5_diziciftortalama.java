import java.io.FileReader;
import java.util.*;
/*Odev5 DiziCiftOrtalama Arguman olarak icinde tamsayilarin
saklandigi ve bu sayilarin bosluk karakteri ile birbirlerin
ayrildigi bir metin dosyasinin konumunu (path, yol, dosya ismi)
alan ve bu dosyadaki sayilardan cift olanlarin ortalamasini ekrana
yazdiran bir program yaziniz. Listede cift sayi yoksa ortalama 0
olacagi icin ekrana sifir yazdirilmalidir. Tam sayilarin ortalamasi
rasyonel sayi (double) cikabilir. Programiniz kodlarken bu durumu
goz onunde bulundurunuz! */

public class odev5_diziciftortalama {
    public static void main(String[] args) {
        double ortalama = 0;
        String path = args[0];
        try {
            int[] elems = ReadIntArrayFromFile(path);
            if (elems.length != 0) {
                double j = 0;
                for (int i = 0; i < elems.length; i++) {
                    if (elems[i] % 2 == 0) {
                        ortalama += (double) elems[i];
                        j++;
                    }
                }
                if (j != 0)
                    ortalama /= (j);
            }
            System.out.println(ortalama);
        } catch (Exception e) {
            System.out.println(e.toString() + ortalama);
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
