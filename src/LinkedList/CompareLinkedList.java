package LinkedList;

/**
 *
 * Compare two linked lists
 *
 * https://www.hackerrank.com/challenges/compare-two-linked-lists/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 *
 */
public class CompareLinkedList {

    class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;
     }

    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        while(head1 != null && head2 != null) {

            if(head1.data != head2.data){
                return false;
            }

            head1 = head1.next;
            head2 = head2.next;

            if((head1 == null && head2 != null) || (head2 == null && head1 != null)) {
                return false;
            }

        }

        return true;

    }

}
