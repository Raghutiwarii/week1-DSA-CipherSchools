class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((o1, o2) -> o1.val - o2.val);
        for (ListNode list: lists) {
            if (list == null) {
                continue;
            }
            pq.add(list);
        }

        ListNode ans = new ListNode(0);
        ListNode dummy = ans;
        while (! pq.isEmpty()) {
            ListNode curr = pq.poll();
            dummy.next = curr;
            if (curr.next != null) {
                pq.add(curr.next);
            }
            dummy = dummy.next;
        }
        return ans.next;
    }
}
