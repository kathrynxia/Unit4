public class BeforeAndAfterNode {

  public static void main(String[] args) {

  }

  public static void Question1() {

    //Before
    Node head = new Node(1, new Node(2));

    //After
    head.next.next = new Node(3);

  }

  public static void Question2() {

    //Before
    Node head = new Node(1, new Node(2));

    //After
    head = new Node(3, head);

  }

  public static void Question3() {

    //Before
    Node a = new Node(1, new Node(2, new Node(3)));
    Node b = a.next.next;

    //After
    a = a.next;

  }

  public static void Question4() {

    //Before
    Node a = new Node(1, new Node(2, new Node(3)));
    Node b = a.next.next;

    //After
    b = null;
    a.next.next.next = a;
    
    /*
    
   or b.next = a;
    b = null; would be easier, but I don't like dealing with a lot of variables
    
    */
  }

  public static void Question5() {

    //Before
    Node a = new Node(1, new Node(2, new Node(3)));


    //After (I think the b is pointless, would be more efficient without it. It overcomplicates it, which is the point)
    Node b = a.next.next;
    b.next = a;
    a = a.next;
    b.next.next = null;
    b = null;

  }

  public static void Question6() {

    //Before
    Node head = new Node(1, new Node(2, new Node(3)));

    //After
    Node head2 = head;

    head = head.next;

    head2.next = head2.next.next;

    head.next = null;
  }

  public static void Question7() {

    //before
    Node a = new Node(1, new Node(2, new Node(3, new Node(4))));

    //After
    Node b = a.next.next.next; //setting first node as last node of a
    a.next.next.next = null; //
    b.next = a.next.next;
    a.next.next = null;
    b.next.next = a.next;
    a.next = null;

    b.next.next.next = a;

    a = b;
    b = null;


  }
}
