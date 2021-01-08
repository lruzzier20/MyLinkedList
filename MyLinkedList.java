public class MyLinkedList{
  private int size;
  private Node start,end;

  public MyLinkedList(){
    super();
  }

  public int size(){
    return size;
  }

  public boolean add(String value){
    Node a = new Node(value)
    if(size==0){start=a; size=1; return true;}
    end.setNext(a);
    a.setPrev(end);
    end=a;
    return true;
  }
}
