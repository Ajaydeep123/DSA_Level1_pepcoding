<<<<<<< HEAD
import java.io.*;
import java.util.*;

public class Main{
// Span is defined as difference of maximum value and minimum value.
public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn= new Scanner(System.in);
    int n= scn.nextInt();
    int [] arr = new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]= scn.nextInt();
    }
    int max = arr[0];
 int min = arr[0];

 for(int i=1; i<arr.length;i++){
     if(arr[i]>max){
         max= arr[i];
     }
     if(arr[i]<min){
         min= arr[i];
     }
 }
 int span= max-min;
 System.out.println(span);

 }
 
=======
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn= new Scanner(System.in);
    int n= scn.nextInt();
    int [] arr = new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]= scn.nextInt();
    }
    int max = arr[0];
 int min = arr[0];

 for(int i=1; i<arr.length;i++){
     if(arr[i]>max){
         max= arr[i];
     }
     if(arr[i]<min){
         min= arr[i];
     }
 }
 int span= max-min;
 System.out.println(span);

 }
 
>>>>>>> 7ded8badcfc1f4ce315d1c5463395a3ddd6ced2f
}