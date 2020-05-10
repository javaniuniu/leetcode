import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 23. 合并K个排序链表
 */
public class MergeKLists{
    /**
     * 使用列表
     * @param lists
     * @return
     */
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> list = new ArrayList<>();
        for(ListNode node:lists){
            while (node != null){
                list.add(node.val);
                node = node.next;
            }
        }
        Collections.sort(list);
        Collections.reverse(list);
        ListNode ans = null;
        for(int li:list){
            ListNode curr = new ListNode(li);
            curr.next = ans;
            ans = curr;
        }
        return ans;
    }
    /**
     * 使用优先队列处理
     * @param lists
     * @return
     */
    public ListNode mergeKListsByQueue(ListNode[] lists) {
        Queue<Integer> queue = new PriorityQueue<>((i1, i2) -> Integer.compare(i2, i1));

        for(ListNode node:lists){
            while (node != null){
                queue.add(node.val);
                node = node.next;
            }
        }
        
        ListNode ans = null;
        while (queue.size()>0){
            ListNode curr = new ListNode(queue.poll());
            curr.next = ans;
            ans = curr;
        }
        return ans;

    }

    public ListNode mergeKListsByQueue2(ListNode[] lists) {
        Queue<Integer> queue = new PriorityQueue<>((i1, i2) -> Integer.compare(i2, i1));

        // 合并链表元素到队列
        for(ListNode node:lists){
            while (node != null){
                queue.offer(node.val);
                node = node.next;
            }
        }
        // 把队列中元素添加到了新的链表
        ListNode ans = null;
        while (!queue.isEmpty()){
            ListNode curr = new ListNode(queue.poll()); // 每次拿出最大元素，并删除
            curr.next = ans;
            ans = curr;
        }
        return ans;

    }
    
}