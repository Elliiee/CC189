import java.util.ArrayList;
import java.util.LinkedList;

public class ListOfDepth {
    ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root){
        ArrayList<LinkedList<TreeNode>> lists = new ArrayList<LinkedList<TreeNode>>();
        createLevelLinkedList(root, lists, 0);
        return lists;
    }

    void createLevelLinkedList(TreeNode root, ArrayList<LinkedList<TreeNode>> lists,
                               int level){
        if (root == null) return;

        LinkedList<TreeNode> list = null;
        if (lists.size() == level){
            lists.add(list);
        } else {
            list = lists.get(level);
        }
        list.add(root);
        System.out.print(root.val + " ");
        System.out.println();
        createLevelLinkedList(root.left, lists, level + 1);
        createLevelLinkedList(root.right, lists, level + 1);
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(8);
        root.right = new TreeNode(12);
        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(9);
        root.right.left = new TreeNode(11);
        root.right.left = new TreeNode(12);

        ListOfDepth ld = new ListOfDepth();
        ld.createLevelLinkedList(root);


    }


}
