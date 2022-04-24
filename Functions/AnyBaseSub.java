import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
       // write your code here
       int ans=0;
       int power=1;
       int borrow=0;
       int diff=0;
       while(n2>0){
           int ld1=n1%10;
           int ld2=n2%10;

           n1/=10;
           n2/=10;
           diff= ld2-ld1-borrow;
           if(diff<0){
               borrow =1;
               diff= diff+b;
           }else{
               borrow=0;
           }
           ans= ans+diff*power;
           power=power*10;

       }
       return ans;
   }
  
  }