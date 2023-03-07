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
      this.head = new Node(value, head);
    } else if (index <= this.size()) {
      this.getNode(index - 1).next = new Node(value, this.getNode(index)); //making a new node that points to the node currently at the index, and pointing the node and index-1 the new node, squishing it in between
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
    return getNode(index).data;
  }

  private Node getNode(int index) { //gets me the node at a current index. Love this helper method
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
      curInd++;

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
