package LinkedList;

/**
 *
 * Find Merge Point of Two Lists
 *
 * https://www.hackerrank.com/challenges/find-the-merge-point-of-two-joined-linked-lists/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=linked-lists&isFullScreen=true
 *
 * [Solution] https://www.youtube.com/results?search_query=Find+Merge+Point+of+Two+Lists
 *
 *
 */
public class MergePoint {

    class SinglyLinkedListNode {
          int data;
          SinglyLinkedListNode next;
    }

    /*
    Get Node length
     */
    static int length(SinglyLinkedListNode head) {

        int length = 0;

        while(head != null) {
            head = head.next;
            length++;
        }

        return length;

    }

    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        int length1 = length(head1);
        int length2 = length(head2);

        int diff = length1 - length2;

        if(diff < 0) {
            SinglyLinkedListNode temp = head2;
            head2 = head1;
            head1 = temp;

            diff = length2 - length1;
        }

        for(int i = 0 ; i < diff ; i++) {
            head1 = head1.next;
        }

        while(head1 != null && head2 != null) {

            if(head1 == head2) {
                return head1.data;
            }

            head1 = head1.next;
            head2 = head2.next;

        }


        // HashSet set = new HashSet();

        // // 둘다 null 일때 조건문 탈출
        // while(!(head1 == null && head2 == null)) {

        //     if(head1.next != null) {
        //         set.add(head1.next.data);
        //     }

        //     if(head2.next != null && set.contains(head2.next.data)) {
        //         return head2.next.data;
        //     }

        //     if(head1 == null) {
        //         head1 = head1.next;
        //     }

        //     if(head2 == null) {
        //         head2 = head2.next;
        //     }
        // }

        return 0;

    }

}
