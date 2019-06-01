
//TreeNode class
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}


/**
 * Search BST
 * @author asharda
 *
 */
public class SearchBST {

    /**
     * Search in BST
     * @param root
     * @param val
     * @return TreeNode
     */
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) return root;
        TreeNode result = searchBST(root.left, val);
        return result == null ? searchBST(root.right, val) : result;
    }
    public static void main(String[] args) {
        SearchBST s=new SearchBST();
        TreeNode node=new TreeNode(4);
        node.left=new TreeNode(2);
        node.right=new TreeNode(7);
        node.left.right=new TreeNode(3);
        TreeNode root=s.searchBST(node,2);

    }

}
