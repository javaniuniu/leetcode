import Util.ListNode;

/**
 * 2. 两数相加
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode curr = head;

        // 很妙的两个地方 carry 的设置 和 carry >0 的判断 🌟🌟🌟🌟🌟
        // 记录和大于10时 +1
        // carry >0 当大于10 则向前进 1
        int carry = 0;
        while (carry > 0 || l1 != null || l2 != null) {
            int sum = carry;
            sum += (l1 != null) ? l1.val : 0;
            sum += (l2 != null) ? l2.val : 0;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        return head.next;
    }

}