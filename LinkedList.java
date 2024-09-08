public class LinkedList{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;


    // Add First in LL
    public void addFirst(int data){
        // step 1 -> create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        // step 2 -> newNode next = head
        newNode.next = head; //link

        // step 3 -> head = newNode
        head = newNode;
    }


    // Add Last in LL
    public void addLast(int data){  
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }


    // Print LL
    public void print(){ //O(n)
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    // Adding node(at index) in LL
    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        // i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }


    // Remove First from LL
    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }


    // Remove Last from LL
    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev : i = size-2
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }

        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }


    // Iterative(linear) Search in LL
    public int itrSearch(int key){ //O(n)
        Node temp = head;
        int i = 0;

        while(temp != null){
            if(temp.data == key){ // key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        //key not found
        return -1;
    }


    // Search Recursively in LL
    public int helper(Node head, int key){ // TC & SC -> O(n)
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }

        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }


    // Reverse a LL
    public void reverse(){ // O(n)
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
    }


    // M A I N
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        
        ll.add(2, 3);
        ll.print();
        ll.reverse();
        ll.print();
    }
}