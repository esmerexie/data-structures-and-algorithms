package stacks.and.queue;

public class Node {
  public int data;
  public Node next;

  public int getData() {
    return this.data;
  }

  public Node getNext() {
    return next;
  }

  public Node(int data, Node next){
    this.data = data;
    this.next = next;
  }
}
