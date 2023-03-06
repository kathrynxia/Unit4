public class DIYLinkedList {

  private Node head; //has-a relationship

  public DIYLinkedList() {} //AL arr = new AL<>();

  public DIYLinkedList(Node head) {
    //head is pointing to null

  }

  public void add(int value) { //adding node to end, append
    //link last node to new node

    //if list is empty
    if (head == null) {
      this.head = new Node(value, null);
    } else {
      (this.getNode(this.size() - 1)).next = new Node(value, null);
    }
  }

  public void add(int index, int value) { //adding it at a specific index
    if (index == 0) { //only if index is in range
      this.head = new Node(value, (this.getNode(index)));
    }
    else if (index <= this.size()){
      Node newNode = new Node (value, this.getNode(index));//inserting the element before the element that is currently at that index, so it will become the new element at that index
      //making it point to the next index
      this.getNode(index - 1).next = newNode;//setting the index before pointing to the new one
    }

  }

  public void remove(int index) { //adding it at a specific index
    if ((index < this.size()) && (index >= 0)) { //only if index is in range, can't remove something at an index out of bounds
      if (index != 0) {
        (this.getNode(index - 1)).next = this.getNode(index + 1);
      } else {
        this.head = head.next;
      }
    }
  }

  public int get(int index) {
    if (index > this.size()) {
      return -1;
    }

    int curInd = 0;//not a very  necessary variable, but like...

    Node curNode = this.head;

    while (curInd <= index) {
      if (curInd > 0) {
        curNode = curNode.next;
      }
      curInd++;
    }

    return curNode.data;
  }

  private Node getNode(int index) {//gets me the node at a current index. Love this helper method
    if (index > this.size()) {
      return null;
    }
    int curInd = 0;

    Node curNode = this.head;

    while (curInd <= index) {
      if (curInd > 0) {
        curNode = curNode.next;
      }
      curInd++;
    }

    return curNode;
  }

  public int indexOf(int value) {
    int curInd = 0;

    Node curNode = this.head;

    while (curNode != null) {
      if (curNode.data == value) {
        return curInd;
      }
      curInd ++;

      curNode = curNode.next;
    }

    return -1;
  }

  public String toString() {
    String toRet = "";
    Node current = head;

    while (current != null) {
      toRet += current.data + " ";

      current = current.next;
    }

    return toRet;
  }

  public int size() {
    Node current = this.head;

    int i = 0;

    while (current != null) {
      i++;
      current = current.next;
    }

    return i;
  }
}
