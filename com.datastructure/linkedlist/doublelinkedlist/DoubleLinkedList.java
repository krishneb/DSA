package linkedlist.doublelinkedlist;

import java.util.NoSuchElementException;

public class DoubleLinkedList {

    private LinkNode head;
    private LinkNode tail;
    private int length;

    private class LinkNode {
        private int data;
        private LinkNode previous;
        private LinkNode next;

        public LinkNode(int data) {
            this.data = data;
        }
    }

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    //---------------------------------------------------Insert---------------------------------------------

    //To insert the node at first
    public void insertFirst(int data) {
        LinkNode newNode = new LinkNode(data);
        if(isEmpty()) {
            tail = newNode;
        } else {
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    //To insert the node at End
    public void insertEnd(int value) {
        LinkNode newNode = new LinkNode(value);
        if(isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        length++;
    }

    //-------------------------------------------------------Delete---------------------------------------------

    //To delete the first element in a linked list
    public LinkNode deleteFirst() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }

        LinkNode temp = head;
        if(head == tail) {
            tail = null;
        } else {
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        length--;
        return temp;
    }

    //To delete the last element in a linked list
    public LinkNode deleteLast() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }

        LinkNode temp = tail;
        if(head == tail) {
            head = null;
        } else {
            tail.previous.next = null;
        }
        tail = tail.previous;
        temp.previous = null;
        length--;
        return temp;
    }

    //--------------------------------------------------Display--------------------------------------

    //To traverse the list from Front
    public void displayForward() {
        if(head == null)
            return;
        LinkNode temp = head;

        System.out.print("Head -> ");
        while(temp != null) {
            System.out.print(temp.data+ " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //To traverse the list from Back
    public void displayBackward() {
        if(head == null) {
            return;
        }

        LinkNode temp = tail;
        System.out.print("Tail -> ");
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.previous;
        }
        System.out.println("null");
    }

    public boolean isEmpty() {
        return length == 0; // or head == null
    }

    public int length() {
        return length;
    }

    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.insertFirst(1);
        dll.insertFirst(3);
        dll.insertFirst(5);
        dll.insertFirst(7);

        /*dll.insertEnd(1);
        dll.insertEnd(3);
        dll.insertEnd(5);
        dll.insertEnd(7);*/

        dll.displayForward();
        //dll.displayBackward();

        /*dll.deleteFirst();
        dll.deleteFirst();
        dll.deleteFirst();
        dll.deleteFirst();
        //All elelments are already deleted, so it will throw Exception.
        dll.deleteFirst();*/

        dll.deleteLast();
        dll.displayForward();
    }
}
