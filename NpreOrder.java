//https://leetcode.com/problems/n-ary-tree-preorder-traversal/

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};

class NpreOrder {
    List<Integer> linodes = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        if(root == null) return linodes;
        linodes.add(root.val);
        for(Node node : root.children) preorder(node);
        return linodes;
    }
}
