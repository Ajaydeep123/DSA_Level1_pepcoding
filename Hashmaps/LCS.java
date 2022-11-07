// You are required to print the longest sequence of consecutive elements in the array (ignoring duplicates).

// Note -> In case there are two sequences of equal length (and they are also the longest), then print the one for which the starting point of which occurs first in the array.
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn= new Scanner(System.in);
    int n= scn.nextInt();
    int []arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i]= scn.nextInt();
    }
    HashMap <Integer, Boolean> hashmap = new HashMap();
    // now we'll put the values from array into hashmap
    for(int val: arr){
        hashmap.put(val,true);
    }

    for(int val: arr){
        if(hashmap.containsKey(val-1)){
            hashmap.put(val,false);
        }
    }
    //find longest sequence

    int sp=0;
    int maxLength=0;

    for(int val:arr){
        if(hashmap.get(val)==true){
            int curr = val;
            int len =1;
            while(hashmap.containsKey(curr+1)==true){
                curr+=1;
                len++;
            }
            if(len>maxLength){
                maxLength=len;
                sp=val;
            }
        }
    }
    for(int i=0;i<maxLength;i++){
        System.out.println(sp+i);
    }
 }

}