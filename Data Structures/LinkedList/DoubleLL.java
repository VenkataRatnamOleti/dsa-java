public class DoubleLL{
    public class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
            size++;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node temp = new Node(data);
        if(head == null){
            head = tail = temp;
            return;
        }
        head.prev = temp;
        temp.next = head;
        head = temp;
    }

    public void addLast(int data){
        Node temp = new Node(data);
        if(head == null){
            head = tail = temp;
            return;
        }

        tail.next = temp;
        temp.prev = tail;
        tail = temp;
    }

    public int removeFirst(){
        if(head == null){
            System.out.println("Doubly LinkedList is already Empty!");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }else{
            int val = head.data;
            head = head.next;
            head.prev = null;
            size--;
            return val;
        }
    }

    public int removeLast(){
        if(head == null){
            System.out.println("Doubly LinkedList is already Empty!");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }else{
            int val = tail.data;
            tail = tail.prev;
            tail.next = null;
            size--;
            return val;
        }
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;  // Additional Step
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        DoubleLL ddl = new DoubleLL();
        ddl.addFirst(5);
        ddl.addFirst(4);
        ddl.addFirst(3);
        ddl.addFirst(2);
        ddl.addFirst(1);
        ddl.print();
        ddl.reverse();
        ddl.print();
    }
}