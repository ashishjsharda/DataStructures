
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};

/**
 * Mas Depth of n-ary Tree Java
 * @author asharda
 * @link :https://leetcode.com/problems/maximum-depth-of-n-ary-tree/submissions/
 */
class Solution {
    public int maxDepth(Node root) {

        if(root == null)
            return 0;

        int childDepth = 0;
        //if(root.children!= null)
        for(Node c: root.children)
            childDepth=Math.max(childDepth,maxDepth(c));

        return   childDepth+1;
    }
}
