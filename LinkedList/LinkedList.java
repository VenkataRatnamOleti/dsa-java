public class LinkedList{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
            count++;
        }
    }

    public static Node head;
    public static Node tail;
    public static int count;

    public void addFirst(int data){
        // Node newNode = new Node(data);
        // newNode.next = head;
        // head = newNode;
        // if(tail == null){
        //     tail = newNode;
        // }

        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node temp = head;
        int i=0; 
        while(i<idx-1 ){
            temp = temp.next;
            i++;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if(count == 0){
            System.out.println("LinkedList is already Empty");
            return Integer.MIN_VALUE;
        }else if(count == 1){
            int val = head.data;
            head = tail = null;
            count--;
            return val;
        }else{
            int val = head.data;
            head = head.next;
            count--;
            return val;
        }
    }

    public int removeLast(){
        if(count == 0){
            System.out.println("LinkedList is already Empty");
            return Integer.MIN_VALUE;
        }else if(count == 1){
            int val = head.data;
            head = tail = null;
            count--;
            return val;
        }else{
            Node temp = head;
            while(temp.next != tail){
                temp = temp.next;
            }
            int val = temp.next.data;
            tail = temp;
            tail.next = null;
            count--;
            return val;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);
        ll.addLast(9);
        ll.print();
        System.out.println(ll.count);
        ll.print();
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
    }
}