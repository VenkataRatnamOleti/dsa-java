public class Q2{


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

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
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

    public static void deleteMAfterN(Q2 list, int m, int n){
        Node temp = head;
        int i = 1;
        while(temp != null){
            while(i < m && temp != null){
                temp = temp.next;
                i++;
            }
            i = 0;
            while(i<n && temp != null && temp.next != null){
                temp.next = temp.next.next;
                i++;
            }
            i=0;
        }
    }

    public static void swappNodes(int a, int b){
        Node prevA = null;
        Node prevB = null;
        Node tempA = head;
        Node tempB = head;

        while(tempA != null && tempA.data != a){
            prevA = tempA;
            tempA = tempA.next;
        }

        while(tempB != null && tempB.data != b){
            prevB = tempB;
            tempB = tempB.next;
        }

        if(tempA == null || tempB == null) return;

        prevA.next = prevB.next;
        prevB.next = tempA;
        Node temp = tempA.next;
        tempA.next = tempB.next;
        tempB.next = temp;
    }


    public static void main(String[] args) {
        Q2 list = new Q2();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.addLast(8);
        list.addLast(9);
        list.addLast(10);
        list.print();
        // deleteMAfterN(list, 2, 2);
        // deleteMAfterN(list, 3, 2);
        swappNodes(4, 8);
        list.print();
    }
}