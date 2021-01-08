public class Tester{
  public static void main(String[] args){
    MyLinkedList a = new MyLinkedList();
    System.out.println(a.add("first"));
    a.add("second");
    for(int i=0;i<20;i++){
      a.add(i+"");
    }
    a.add(13, "hello :3");
    System.out.println(a.size());
    System.out.println(a.get(21));
    a.add(0,"imfirstnow ;))");
    a.add(0, "huh??");
    System.out.println(a.toString());
    System.out.println(a.toStringReversed());
    System.out.println("done!");
  }
}
