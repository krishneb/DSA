package linkedlist.circularlinkedlist;

import java.util.NoSuchElementException;

public class CircularLinkedList {

    private ListNode last;
    private int length;

    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public CircularLinkedList() {
        this.last = null;
        this.length = 0;
    }

    //-----------------------------------------------Insert----------------------------------------------

    //To insert the data at first of the List
    public void insertFirst(int data) {
        ListNode temp = new ListNode(data);
        if(last == null) {
            last = temp;
        } else {
            //last node points to the first node, so new node should come before the previously pointed last node
            temp.next = last.next;
        }
        last.next = temp;
        length++;
    }

    //To insert the data at last of the List
    public void insertLast(int data) {
        ListNode temp = new ListNode(data);
        if(last == null) {
            last = temp;
            last.next = last;
        } else {
            temp.next = last.next;
            last.next = temp;
            last = temp;
        }
        length++;
    }

    //-----------------------------------------------Delete------------------------------------------

    //To delete the first node from Linked List
    public ListNode removeFirst() {
        if(isEmpty()) {
            throw new NoSuchElementException("Circular Singly Linked List is already empty");
        }

        ListNode temp = last.next;
        if(last.next == last) {
            last = null;
        } else {
            //Last node is pointing now to the second node(which will become first node)
            last.next = temp.next;
        }
        temp.next = null;
        length--;
        return temp;
    }

    //--------------------------------------------Display----------------------------------------

    public void display() {
        if(last == null) {
            return;
        }
        System.out.print("Start -> ");
        ListNode first = last.next;
        while(first != last) {
            System.out.print(first.data + " -> ");
            first = first.next;
        }
        System.out.println(first.data + " -> null");
    }

    public int length() {
        return length;
    }

    public Boolean isEmpty() {
        return length == 0;
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        /*cll.insertFirst(5);
        cll.insertFirst(10);
        cll.insertFirst(15);
        cll.insertFirst(20);
        cll.display();*/

        cll.insertLast(5);
        cll.insertLast(10);
        cll.insertLast(15);
        cll.insertLast(20);
        cll.display();

        cll.removeFirst();
        cll.display();
    }
}
