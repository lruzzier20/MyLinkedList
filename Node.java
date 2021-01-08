public class Node{
  private String data;
  private Node next,prev;

  public Node(String value){
    data=value;
  }

  public String getData(){
    return data;
  }

  public String setData(String value){
    String temp = data;
    data=value;
    return temp;
  }

  public Node getNext(){
    return next;
  }

  public Node setNext(Node n){
    Node temp = next;
    next=n;
    return temp;
  }

  public Node getPrev(){
    return prev;
  }

  public Node setPrev(Node n){
    Node temp = prev;
    prev=n;
    return temp;
  }
}
