public class linkedList{
    private Node head;
    private class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
            // System.out.print(head+"->");
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }
    public void remove(){
        Node pre = head.next;
        while (pre.next.next != null) {
            pre = pre.next;
        }

        pre.next = null;
    }

    public void printlist(){
       Node current = head;
       while(current != null){
        System.out.println(current.data);
        current =current.next;
       }
       System.out.println("null");
    }
    public static void main(String[] args) {
        linkedList link = new linkedList();
        link.add(0);
        link.add(3);
        link.add(4); 
        link.add(5);
        link.remove();
        link.add(9);
        link.printlist();
    }

}