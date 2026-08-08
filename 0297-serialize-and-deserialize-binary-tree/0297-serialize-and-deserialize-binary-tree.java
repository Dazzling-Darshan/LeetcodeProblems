/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Codec {

    private int index = 0;

    public String serialize(TreeNode root) {

        StringBuilder sb = new StringBuilder();
        serializeHelper(root, sb);
        return sb.toString();
    }

    private void serializeHelper(TreeNode node, StringBuilder sb) {

        if (node == null) {
            sb.append("#,");
            return;
        }

        sb.append(node.val).append(",");

        serializeHelper(node.left, sb);
        serializeHelper(node.right, sb);
    }

    public TreeNode deserialize(String data) {

        index = 0; 
        String[] arr = data.split(",");
        return deserializeHelper(arr);
    }

    private TreeNode deserializeHelper(String[] arr) {

        String current = arr[index++];

        if (current.equals("#"))
            return null;

        TreeNode root = new TreeNode(Integer.parseInt(current));

        root.left = deserializeHelper(arr);
        root.right = deserializeHelper(arr);

        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));