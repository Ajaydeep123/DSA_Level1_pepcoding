// In a country of novice government, the economic system is changed where only coins are used that too of various denominations. Whenever a foreigner visits this country, they visit a money exchanger to get the currency of the same country. As the foreigner is unaware of the denomination of the country, the money exchange prefers to tell them the denomination which is the nearest maximum and nearest minimum to the denomination mentioned by the foreigner. In case they get the correct guess of the denomination, they are told the same denomination. The denominations are always quoted in ascending order.

// Example 1: In a country, 8 given denominations are as follows
// [5, 10, 15, 22, 33, 40, 42, 55]

// The foreigner asks for denomination 25.
// The money exchange tells them that denominations of 33 and 22 are available.

// Example 2: 
// In a country, 5 given denominations are as follows
// [7, 14, 18, 25, 30]

// The foreigner asks for the denomination of 18.

// The money exchange tells them a denomination of 18 is available.  

// You are required to print the values told by the money exchange to the foreigner.

// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of the array a.
// 3. You are given another number d.
// 4. You are required to find the ceil and floor of d in array a.        



import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn= new Scanner(System.in);
    int n= scn.nextInt();
    int [] arr= new int[n];
    for(int i=0;i<n;i++){
        arr[i]= scn.nextInt();
    }

    int data = scn.nextInt();
    int floor = -1;
    int ceil = -1;
    int left = 0;
    int right= n-1;
    while(left<=right){
        int mid= (left+right)/2;
        if(arr[mid]==data){
            floor= arr[mid];
            ceil = arr[mid];
        }else if(arr[mid]<data){
            floor= arr[mid];
            left= mid+1;
        }else{
            ceil=arr[mid];
            right= mid-1;
        }
    }
    System.out.println(ceil);
    System.out.println(floor);
 }

}