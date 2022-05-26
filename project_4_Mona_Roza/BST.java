public class BST {
    TreeNode root;

    public BST() {
        root = null;
    }

    public BST(TreeNode node) {
        root = node;
    }

    public TreeNode Add(int val) {
        TreeNode newNode = new TreeNode(val);
        if (root == null) {
            root = newNode;
            return root;
        }

        TreeNode p = null;
        TreeNode n = root;

        while (n != null) {
            if (n.val < val) {
                p = n;
                n = n.right;
            } else {
                p = n;
                n = n.left;
            }
        }

        if (p.val < val) {
            p.right = newNode;
        } else {
            p.left = newNode;
        }
        return root;
    }

    public void PrintInOrder() {
        InOrder(root);
    }

    public void InOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        InOrder(node.left);
        System.out.print(" " + node.val + " ");
        InOrder(node.right);
    }

    // Bu metod ikili arama agacinin elemanalarini preorder sirada ekrana yazdirir.
    // Bu metodu yazabilmek icin sinif icinde yardimci bir metod tanimi
    // yapabilirsiniz.
    // Ornegin PrintInOder metodunun yazimi icin InOrder yardimci metodu
    // yazilmistir.
    public void PrintPreOrder() {
        PreOrder(root);
    }

    public void PreOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " ");
        PreOrder(node.left);
        PreOrder(node.right);
    }

    // Bu metod ikili arama agacinin elemanalarini postorder sirada ekrana yazdirir.
    // Bu metodu yazabilmek icin sinif icinde yardimci bir metod tanimi
    // yapabilirsiniz.
    // Ornegin PrintInOder metodunun yazimi icin InOrder yardimci metodu
    // yazilmistir.
    public void PrintPostOrder() {
        PostOrder(root);
    }

    public void PostOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        PostOrder(node.left);
        PostOrder(node.right);
        System.out.print(node.val + " ");
    }

    // Bu metod bu objenin ikili arama agaci ozelligi tasiyip tasimadigini kontrol
    // eder.
    // Bu objedenin temsil ettigi ikili agac; ikili arama agaci ise bu metod true
    // aksi durumda false degerinin dondurur.
    // Bu metodu yazabilmek icin sinif icinde yardimci bir metod tanimi
    // yapabilirsiniz.
    // Ornegin PrintInOder metodunun yazimi icin InOrder yardimci metodu
    // yazilmistir.
    public boolean IsBST() {
        return isBSTHelper(this.root, -2147483648, 2147483647);
    }

    private boolean isBSTHelper(TreeNode root, int min, int max) {
        if (root == null) {
            return true;
        }
        if (root.val >= min && root.val <= max && isBSTHelper(root.left, min, root.val)
                && isBSTHelper(root.right, root.val, max)) {
            return true;
        }
        return false;
    }
}
