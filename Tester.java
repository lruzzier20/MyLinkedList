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
    System.out.println("--------------");
    MyLinkedList b = new MyLinkedList();
    b.add("0");
    b.add("1");
    b.add("2");
    System.out.println(b.size()+"");
    System.out.println(b.toString());
    b.add(0, "-1");
    System.out.println(b.toString());
    b.add(1, "-.5");
    System.out.println(b.toString());
    b.add(3, "0.5");
    System.out.println(b.toString());
    b.add(5, "1.5");
    System.out.println(b.toString());
    System.out.println(b.size()+"");
    b.add(7, "2.5");
    System.out.println(b.toString());
    System.out.println(b.remove(7));
    System.out.println(b.toString());
    System.out.println(b.remove(5));
    System.out.println(b.toString());
    System.out.println(b.remove(0));
    System.out.println(b.toString());
  }
}
