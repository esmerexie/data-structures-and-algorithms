package stacks.and.queue;

import org.w3c.dom.Node;

public class Stack <E> {

  public Node top;
  private int size;

  public Stack(){
    this.top = null;
    this.size = 0;
  }

  public void push(int data){
    Node node = new Node(data);
    node.next = top;
    top = node;
  }

  public int pop() {
    int data = top.data;
    top = top.next;
    return data;
  }

  public int peek(){
    return top.data;
  }

  public boolean isEmpty(){
    return top == null;
  }

  public Node getTop(){

  }

  public int getSize(){

  }
}
