public class HTMLNode {
    private String tag;
    private HTMLNode[] children;

    public HTMLNode(String tag){
       this(tag,  null);
    }

    public HTMLNode(String tag, HTMLNode[] children){
        this.tag = tag;
        this.children = children;
    }

    public void setChildren(HTMLNode[] children) {
        this.children = children;
    }

    public HTMLNode[] getChildren(){
        return children;
    }
    
    public String getTag(){
        return this.tag;
    }
}
