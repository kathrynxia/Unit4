public class Node{

    //both these variables should be private, but public for convenience
    public int data = 0;
    public Node next;//reference variable that points to next node in list

    public Node(){


    }

     public Node(int data){//used for last item in list Or only item in list
     //next is automatically null, means we are at end of list

        this.data = data;
        
    }

     public Node(int data, Node next){

        this.data = data;
        this.next = next;

        
    }


    public String toStringRecursive(Node start){
        String toRet = "";

        if (start == null)
            return "";
        

        else if (start.next == null)
            toRet += start.data;


       else if (start.next != null)
            toRet +=  start.data + " " + toString(start.next);
        
return toRet;



}

 public String toString(Node start){
        String toRet = "";
        Node current = start;

        while (current != null){

            toRet += current.data + " ";

            current = current.next;

        }

        return toRet;
        

}
}