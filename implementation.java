package linkedlist;

public class implementation {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;

        int size() {
            int count = 0;
            Node temp = head;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;

            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        void insertAtHead(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        void insertAt(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;
            if (idx == size()) {
                insertAtEnd(val);
                return;
            } else if (idx == 0) {
                insertAtHead(val);
                return;
            } else if (idx < 0 || idx > size()) {
                System.out.println("wrong index");
                return;
            }
            for (int i = 0; i <= idx - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }
        int getAt(int idx){
            Node temp = head;
           for(int i=1;i<=idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }
        void deleteAt(int idx){
            if (idx==0) {
                head=head.next;
                return;
            }
            Node temp= head;
            for(int i=1;i<idx;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            tail=temp;
        }
        int nend(int idx){
            Node temp=head;
          for(int i=0;i<=size()-idx+1;i++){
               temp=temp.next;
          }
                return temp.data;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4);
        // ll.display();
        ll.insertAtEnd(5);
        // ll.display();
        ll.insertAtEnd(12);
        // ll.display();
        ll.insertAtHead(3);
        //ll.display();
        ll.insertAt(4, 10);
        //ll.display();
        ll.deleteAt(2);
        ll.display();
        //System.out.println(ll.tail.data);
        // System.out.println(ll.getAt(2));
             System.out.println(ll.nend(2));
    }

}
