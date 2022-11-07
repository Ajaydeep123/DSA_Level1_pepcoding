import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
       arr[i] = Integer.parseInt(br.readLine());
    }
    int ts= (int)Math.pow(2,n);
    for(int i=0;i<ts;i++){
       int bn= Decimaltobinary(i,2);
       int div= (int)Math.pow(10,n-1);
       for(int j=0;j<arr.length;j++){
          int q= bn/div;
          int rem= bn%div;
          if(q==1){
             System.out.print(arr[j]+"\t");
          }else{
             System.out.print("-\t");
          }
          bn=rem;
          div= div/10;
       }System.out.println();
    }

    
 }

 public static int Decimaltobinary(int n, int b){
    int ans=0;
    int power=1;
    while(n>0){
       int rem=n%b;
       int quo= n/b;
       n=quo;
       ans+=(rem*power);
       power*=10;
    }
    return ans;
 }

}