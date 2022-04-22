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

public class odev6_dizifark {
    public static void main(String[] args) {
        int kucuksayi = 0;
        int buyuksayi = 0;
        int sayac = 0;
        String path = args[0];
        try {
            int[] elems = ReadIntArrayFromFile(path);
            if (elems.length != 0) {
                kucuksayi = elems[0];
                buyuksayi = elems[0];
                for (int i = 1; i < elems.length; i++) {
                    if (elems[i] == kucuksayi)
                        sayac++;
                    if (elems[i] < kucuksayi)
                        kucuksayi = elems[i];
                    if (elems[i] > buyuksayi)
                        buyuksayi = elems[i];
                }
            }
            if (sayac == elems.length - 1)
                System.out.println("0");
            else
                System.out.println(buyuksayi - kucuksayi);
        } catch (Exception e) {
            System.out.println("0");
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
