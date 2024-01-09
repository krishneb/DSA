package linkedlist.singlelinkedlist;

public class MaxAndMin {
    private ListNode head;

    public static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public ListNode insertFront(ListNode head, int data) {
        ListNode temp = new ListNode(data);
        if(head == null) {
            return temp;
        }
        temp.next = head;
        head = temp;
        return head;
    }

    public int display(ListNode head) {
        ListNode current = head;
        int count = 0;
        System.out.print("Head -> ");
        while(current != null) {
            System.out.print(current.data);
            System.out.print(" -> ");
            current = current.next;
            count++;
        }
        System.out.print(" null ");
        System.out.println();
        return count;
    }

    public void maxAndMinValue(ListNode head){
        if(head == null)
            System.out.println("No Nodes Present");
        ListNode max = head;
        ListNode min = head;
        while(head != null) {
            if(max.data <= head.data){
                max = head;
            }
            if(min.data >= head.data){
                min = head;
            }
            head = head.next;
        }
        System.out.println("Maximum Value = "+ max.data);
        System.out.println("Minimum Value = "+ min.data);
    }

    public static void main(String[] args) {
        MaxAndMin list = new MaxAndMin();
        ListNode head = list.insertFront(null,1000);
        ListNode second = list.insertFront(head,2000);
        ListNode third = list.insertFront(second,100);
        ListNode forth = list.insertFront(third,50);
        ListNode fifth = list.insertFront(forth,40);

        list.display(fifth);
        list.maxAndMinValue(fifth);
    }
}
