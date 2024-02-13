public class MiddleLL {
   
        public ListNode middleNode(ListNode head) {
            ListNode temp = head;
            ListNode del = head;
            int count = 0;
            
            // Count the total number of nodes in the list
            while (temp != null) {
                temp = temp.next;
                count++;
            }
            
            // Move to the middle node
            for (int i = 0; i < count / 2; i++) {
                del = del.next;
            }
            
            return del;
        }
}

