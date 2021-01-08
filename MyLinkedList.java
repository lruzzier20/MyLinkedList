import java.util.*;
import java.lang.*;
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
    Node a = new Node(value);
    if(size==0){start=a; end=a; size=1; return true;}
    end.setNext(a);
    a.setPrev(end);
    end=a;
    size++;
    return true;
  }

  public void add(int index, String value){
    if(index<0||index>size){throw new IllegalArgumentException("Invalid Index");}
    Node b = new Node(value);
    if(index==0){start.setPrev(b); b.setNext(start); start=b;}
    if(index!=0&&index<size){
      Node current=start;
      for(int i=0;current.getNext()!=null;i++){
        if(i==index){current.getPrev().setNext(b); b.setPrev(current.getPrev()); b.setNext(current); current.setPrev(b);}
        current=current.getNext();
      }
    }
    if(index==size){end.setNext(b); b.setPrev(end); end=b;}
  }

  public String get(int index){
    if(index<0||index>=size){throw new IllegalArgumentException("Invalid Index");}
    Node current1=start;
    for(int i=0;current1.getNext()!=null;i++){
      if(i==index){return current1.getData();}
      current1=current1.getNext();
    }
    return "Whoops!";
  }

  public String set(int index, String value){
    if(index<0||index>size){throw new IllegalArgumentException("Invalid Index");}
    Node current2=start;
    String temp;
    for(int i=0;current2.getNext()!=null;i++){
      if(i==index){temp=current2.getData(); current2.setData(value); return temp;}
    }
    return "Whoops!";
  }

  public String toString(){
    Node current3=start;
    String output="";
    for(int i=0;i<size;i++){
      if(i!=size-1){output+=current3.getData()+", ";}else{output+=current3.getData();}
      current3=current3.getNext();
    }
    return "{" + output + "}";
  }

  public String toStringReversed(){
    Node current4=end;
    String answer="";
    for(int i=size-1;i>=0;i--){
      if(i!=0){answer+=current4.getData()+", ";}else{answer+=current4.getData();}
      current4=current4.getPrev();
    }
    return "{" + answer + "}";
  }

}
