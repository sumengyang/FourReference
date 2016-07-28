package Container;

public class ReverseLinkedList2 {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(5);
		ListNode l3 = new ListNode(9);
		l1.next = l2;
		l2.next = l3;

		ReverseLinkedList2 rl = new ReverseLinkedList2();
		ListNode ln = rl.reverseList(l1);

		System.out.println(ln.value);
		System.out.println(ln.next.value);
		System.out.println(ln.next.next.value);
	}

	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode cur = head.next;
		ListNode rev = reverseList(cur);
		
		head.next = null;
		cur.next = head;
		return rev;
	}

	static class ListNode {
		int value;
		ListNode next;

		public ListNode(int value) {
			this.value = value;
		}
	}
}
