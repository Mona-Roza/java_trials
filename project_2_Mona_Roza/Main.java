package project_2_Mona_Roza;

public class Main {
    
    public static void main(String[] args){
        // main altinda linkedlist sinifi icin yazdiginiz metodlarin dogru
        // calisip calismadigini test edebilirsiniz.
        // main altinda yazacaginiz kodlar derleme hatasi uretmedigi surece
        // notlandirmaya olumlu veya olumsuz etkisi olmayacaktir.

        // LinkedList list = new LinkedList();
        // list.Append(5);
        // list.Append(6);
        // list.Append(2);
        // list.Print();
        // System.out.println(list.Sum()+ " sum");
        // System.out.println(list.IsSorted() +" isSorted");

        int[] num1 = {1,6,7,9,14};
        int[] num2 = {-1, 4,8,10,11,15,19};
        LinkedList a = new LinkedList(num1);
        LinkedList b = new LinkedList(num2);
        // a.Print();
        // System.out.println(a.IsSorted() + " isSorted");
        // b.Print();
        // System.out.println(b.IsSorted() + " isSorted");

        LinkedList c = LinkedList.MergeSortedLists(a,b);
        c.Print();
        // System.out.println(c.IsSorted()+ " isSorted");
        // System.out.println(c.Sum() + " sum");
        c.PrintReverse();
    }
}
