public class ll {
     Node head;
    private Node tail;
    private int size;

    public ll() {
        this.size=0;
    }

    private class Node{
        private int value;
       private  Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    public void insert(int val){

        Node node =new Node(val);
        node.next=head;
        node=head;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }
      public void display() {
        Node temp=head;
        while (temp != null){
            System.out.print(temp.value +" -> ");
            temp=temp.next;

        }
        System.out.println("End");
    }

    public static void main(String[] args) {

        ll list=new ll();
        list.insert(87);
        list.insert(87);
        list.display();
    }
    }




