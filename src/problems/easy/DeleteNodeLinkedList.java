package problems.easy;
import problems.utils.ListNode;

/*
    14.08.2021 - Nodirbek Ergashev
    https://leetcode.com/problems/delete-node-in-a-linked-list/
*/

class Solution {
    public void deleteNode(ListNode node) {
        if (node.val == null) {
            return;
        }
        node.val = node.next.val;
        node.next = node.next.next;
    }
}