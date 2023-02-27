public class NodeCreator{



    public static void main (String[] args){

        // Node n1 = new Node(4);

        // Node n2 = new Node(8);

        Node head =  new Node(8, new Node (9, new Node (11)));
        //Node head = new Node();
        //Node head = null;


        //Node head2;



        System.out.println(head.toString(head));
         System.out.println(head.toStringRecursive(head));


    }
}