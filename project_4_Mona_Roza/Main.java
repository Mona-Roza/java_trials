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
        System.out.println();
    
        System.out.println("PreOrder");
        b.PrintPreOrder();
        System.out.println();
    
        System.out.println("PostOrder");
        b.PrintPostOrder();
        System.out.println();

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
