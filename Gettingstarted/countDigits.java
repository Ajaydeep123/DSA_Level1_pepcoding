import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int d =0;
    while(n!=0){
      int q= n/10;
      n=q;
      d++;
    }
    System.out.println(d);
   }
  }