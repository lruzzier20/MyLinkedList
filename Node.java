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
}
