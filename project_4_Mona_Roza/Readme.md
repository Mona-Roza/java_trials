Size hazir verilen `TreeNode.java` dosyasinin icerigi asagidaki gibidir.

```java
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(){
    }

    public TreeNode(int value){
        val = value;
        left = null;
        right = null;
    }
}
```

Size verilen `BST.java` dosyasinin icerigi asagidaki gibidir.

```java
public class BST {
    TreeNode root;

    public BST(){
        root = null;
    }

    public BST(TreeNode node){
        root = node;
    }


    public TreeNode Add(int val){
        TreeNode newNode = new TreeNode(val);
        if (root == null){
            root = newNode;
            return root;
        }

        TreeNode p = null;
        TreeNode n = root;

        while (n != null){
            if (n.val < val){
                p = n;
                n = n.right;
            }
            else{
                p = n;
                n = n.left;
            }
        }

        if (p.val < val){
            p.right = newNode;
        }
        else{
            p.left = newNode;
        }
        return root;
    }

    public void PrintInOrder(){
        InOrder(root);
    }

    public void InOrder(TreeNode node){
        if (node == null){
            return;
        }
        InOrder(node.left);
        System.out.print(" " + node.val + " ");
        InOrder(node.right);
    }

    // Bu metod ikili arama agacinin elemanalarini preorder sirada ekrana yazdirir.
    // Bu metodu yazabilmek icin sinif icinde yardimci bir metod tanimi yapabilirsiniz.
    // Ornegin PrintInOder metodunun yazimi icin InOrder yardimci metodu yazilmistir.
    public void PrintPreOrder(){
        // Metodun icini uygun sekilde doldurunuz.
    }


    // Bu metod ikili arama agacinin elemanalarini postorder sirada ekrana yazdirir.
    // Bu metodu yazabilmek icin sinif icinde yardimci bir metod tanimi yapabilirsiniz.
    // Ornegin PrintInOder metodunun yazimi icin InOrder yardimci metodu yazilmistir.
    public void PrintPostOrder(){
        // Metodun icini uygun sekilde doldurunuz.
    }

    
    // Bu metod bu objenin ikili arama agaci ozelligi tasiyip tasimadigini kontrol eder.
    // Bu objedenin temsil ettigi ikili agac; ikili arama agaci ise bu metod true
    // aksi durumda false degerinin dondurur.
    // Bu metodu yazabilmek icin sinif icinde yardimci bir metod tanimi yapabilirsiniz.
    // Ornegin PrintInOder metodunun yazimi icin InOrder yardimci metodu yazilmistir.
    public boolean IsBST(){
        // Metodun icini uygun sekilde doldurunuz.
    }
}
```

Size verilen `Main.java` dosyasinin icerigi asagidaki gibidir.

```java
public class Main {
    public static void main(String[] args){
        boolean res;
        BST b = new BST();
        b.Add(9);
        b.Add(4);
        b.Add(45);
        b.Add(12);
        b.Add(100);
        b.Add(75);
        b.Add(-100);
        b.Add(50);

        System.out.println("Inorder");
        b.PrintInOrder();
        System.out.println("PreOrder");
        b.PrintPreOrder();
        System.out.println("PostOrder");
        b.PrintPostOrder();

        res = b.IsBST();
        System.out.println(res);

        TreeNode a1 = new TreeNode(100);
        TreeNode a2 = new TreeNode(90);
        TreeNode a3 = new TreeNode(155);
        TreeNode a4 = new TreeNode(23);
        TreeNode a5 = new TreeNode(111);
        a1.left = a2;
        a2.left = a3;
        a2.right = a4;
        a1.right = a5;
        BST a = new BST(a1);
        res = a.IsBST();
        System.out.println(res);

        TreeNode d1 = new TreeNode(100);
        TreeNode d2 = new TreeNode(90);
        TreeNode d3 = new TreeNode(155);
        TreeNode d4 = new TreeNode(23);
        TreeNode d5 = new TreeNode(111);
        d4.right = d2;
        d2.right = d1;
        d1.right = d5;
        d5.right = d3;
        BST d = new BST(d4);
        res = d.IsBST();
        System.out.println(res);

        TreeNode e1 = new TreeNode(1);
        TreeNode e2 = new TreeNode(2);
        TreeNode e3 = new TreeNode(3);
        TreeNode e4 = new TreeNode(4);
        TreeNode e5 = new TreeNode(5);
        e3.left = e1;
        e3.right = e5;
        e1.right = e2;
        e5.right = e4;
        BST e = new BST(e3);
        res = e.IsBST();
        System.out.println(res);
    }
}
```

### Proje Aciklamalari

* Projede size verilen `TreeNode.java` `BST.java` ve `Main.java` dosyalarini inceleyiniz ve yorum satirlarini dikkatle okuyunuz. `TreeNode.java` `BST.java` dosyalarina yorum satirlarinda istenilen degisikleri uygulayaniz. `Main.java` dosyasi oldugu gibi kalabilir veya degistirilebilir. Projenizin derlenmesinde sorun yaratmadigi muddetce `Main.java` uzerinde istediginiz degisikligi yapabilirsiniz. 
* BST sinifi ikili arama agaci verilerini uzerinde calisabilmek icin yazilmistir. Ne var ki TreeNode sinifinin degisken uyeleri public tanimlandigi icin BST sinifi kullanilarak ikili arama agaci ozelligi tasimayan ikili agaclar olusturulabilmektedir. Bu durumun iki farkli ornegi Main.java icindeki kodlar incelenerek gorulebilir. BST sinifinda kodlamaniz istenen `IsBST()` metodu BST sinifindan olusturulan bir objede saklanana ikili agacin ikili arama agaci olup olmadigini kontrol etmektedir. 

### Projenin Derlenmesi

Bu proje asagidaki gibi derlenebilir.

```bash
javac TreeNode.java BST.java Main.java
```

### Projenin Calistirilmasi

Size verilen kodlardaki bos metodlar istenildigi sekliyle dolduruldugunda bir onceki adimda derlemis oldugunuz projenizi calistirdiginizda elde edeceginiz termina ciktisi asagidaki gibi olacaktir.

#### Programin Calistirilmasi

```bash
java Main
```

#### Programin Terminal Ciktisi

```bash
Inorder
 -100  4  9  12  45  50  75  100 
PreOrder
9  -100  4  12  45  50  75  100 
PostOrder
 -100  4  12  45  50  75  100  9
true
false
true
false
```


