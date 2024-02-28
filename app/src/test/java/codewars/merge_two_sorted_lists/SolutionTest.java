package codewars.merge_two_sorted_lists;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private Solution solution = new Solution();

    @Test
    void test() {

    }

    @Test
    public void testMergeTwoSortedLists() {
        ListNode list1 = createList(1, 2, 4);
        ListNode list2 = createList(1, 3, 4);
        ListNode expected = createList(1, 1, 2, 3, 4, 4);

        ListNode actual = solution.mergeTwoLists(list1, list2);

        // Assert that the actual and expected lists contain the same elements in the
        // same order
        assertListEquals(expected, actual);
    }

    @Test
    public void testMergeEmptyLists() {
        ListNode list1 = null;
        ListNode list2 = null;
        ListNode expected = null;

        ListNode actual = solution.mergeTwoLists(list1, list2);

        assertEquals(expected, actual);
    }

    @Test
    public void testMergeOneEmptyList() {
        ListNode list1 = null;
        ListNode list2 = createList(0);
        ListNode expected = createList(0);

        ListNode actual = solution.mergeTwoLists(list1, list2);

        assertListEquals(expected, actual);
    }

    // Helper method to create a linked list with the given values
    private ListNode createList(int... values) {
        ListNode head = null;
        ListNode current = null;
        for (int value : values) {
            ListNode node = new ListNode(value);
            if (head == null) {
                head = node;
            } else {
                current.next = node;
            }
            current = node;
        }
        return head;
    }

    // Helper method to assert that two lists have the same elements in the same
    private void assertListEquals(ListNode expected, ListNode actual) {
        while (expected != null && actual != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
        assertNull(expected);
        assertNull(actual);
    }
}
