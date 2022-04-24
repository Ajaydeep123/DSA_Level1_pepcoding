import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       // write code here
       int ans=0, power=1;
       while(n>0){
           int rem= n%10;
            n/=10;
           
           ans= ans+ rem*power;
           power= power*b;
          

       }
       return ans;
   }
  }