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
    if(size==0){start=a; size=1; return true;}
    end.setNext(a);
    a.setPrev(end);
    end=a;
    return true;
  }

  public void add(int index, String value){
    if(index<0||index>size){throw new IllegalArgumentException("Invalid Index");}
    Node b = new Node(value);
    if(index==0){start.setPrev(b); b.setNext(start); start=b;}
    if(index!=0&&index<size){
      Node current=start;
      for(int i=0;current.getNext()!=null;i++){
        if(i==index){b.setPrev(current.getPrev()); b.setNext(current); current.setPrev(b);}
        current=current.next();
      }
    }
    if(index=size){end.setNext(b); b.setPrev(end); end=b;}
  }

  public String get(int index){
    if(index<0||index>size){throw new IllegalArgumentException("Invalid Index");}
    Node current1=start;
    for(int i=0;current.getNext()!=null;i++){
      if(i==index){return current1.getValue();}
      current=current.getNext();
    }
  }

  public String set(int index, String value){
    if(index<0||index>size){throw new IllegalArgumentException("Invalid Index");}
    Node current2=start;
    String temp;
    for(int i=0;current.getNext()!=null;i++){
      if(i==index){temp=current.getValue(); current.setValue(value); return temp;}
    }
  }

  
}
