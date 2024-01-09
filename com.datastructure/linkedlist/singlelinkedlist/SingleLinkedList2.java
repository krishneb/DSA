package linkedlist.singlelinkedlist;

public class SingleLinkedList2 {
    private ListNode head;

    public class ListNode {
        private int data;
        private ListNode next;

        private ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public SingleLinkedList2() {
        this.head = head;
    }

    //To search an element in a linked list
    public Boolean searchElements(ListNode head, int key) {
        ListNode current = head;
        //It iterates till the Second last node
        while(current.next != null) {
            if(current.data == key) {
                return true;
            }
            current = current.next;
        }
        //Only for the last node
        if(current.data == key) {
            return true;
        }
        return false;
    }

    //To reverse a linked List
    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while(current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    //To find the middle element of a linkedList
    public ListNode middleElement(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while(fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    //To remove the duplicate from the sorted list
    public void removeDuplicate(ListNode head) {
        ListNode current = head;
        while(current != null && current.next != null) {
            if(current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    //To insert a node in a sorted linked List
    public ListNode insertInSortedList(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        if(head == null) {
            return newNode;
        }

        ListNode current = head;
        ListNode temp = null;

        while(current != null && current.data < newNode.data) {
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
        return head;
    }

    //To detect if any loop is present in linkedList
    public Boolean detectLoop(ListNode head) {
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while(fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(slowPtr == fastPtr) {
                return true;
            }
        }
        return false;
    }

    //To insert the node at the beginning
    public ListNode insertAtBeginning(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        //if the list is empty, the first node becomes head node
        if(head == null) {
            return newNode;
        }
        newNode.next = head;
        head = newNode;
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

    public static void main(String[] args) {

        SingleLinkedList2 node = new SingleLinkedList2();

        //To insert the data at the end
        ListNode first = node.insertAtBeginning(null, 10);
        ListNode second = node.insertAtBeginning(first, 15);
        ListNode third = node.insertAtBeginning(second, 20);
        ListNode forth = node.insertAtBeginning(third, 25);


        /*Boolean response = node.searchElements(first, 25);
        if(response == true) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }*/


        /*System.out.println("Before Reversing....");
        node.display(first);

        System.out.println("After Reversing....");
        ListNode newHead = node.reverseList(first);
        node.display(newHead);*/

        /*System.out.println("Even number of Elements....");
        ListNode middle = node.middleElement(first);
        System.out.println("Midddle Element is = "+ middle.data);

        System.out.println("Odd number of Elements....");
        ListNode fifth = node.insertAtBeginning(forth, 30);
        ListNode middle2 = node.middleElement(first);
        System.out.println("Midddle Element is = "+ middle2.data);*/

        /*ListNode first = node.insertAtBeginning(null, 1);
        ListNode second = node.insertAtBeginning(first, 1);
        ListNode third = node.insertAtBeginning(second, 1);
        ListNode forth = node.insertAtBeginning(third, 2);
        ListNode fifth = node.insertAtBeginning(forth, 2);
        ListNode sixth = node.insertAtBeginning(fifth, 3);
        ListNode seventh = node.insertAtBeginning(sixth, 3);

        node.removeDuplicate(first);
        node.display(first);*/

        node.insertInSortedList(first, 17);
        node.display(first);

        node.insertInSortedList(first, 21);
        node.display(first);

        Boolean response2 = node.detectLoop(first);
        if(response2)
            System.out.println("Loop Detected....");
        else
            System.out.println("Loop Not Found....");
    }
}
