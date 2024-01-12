import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Bst {
       public Bst(){
         
       }
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

  //Definition for a binary tree node.
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
         this.right = right;
     }
 }
public TreeNode createTree(int[] arr,TreeNode root){
       
    if ( arr.length == 0 || arr[0] == 1) {
        return null;
    }
    root =new TreeNode(arr[0]);
    Queue<TreeNode> q=new LinkedList<>();
    q.add(root);
    for(int i=1;i<arr.length;i+=2){
            TreeNode curr=q.poll();
            if (arr[i]!=-1) {
                curr.left=new TreeNode(arr[i]);
                q.add(curr.left);
            }
            if (i+1<arr.length && arr[i+1]!=-1) {
                curr.right=new TreeNode(arr[i+1]);
                q.add(curr.right);
            }
    }
    return root;

}

    //  public int maxAncestorDiff(TreeNode root) {
    //     return 0;
    //  }

    

    public static void main(String[] args) {
        int[] arr={8,3,10,1,6,-1,14,-1,-1,4,7,13};
        Bst b=new Bst();
        TreeNode root=b.createTree(arr, null);
       b.Pre_Order(root);

    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
       createSt(root1,s1);
       createSt(root2,s2);
 return s1.equals(s2);
    }
    void createSt(TreeNode root,Stack<Integer> s){
        if (root==null) {
            return;
        }
        if (root.left==null && root.right==null) {
            s.push(root.val);
        }
        createSt(root.left,s);
        createSt(root.right,s);
    }

   public  void Pre_Order(Bst.TreeNode root) {
        if (root==null) {
            return;
        }
        System.out.print(root.val+"->");
        Pre_Order(root.left);
        Pre_Order(root.right);
    }

}
