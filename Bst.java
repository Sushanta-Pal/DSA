public class Bst {
        static int count =0;
        public static int rangeSumBST(TreeNode root, int low, int high) {
            helper(root,low,high);
            return count;
        }
        public static void helper(TreeNode root, int low, int high) {
         if (root==null) {
            return;
         }
         helper(root.left, low, high);
         helper(root.right, low, high);
         int val=root.val;
         if (val>=low && val<=high) {
            count+=val;
         }

        }

    public static void main(String[] args) {
        
    }
}
