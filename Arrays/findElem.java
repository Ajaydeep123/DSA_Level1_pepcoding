//You are required to check if d number exists in the array a and at what index (0 based). 
// If found print the index, otherwise print -1.
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    int d = scn.nextInt();
    System.out.println(FoundElement(arr, d));
 }

 public static int FoundElement(int arr[], int d){
     for(int i=0;i<arr.length; i++){
         if(arr[i]==d){
             return i;
         }
     }return -1;
 }

}