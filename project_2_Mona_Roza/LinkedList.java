package project_2_Mona_Roza;

public class LinkedList {
    Node head ;

    public LinkedList() {
        head = null;
    }

    public LinkedList(int[] arr) {
        head = null;
        for (int i = 0; i < arr.length; i++) {
            Node n = new Node(arr[i]);
            Append(n);
        }
    }

    // Listenin sonuna ekleme yapan metod
    public void Append(int val) {
        Node newNode = new Node();
        newNode.value = val;
        newNode.next = null;
        // Yukaridaki 3 satirlik ifade yerine asagidaki yoruma cevrilmis ifade
        // yazilabilirdi.
        // Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            return;
        }

        Node n = head;
        while (n.next != null) {
            n = n.next;
        }
        n.next = newNode;
    }

    public void Append(Node newNode) {
        if (head == null) {
            head = newNode;
            return;
        }

        Node n = head;
        while (n.next != null) {
            n = n.next;
        }
        n.next = newNode;
    }

    public void Print() {
        Node n = head;
        while (n != null) {
            System.out.print("| " + n.value + " |" + " --> ");
            n = n.next;
        }
        System.out.println("|NULL|");
    }

    // Bu metod bagli listenin elemanlarini sondan basa dogru sirali okarak ekrana
    // yazdirir.
    // Bu metodun ciktisi Print metodununun ciktisinin yonu degistirilmis sekli
    // olmalidir.
    // Bu metodu kodlamak icin dizi, ArrayList, String metodlari vb. kullanmayiniz.
    // Bu metodu recursive (oz yinelemeli) sekilde yazabilirsiniz. Bu metodu yazmak
    // icin baska
    // bir metod tanimlayip PrintReverse metodu icinde tanimlamis oldugunuz bu
    // metodu kullanabilirsiniz.

    public void PrintReverse() {
        Node headNode = head;
        int counter = 0;

        while (headNode != null) {
            headNode = headNode.next;
            counter++;
        }
        // Listede kaç eleman olduğunu saydık

        headNode = head;
        int[] listtoarray = new int[counter];
        // listenin eleman sayısı büyüklüğünde bir dizi oluşturduk
        int i = 0;

        while (headNode != null) {
            listtoarray[i] = headNode.value;
            headNode = headNode.next;
            // Listenin elemanlarını diziye aktardık
            i++;
        }

        int[] reverselisttoarray = new int[counter];
        counter--;
        // dizinin son indisi eleman sayısından 1 eksik olduğu için
        // eleman sayısını bir azalttık
        int j = 0;
        // düz şekilde sayabilmek için bir değişken daha tanımladık
        while (counter >= 0) {
            reverselisttoarray[j] = listtoarray[counter];
            counter--;
            j++;
        }
        // diziyi ters çevirdik
        LinkedList reverselist = new LinkedList(reverselisttoarray);
        Node n = reverselist.head;
        System.out.println("|NULL|");
        while (n != null) {
            System.out.print(" <-- "+ "| " + n.value + " |");
            n = n.next;
        }
    }

    // Bu metod bagli listedeki elemanlarin toplamini dondurur.

    public int Sum() {
        Node headNode = head;
        int sum = 0;
        while (headNode != null) {
            sum += headNode.value;
            headNode = headNode.next;
        }
        return sum;
    }

    // IsSorted() bagli liste kucukten buyuge sirali ise true aksi durumda false
    // dondurur.
    // Bagli liste bos ise veya tek elemanli ise IsSorted() true dondurur.

    public boolean IsSorted() {
        Node headNode = head;
        int counter = 0;
        if(headNode == null){
            return true;
        }else{
            while (headNode != null) {
                counter++;
                headNode = headNode.next;
            }
            
            if(counter==1){
                return true;
            }
            else{
                headNode = head;
                int temp =headNode.value;
                headNode = headNode.next;
                while(headNode != null){
                    if(temp>headNode.value){
                        return false;
                    }
                    else{temp = headNode.value;
                    headNode=headNode.next;}
                }
                return true;
            }
        }
    }

    // MergeSortedLists(LinkedList m, LinkedList n) parametre olarak iki tane
    // kucukten
    // buyuge sirali bagli liste alir ve bu listelerdeki elemanlarin kucukten buyuge
    // siralandigi bir bagli liste dondurur.

    public static LinkedList MergeSortedLists(LinkedList m, LinkedList n) {
            Node headNode = m.head;
            int counter=0;
            while (headNode != null){
                counter++;
                headNode= headNode.next;
            }
            headNode= n.head;
            while (headNode != null){
                counter++;
                headNode= headNode.next;
            }
            
            
            int[] listtoarray = new int[counter+1];
            int i=1,j=0;
            headNode = m.head;
            
                while (headNode != null){
                    listtoarray[j]=headNode.value;
                    headNode= headNode.next;
                    j++;
                }
                headNode=n.head;
                while (headNode != null){
                    listtoarray[j]=headNode.value;
                    headNode= headNode.next;
                    j++;
                }
        
            // iki liste de 1 arrayde birleştirildi
            //Bubble sort algoritması ile elemanlarımızı sıralayalım.
            int temp=0;
            for (int k = 0; k < listtoarray.length - 1; k++) {
                for (int y = 0; y < listtoarray.length - 1; y++) {
                    if (listtoarray[y] > listtoarray[y + 1]) {
                        temp = listtoarray[y];
                        listtoarray[y] = listtoarray[y + 1];
                        listtoarray[y + 1] = temp;
                    }
                }
            }
           LinkedList list = new LinkedList(listtoarray);
           return list;
      
    }
}
