public class BeforeAndAfterNode {

  public static void main(String[] args) {
    // Question1();
    // Question2();
    Question5();
  }

  public static void Question1() {

    //Before
    Node head = new Node(1, new Node(2));
    System.out.println(head.toString(head));


    //After
    head.next.next = new Node(3);


    System.out.println(head.toString(head));
  }



  public static void Question2() {

    //Before
    Node head = new Node(1, new Node(2));
    System.out.println(head.toString(head));

    //After
    head = new Node(3, head);

    System.out.println(head.toString(head));
  }



  public static void Question3() {

    //Before
    Node a = new Node(1, new Node(2, new Node(3)));
    Node b = a.next.next;

    System.out.println("a: " + a.toString(a));
    System.out.println("b: " + b.toString(b));

    //After
    a = a.next;



    System.out.println("a: " + a.toString(a));
    System.out.println("b: " + b.toString(b));
  }



  public static void Question4() {

    //Before
    Node a = new Node(1, new Node(2, new Node(3)));
    Node b = a.next.next;

    System.out.println("a: " + a.toString(a));
    System.out.println("b: " + b.toString(b));

    //After
    b = null;
    a.next.next.next = a;

    System.out.println("a: " + a.toString(a)); //infinite lol
    System.out.println("b: " + b.toString(b));
  }

  public static void Question5(){ //*** */

  //Before

  Node a = new Node(1, new Node(2, new Node(3)));

  //After

  Node b = a.next.next;

  b.next = a;

  b = null;


  }


  public static void Question6(){


  //Before
  Node head = new Node (1, new Node(2, new Node(3)));

  Node head2 = head;

  head = head.next;

  head2.next = head2.next.next;

  head.next = null;

  System.out.println("head: " + head.toString(head));
  System.out.println("head2: " + (head2.toString(head2)));

  }

  public static void Question7(){

  //before
  Node a = new Node(1, new Node(2, new Node(3, new Node(4))));

  Node b = a.next.next.next;//setting first node as last node of a
  a.next.next.next = null;//
  b.next = a.next.next;
  a.next.next = null;
  b.next.next = a.next;
  a.next = null;

  b.next.next.next = a;

  a = b;
  b = null;

  System.out.println(a.toString(a));

  // a.next = a;
  // a = a.


  }



}
