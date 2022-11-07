import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn= new Scanner(System.in);
    int n= scn.nextInt();
    int [] arr= new int[n];
    for(int i=0; i<n;i++){
        arr[i]= scn.nextInt();
    }

    int digit = scn.nextInt();
    int left= 0;
    int right= n-1;

    // for first
    int first=-1;
    while(left<=right){

        int mid= (left+right)/2;
        if(arr[mid]<digit){
            left= mid+1;
        }
        
        else if(arr[mid]>digit){
            right= mid-1;
        }
        else{
            first=mid;
            right= mid-1;
        }
    }

    //for last index
    left = 0;
    right = arr.length - 1;
    int last=-1;
    while(left<=right){

        int mid= (left+right)/2;
        if(arr[mid]<digit){
            left= mid+1;
        }
        
        else if(arr[mid]>digit){
            right= mid-1;
        }
        else{
            last=mid;
            left= mid+1;
        }
    }
    System.out.println(first);
    System.out.println(last);

 }

}