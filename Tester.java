public class Tester{
  public static void main(String[] args){
    MyLinkedList a = new MyLinkedList();
    System.out.println(a.add("first"));
    a.add("second");
    for(int i=0;i<20;i++){
      a.add(i+"");
    }
    a.add(13, "hello :3");
    System.out.println(a.toString());
    System.out.println(a.toStringReversed());
    System.out.println("done!");
  }
}
