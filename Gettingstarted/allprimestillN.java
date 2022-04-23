import java.util.*;

public class Main{
    public static void main(String[] args) {
        // write your code here
        Scanner scn= new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
         
         for(int n= low; n<=high;n++){
             int count =0;
             for(int div =2; div*div<=n; div++){
                 if(n%div==0){
                     count++;
                     break;
                 }                 
             }
             if(count==0){
                 System.out.println(n);
             }

         } 
    }
}
// Starting to revise Level 1 upto function and arrays. After that i'll start 
// 1. Revise all the questions on nados and after that,
// 2. Solve some leetcode problems.