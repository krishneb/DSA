package stack;

import java.util.EmptyStackException;

public class StackLinkedList {
    private ListNode top;
    private int length;

    private class ListNode {
        private int data; // Can be a generic type
        private ListNode next; // Reference to next ListNode in list

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public StackLinkedList() {
        top = null;
        length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void push(int data) {
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }

    public int pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }

    public int peek() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    public void displayElements() {
        ListNode temp = top;
        System.out.print("Top -> ");
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(" null");
    }

    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();
        stack.push(10);
        stack.push(15);
        stack.push(20);

        stack.displayElements();
        System.out.println(stack.peek());
        stack.pop();
        stack.displayElements();
        //System.out.println(stack.peek());
    }
}
