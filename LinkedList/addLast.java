import java.io.*;
import java.util.*;

public class Main {
  public static class Node {
    int data;
    Node next;
  }

  public static class LinkedList {
    Node head;
    Node tail;
    int size;

    void addLast(int val) {
      // Write your code here

      //create a new node and set its value
      Node nn = new Node ();
      nn.data= val;
      //check for head and tail point to null
      if(size == 0){
        head =tail=nn;
      }else{
        tail.next = nn;
        tail= nn;
      }
      size++;
          
    }
  }

  public static void testList(LinkedList list) {
    for (Node temp = list.head; temp != null; temp = temp.next) {
      System.out.println(temp.data);
    }
    System.out.println(list.size);

    if (list.size > 0) {
      System.out.println(list.tail.data);
    } 
  }
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    LinkedList list = new LinkedList();

    String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("addLast")){
        int val = Integer.parseInt(str.split(" ")[1]);
        list.addLast(val);
      } 
      str = br.readLine();
    }

    testList(list);
  }
}