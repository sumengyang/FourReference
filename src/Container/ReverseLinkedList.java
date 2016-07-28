package Container;

public class ReverseLinkedList {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(0);
		ListNode l2 = new ListNode(0);
		ListNode l3 = new ListNode(9);
		l1.next = l2;
		l2.next = l3;

		ReverseLinkedList rl = new ReverseLinkedList();
		ListNode ln = rl.reverseList(l1);

		System.out.println(ln.value);
		System.out.println(ln.next.value);
		System.out.println(ln.next.next.value);
	}

	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode dump = new ListNode(0);
		dump.next = head;

		ListNode pre = dump.next;
		while (pre.next != null) {
			ListNode cur = pre.next;
			pre.next = cur.next;
			cur.next = dump.next;
			dump.next = cur;
		}
		return dump.next;
	}

	static class ListNode {
		int value;
		ListNode next;

		public ListNode(int value) {
			this.value = value;
		}
	}
}
