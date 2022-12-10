import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(br.readLine());
    }

    // nse for the right
    int [] rb = new int[n];
    Stack <Integer> st = new Stack<>();
    st.push(n-1); //last digit ka index 
    rb[n-1]= n; // right ki default value, incase koi value hai jiska nse rigth ni mil rha toh default se n denge use.

    for(int i= n-2; i>=0;i--){

      // stack me jo index pada hai, agar us index ki array me value current index se jada hai to use pop kar denge
      // aisa tab karenge jb tk ya toh stack empty na ho jae ya fir choti value ka index na mil jae
      while(st.size()>0 && a[i]<= a[st.peek()]){
        st.pop();
      }

      if(st.size()>0){
        rb[i] = st.peek();
      }else{
        rb[i] = n;
      }

      st.push(i);
    }
    
    
    
    // nse for the left
    int [] lb = new int[n];
    st = new Stack<>();
    st.push(0); //first digit ka index 
    lb[0]= -1; // left ki default value, incase koi value hai jiska nse left ni mil rha toh default se -1 denge use.

    for(int i= 1; i<n;i++){

      // stack me jo index pada hai, agar us index ki array me value current index se jada hai to use pop kar denge
      // aisa tab karenge jb tk ya toh stack empty na ho jae ya fir choti value ka index na mil jae
      while(st.size()>0 && a[i]<= a[st.peek()]){
        st.pop();
      }
      
      if(st.size()>0){
        lb[i] = st.peek();
      }else{
        lb[i] = -1;
      }

      st.push(i);
    }
    
    // maxArea rectangle

    int maxArea = 0;
    for(int i=0; i<n;i++){
      int width = rb[i]-lb[i]-1;
      int Area = a[i]*width;

      // now we have to check for the max area so, we use if condition 
      
      if(Area>maxArea){
        maxArea= Area;
      }
    }
    System.out.println(maxArea);

}
}