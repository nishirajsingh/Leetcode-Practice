class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class MyLinkedList {
    Node head;

    public MyLinkedList() {
        head = null;
    }

    public int get(int index) {
        if (index < 0)
            return -1;

        Node temp = head;
        int i = 0;

        while (temp != null && i < index) {
            temp = temp.next;
            i++;
        }

        return (temp == null) ? -1 : temp.val;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        if (head == null)
            head = newNode;
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (head == null)
            head = newNode;
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void addAtIndex(int index, int val) {
        if (index < 0)
            return;

        if (index == 0) {
            addAtHead(val);
            return;
        }
        Node temp = head;
        int i = 0;
        while (temp != null && i < index - 1) {
            temp = temp.next;
            i++;
        }
        if (temp == null)
            return;
        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || head == null)
            return;
        if (index == 0) {
            head = head.next;
            return;
        }
        Node temp = head;
        int i = 0;
        while (temp.next != null && i < index - 1) {
            temp = temp.next;
            i++;
        }
        if (temp == null || temp.next == null)
            return;
        temp.next = temp.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */