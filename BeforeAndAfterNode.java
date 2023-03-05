public class BeforeAndAfterNode {

  public static void main(String[] args) {
    Question1();
    Question2();
    Question3();
    //Question4(); //infinite
    Question5();
    Question6();
    Question7();
  }

  public static void Question1() {
    System.out.println("1: \n");

    //Before
    Node head = new Node(1, new Node(2));
    System.out.println("head: " + head.toString(head));

    //After
    head.next.next = new Node(3);

    System.out.println("head: " + head.toString(head));
  }

  public static void Question2() {
    System.out.println("2: \n");

    //Before
    Node head = new Node(1, new Node(2));
    System.out.println("head: " + head.toString(head));

    //After
    head = new Node(3, head);

    System.out.println("head: " + head.toString(head));
  }

  public static void Question3() {
    System.out.println("3: \n");

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
    System.out.println("4: \n");

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

  public static void Question5() { //*** */
    System.out.println("5: \n");

    //Before
    Node a = new Node(1, new Node(2, new Node(3)));
    System.out.println("a: " + a.toString(a));

    //After (I think the b is pointless, would be more efficient without it. It overcomplicates it, which is the point)
    Node b = a.next.next;
    b.next = a;
    a = a.next;
    b.next.next = null;
    b = null;

    System.out.println("a: " + a.toString(a));
  }

  public static void Question6() {
    System.out.println("6: \n");

    //Before
    Node head = new Node(1, new Node(2, new Node(3)));

    Node head2 = head;

    head = head.next;

    head2.next = head2.next.next;

    head.next = null;

    System.out.println("head: " + head.toString(head));
    System.out.println("head2: " + (head2.toString(head2)));
  }

  public static void Question7() {
    System.out.println("7: \n");

    //before
    Node a = new Node(1, new Node(2, new Node(3, new Node(4))));
    System.out.println(a.toString(a));

    Node b = a.next.next.next; //setting first node as last node of a
    a.next.next.next = null; //
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
