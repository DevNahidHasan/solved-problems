package a_easy;

import common.TreeBuilder;
import common.TreeNode;

public class L110_BalancedBinaryTree {
    public static void main(String[] args) {
        Integer[] arr = {3,9,20,null,null,15,7};
        Integer[] arr2 = {1,2,2,3,3,null,null,4,4};
        TreeNode root = TreeBuilder.buildTree(arr);

        System.out.println(isBalanced(root));
    }
    public static boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    private static int height(TreeNode node) {
        if (node == null){
            return 0;
        }

        int leftHeight = height(node.left);
        if (leftHeight == -1) return -1;

        int rightHeight = height(node.right);
        if (rightHeight == -1) return -1;

        if (Math.abs(leftHeight - rightHeight) > 1) return -1;

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
