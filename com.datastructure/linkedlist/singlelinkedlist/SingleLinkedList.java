package linkedlist.singlelinkedlist;

public class SingleLinkedList {

    private LinkedNode head;
    private int length;

    public class LinkedNode {
        private int data;
        private LinkedNode next;

        private LinkedNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public SingleLinkedList() {
        this.head = null;
        this.length = 0;
    }

    //----------------------------------------------Insert-------------------------------------------------------

    //To insert the node at the beginning
    public LinkedNode insertAtBeginning(LinkedNode head, int data) {
        LinkedNode newNode = new LinkedNode(data);
        //if the list is empty, the first node becomes head node
        if(head == null) {
            return newNode;
        }
        newNode.next = head;
        head = newNode;
        return head;
    }

    // To insert the node at the end
    public LinkedNode insertAtEnd(LinkedNode head, int data) {
        LinkedNode newNode = new LinkedNode(data);
        LinkedNode current = head;
        if(head == null) {
            return newNode;
        }
        while(null != current.next) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    // To insert the node after a particular node
    public void insertAfterNode(LinkedNode previous, int data) {
        if(previous == null) {
            return;
        }
        LinkedNode newNode = new LinkedNode(data);
        newNode.next = previous.next;
        previous.next = newNode;
    }

    public int length(LinkedNode head) {
        if(head == null) {
            return 0;
        }
        int count = 0;
        LinkedNode current = head;
        while(current != null) {
            count++;
            //moves to next node
            current = current.next;
        }
        return count;
    }

    // To insert the node at a Specific position
    public LinkedNode insertAtPosition(LinkedNode head, int data, int position) {
        int size = length(head);
        if(position > size + 1 || position < 1) {
            System.out.println("Invalid Position....");
            return head;
        }
        LinkedNode newNode = new LinkedNode(data);
        if(position == 1){
            newNode.next = head;
            return newNode;
        } else {
            LinkedNode previous = head;
            int count = 1;
            while(count < position - 1) {
                previous = previous.next;
                count++;
            }
            LinkedNode current = previous.next;
            newNode.next = current;
            previous.next = newNode;
            return head;
        }
    }

    //-----------------------------------Delete-------------------------------------------------------

    //To delete the first node of linked list
    public LinkedNode deleteFromFirst(LinkedNode head) {
        if(head == null) {
            return head;
        }
        LinkedNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public LinkedNode deleteFromLast(LinkedNode head) {
        LinkedNode last = head;
        LinkedNode previousToLast = null;
        while(last.next != null) {
            previousToLast = last;
            last = last.next;
        }
        previousToLast.next = null;
        return last;
    }

    public LinkedNode deleteFromPosition(LinkedNode head, int position) {
        LinkedNode previous = head;
        int count = 1;
        while(count < position - 1) {
            previous = previous.next;
            count++;
        }
        LinkedNode current = previous.next;
        previous.next = current.next;
        current.next = null;
        return current;
    }

    //-------------------------------------------------Display-----------------------------------------

    public int display(LinkedNode head) {
        LinkedNode current = head;
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

        SingleLinkedList node = new SingleLinkedList();

        //To insert the data at the beginning
        /*LinkedNode first = node.insertAtBeginning(null, 10);
        LinkedNode second = node.insertAtBeginning(first, 15);
        LinkedNode third = node.insertAtBeginning(second, 20);
        LinkedNode forth = node.insertAtBeginning(third, 25);*/

        //To display the data and length
        //int length = node.display(forth);


        //To insert the data at the end
        LinkedNode first = node.insertAtEnd(null, 10);
        LinkedNode second = node.insertAtEnd(first, 15);
        LinkedNode third = node.insertAtEnd(second, 20);
        LinkedNode forth = node.insertAtEnd(third, 25);

        //node.insertAfterNode(third, 50);
        //To display the data and length
        //int length = node.display(forth);

        //node.insertAtPosition(first, 70, 3);
        //To display the data and length
        //int length = node.display(forth);

        //LinkedNode deletedFirstNode = node.deleteFromFirst(first);
        //System.out.println("The Deleted Node is = "+ deletedFirstNode);

        //LinkedNode deletedLastNode = node.deleteFromLast(first);
        //System.out.println("The Deleted Node is = "+ deletedLastNode);

        LinkedNode deletedFromPosition = node.deleteFromPosition(first, 3);
        System.out.println("The Deleted Node is = "+ deletedFromPosition.data);

        //System.out.println("The length is = "+ length);
    }
}
