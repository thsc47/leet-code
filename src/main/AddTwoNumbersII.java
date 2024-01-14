package main;

import java.math.BigInteger;

public class AddTwoNumbersII {
    class Solution {
        private int length(ListNode temp) {
            int size = 0;
            while (temp != null) {
                size++;
                temp = temp.next;
            }
            return size;
        }

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int size1 = length(l1);
            int size2 = length(l2);
            BigInteger first = BigInteger.ZERO;
            for (int i = size1 - 1; i >= 0; i--) {
                first = first.multiply(BigInteger.TEN).add(BigInteger.valueOf(l1.val));
                l1 = l1.next;
            }
            BigInteger second = BigInteger.ZERO;
            for (int i = size2 - 1; i >= 0; i--) {
                second = second.multiply(BigInteger.TEN).add(BigInteger.valueOf(l2.val));
                l2 = l2.next;
            }
            BigInteger sum = first.add(second);
            ListNode dummy = new ListNode(-1);
            ListNode current = dummy;
            String sumString = sum.toString();
            for (char ch : sumString.toCharArray()) {
                int digit = ch - '0';
                current.next = new ListNode(digit);
                current = current.next;
            }
            return dummy.next;
        }
    }
}
