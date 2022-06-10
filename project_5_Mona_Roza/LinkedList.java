public class LinkedList{
    private LinkedListNode head;
    private LinkedListNode tail;

    public LinkedList(){
        head = null;
    }

    public void Append(String newNodeValue){
        LinkedListNode newNode = new LinkedListNode(newNodeValue);
        if(head == null)
            head = newNode;
        else{
            tail.next = newNode;
        }
        tail = newNode;
    }

    public int Quentity(){
        int sayac = 0; 
        LinkedListNode tmp;
        tmp = head;

        while(tmp != null){
            tmp= tmp.next;
            sayac++;
        }           
        return sayac;
    }

    public LinkedListNode getHead() {
        return this.head;
    }

}