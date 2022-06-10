public class HTMLTree {
    private HTMLNode root;

    public HTMLTree(HTMLNode root) {
        this.root = root;
    }

    public HTMLTree() {
        this(null);
    }

    // Bu metod bu sinifta saklanan HTML agacinin icerigini String olarak
    // dondurmektedir.
    // Bu metodu yazmak icin bu sinif icinde baska yardimci baska metod/metodlar
    // tanimlayabilirsiniz.
    // Bu metodu recursive olarak yazmaniz beklenmektedir.
    // Bu metodu daha kolay kodlayabilmeniz icin string birlestirme operatoru olan
    // `+` operatorunun
    // nasil kullanildigina ve String sinifi metodlarindan biri olan repeat metodunu
    // arastirmaniz
    // tavsiye edilmektedir.
    // Bu metodun dogru kodlanmasi durumunda uretmesi beklenen cikti Main.java
    // sinifi icindeki kodlar
    // ve bu kodlarin uretecegi program ciktisi incelenerek gorulebilir.
    
    public String GetHTML() {
        int i=0;
        String tree = "";
        LinkedList nodeList = new LinkedList();
        LinkedList fullnodeList = GetHTMLHelper(root, nodeList,i);

        if (fullnodeList == null) {
            return "";
        }
        LinkedListNode headNode = fullnodeList.getHead();
        while (headNode != null) {
            tree += headNode.value;
            headNode = headNode.next;
        }
        tree += "</html>\n";
        return tree;
    }

    public LinkedList GetHTMLHelper(HTMLNode root, LinkedList nodeList, int i) {
        if (root == null) {
            return null;
        } else {
            try {
                for(int j=0; j<=i;j++){
                    if(root.getTag() != "html")
                        nodeList.Append("   ");
                }
                if(root.getTag() != "html")
                    i++;
                nodeList.Append("<" + root.getTag() +">\n");
                for (HTMLNode x : root.getChildren()) {
                    GetHTMLHelper(x, nodeList, i);
                    for(int j=0; j<=i;j++){
                        nodeList.Append("   ");
                    }
                    nodeList.Append("</" + x.getTag() + ">\n");                 
                }
            } catch (NullPointerException e) {
            }
            return nodeList;
        }
    }

}
