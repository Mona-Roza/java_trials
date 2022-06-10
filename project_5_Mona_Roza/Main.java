public class Main {
    public static void main(String args[]) throws Exception{
        System.out.println("Printing HTML output for document #1:");
        System.out.print(GetHTML4Document1());

        System.out.println("Printing HTML output for document #2:");
        System.out.print(GetHTML4Document2());

        System.out.println("Printing HTML output for document #3:");
        System.out.print(GetHTML4Document3());

        System.out.println("Printing HTML output for document #4:");
        System.out.print(GetHTML4Document4());
    }

    public static String GetHTML4Document1(){
        HTMLNode body = new HTMLNode("body");
        HTMLNode html = new HTMLNode("html");

        HTMLNode p = new HTMLNode("p");
        HTMLNode h1 = new HTMLNode("h1");
        HTMLNode div = new HTMLNode("div");

        HTMLNode article = new HTMLNode("article");

        HTMLNode[] divChildren = new HTMLNode[]{article};
        HTMLNode[] bodyChildren = new HTMLNode[]{div, p, h1};
        HTMLNode[] htmlChildren = new HTMLNode[]{body};

        html.setChildren(htmlChildren);
        body.setChildren(bodyChildren);
        div.setChildren(divChildren);

        HTMLTree tr = new HTMLTree(html);
        return tr.GetHTML();
    }

    public static String GetHTML4Document2(){
        HTMLNode article = new HTMLNode("article");
        HTMLNode a = new HTMLNode("a");
        HTMLNode p = new HTMLNode("p");
        HTMLNode h1 = new HTMLNode("h1");

        HTMLNode div1 = new HTMLNode("div");
        HTMLNode div2 = new HTMLNode("div");
        HTMLNode div3 = new HTMLNode("div");

        HTMLNode ol   = new HTMLNode("ol");
        HTMLNode li1   = new HTMLNode("li");
        HTMLNode li2   = new HTMLNode("li");
        HTMLNode li3   = new HTMLNode("li");
        HTMLNode li4   = new HTMLNode("li");

        HTMLNode body = new HTMLNode("body");
        HTMLNode head = new HTMLNode("head");
        HTMLNode title = new HTMLNode("title");
        HTMLNode meta = new HTMLNode("meta");
        HTMLNode html = new HTMLNode("html");

        HTMLNode[] htmlChildren = new HTMLNode[]{head, body};
        HTMLNode[] bodyChildren = new HTMLNode[]{h1, div1, article, div2};
        HTMLNode[] headChildren = new HTMLNode[]{meta, title};

        HTMLNode[] div1Children = new HTMLNode[]{div3};
        HTMLNode[] div3Children = new HTMLNode[]{p};
        HTMLNode[] pChildren = new HTMLNode[]{a};

        HTMLNode[] div2Children = new HTMLNode[]{ol};
        HTMLNode[] olChildren = new HTMLNode[]{li1, li2, li3, li4};

        html.setChildren(htmlChildren);
        body.setChildren(bodyChildren);
        head.setChildren(headChildren);

        div1.setChildren(div1Children);
        div3.setChildren(div3Children);
        p.setChildren(pChildren);

        div2.setChildren(div2Children);
        ol.setChildren(olChildren);

        HTMLTree tr = new HTMLTree(html);
        return tr.GetHTML();
    }

    public static String GetHTML4Document3(){
        HTMLNode html = new HTMLNode("html");
        HTMLTree tr = new HTMLTree(html);
        return tr.GetHTML();
    }

    public static String GetHTML4Document4(){
        HTMLTree tr = new HTMLTree(null);
        return tr.GetHTML();
    }
}