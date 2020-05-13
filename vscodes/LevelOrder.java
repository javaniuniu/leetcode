import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Util.TreeNode;

public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> curr = new ArrayList<>();
            int size = queue.size();
            for(int i = 0;i<size;i++) {
                TreeNode node =  queue.poll();
                if(node ==null) {
                    continue;
                }
                curr.add(node.val);

                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
                if(i==size-1) {
                    res.add(curr);
                }
            }
        }

        return res;
    }
    
}