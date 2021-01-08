public class Tester{
  public static void main(String[] args){
    MyLinkedList a = new MyLinkedList();
    System.out.println(a.add("first"));
    a.add("second");
    System.out.println(a.toString());
    System.out.println("done!");
  }
}
