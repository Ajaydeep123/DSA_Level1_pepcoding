import java.io.*;
import java.util.*;

public class Main {
  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  public static class Pair {
    Node node;
    int state;

    Pair(Node node, int state) {
      this.node = node;
      this.state = state;
    }
  }

  public static Node construct(Integer[] arr) {
    Node root = new Node(arr[0], null, null);
    Pair rtp = new Pair(root, 1);   // state 1 -> left, state 2-> right,  any other state -> pop

    Stack<Pair> st = new Stack<>();
    st.push(rtp);

    int idx = 0; //traversing the array
    while (st.size() > 0) { 
      Pair top = st.peek();
      if (top.state == 1) {  // agar state 1 hai toh top node ka left node banaenge aur uski state ke sath use stack me push kar denge aur fir jo pehle top pe the uski state badha denge
        idx++;
        if (arr[idx] != null) {
          top.node.left = new Node(arr[idx], null, null);
          Pair lp = new Pair(top.node.left, 1);
          st.push(lp);
        } else {
          top.node.left = null; // agar top node ka left node null hai array me. toh tree me use b null hi rehne denge
        }

        top.state++;
      } else if (top.state == 2) {
        idx++;
        if (arr[idx] != null) {
          top.node.right = new Node(arr[idx], null, null);
          Pair rp = new Pair(top.node.right, 1);
          st.push(rp);
        } else {
          top.node.right = null;
        }

        top.state++;
      } else {
        st.pop();
      }
    }

    return root;
  }

  public static void display(Node node) {
    if (node == null) {
      return;
    }

    String str = "";
    str += node.left == null ? "." : node.left.data + ""; 
    str += " <- " + node.data + " -> ";
    str += node.right == null ? "." : node.right.data + "";
    System.out.println(str);

    display(node.left);
    display(node.right);
  }

  
  public static int size(Node node) {
    // write your code here
    
    //  Base case ->if node is pointing to null
    if(node==null){
        return 0;
    }
    
    //  faith
    // leftside-> give the size of left side
    int leftside=size(node.left);
    
    //  rightside ->give the size of right side
    int rightside=size(node.right);
    
    // final answer/ my work 
    return leftside+rightside+1;
    
  }

  public static int sum(Node node) {
    // write your code here
    if(node==null){
        return 0;
    }
    
    int leftsum=sum(node.left);
    int rightsum=sum(node.right);
    
    return leftsum+rightsum+node.data;
  }

  public static int max(Node node) {
    // write your code here
    
    if(node==null){
        return Integer.MIN_VALUE;     //min(x, infinity)= x , max(x, -Infinite)= x
    }
    
    int leftmax=max(node.left);
    int rightmax=max(node.right);
    int ans=Math.max(node.data,Math.max(leftmax,rightmax));
    
    return ans;
  }

  public static int height(Node node) {
    // write your code here
    
    if(node==null){
        return -1;
    }
    
    int leftHeight=height(node.left);
    int rightHeight=height(node.right);
    
    int myHeight=Math.max(leftHeight,rightHeight)+1;
    
    return myHeight;
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Integer[] arr = new Integer[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      if (values[i].equals("n") == false) {
        arr[i] = Integer.parseInt(values[i]);
      } else {
        arr[i] = null;
      }
    }

    Node root = construct(arr);

    int size = size(root);
    int sum = sum(root);
    int max = max(root);
    int ht = height(root);
    System.out.println(size);
    System.out.println(sum);
    System.out.println(max);
    System.out.println(ht);
  }

}