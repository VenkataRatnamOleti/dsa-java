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

    public int itrSearch(int key){
        Node temp = head;
        int idx = 0;
        while(temp != null){
            if(temp.data == key) return idx;
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    public int helperSearch(Node temp, int key){
        if(temp == null) return -1;
        if(temp.data == key) return 0;
        int idx = helperSearch(temp.next, key);
        if(idx == -1) return -1;
        return idx+1;
    }

    public int rcrSearch(int key){
        return helperSearch(head, key);
    }

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return;
    }

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean isPalindrome(){
        if(head == null || head.next == null){
            return true;
        }

        Node mid = findMid(head);

        Node prev = null;
        Node curr = mid;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;
        while(right != null){
            if(right.data != left.data) return false;
            right = right.next;
            left = left.next;
        }
        return true;
    }

    public void replaceNthNodefromEnd(int n){
        int size = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        if(n == size){
            head = head.next;
            return;
        }

        int i = 1;
        int iFind = size - n;
        temp = head;
        while(i < iFind){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return;
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
        System.out.println(ll.itrSearch(7));
        System.out.println(ll.itrSearch(10));
        System.out.println(ll.rcrSearch(5));
        System.out.println(ll.rcrSearch(11));
        ll.print();
        ll.reverse();
        ll.print();
        ll.replaceNthNodefromEnd(1);
        ll.replaceNthNodefromEnd(1);
        ll.replaceNthNodefromEnd(1);
        ll.replaceNthNodefromEnd(1);
        ll.replaceNthNodefromEnd(1);
        ll.replaceNthNodefromEnd(1);
        ll.print();
        ll.addFirst(8);
        ll.addFirst(1);
        ll.print();
        System.out.println(ll.isPalindrome());
    }
}