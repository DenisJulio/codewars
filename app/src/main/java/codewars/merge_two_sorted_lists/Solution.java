package codewars.merge_two_sorted_lists;

public class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        var listHead = new ListNode();
        var current = listHead;
        var list1CN = list1;
        var list2CN = list2;
        while (list1CN != null && list2CN != null) {
            if (list1CN.val < list2CN.val) {
                current.next = list1CN;
                list1CN = list1CN.next;
            } else {
                current.next = list2CN;
                list2CN = list2CN.next;
            }
            current = current.next;
        }
        current.next = (list1CN == null) ? list2CN : list1CN;
        return listHead.next;
    }
}