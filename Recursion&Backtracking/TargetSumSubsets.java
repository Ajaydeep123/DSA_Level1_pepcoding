// import java.io.*;
// import java.util.*;

// public class Main {

//     public static void main(String[] args) throws Exception {
        
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int[]arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = scn.nextInt();
//             }
//         int tar = scn.nextInt();
//         printTargetSumSubsets(arr, 0, "", 0, tar);      //1

//     }

//     // set is the subset
//     // sos is sum of subset
//     // tar is target
//     public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
//           if(sos > tar){
//             return;
//         }
//         if(idx == arr.length){
//             if(sos ==tar){
//                 System.out.println(sos + ".");   
//             }
//             return ;
//         }
        
//         //There are two choices present, either the element will be included or it will be excluded

//         //1. included:

//         printTargetSumSubsets(arr, idx+1, set+ arr[idx], ", ", sos+ arr[idx], tar);

//         //2. excluded:
//         printTargetSumSubsets(arr, idx+1, set, sos,tar);
        
//     }

// }
import java.io.*;
import java.util.*;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
    
        for(int i = 0; i < n; i++){
           arr[i] = Integer.parseInt(br.readLine());
        }
 
        int tar = Integer.parseInt(br.readLine());
        printTargetSumSubsets(arr, 0, "", 0, tar);
    }
 
    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
        if(sos > tar){
            return;
        }
 
        if(idx == arr.length){
            if(sos == tar){
                System.out.println(set + ".");
            }
            return;
        }
 
        printTargetSumSubsets(arr, idx + 1, set + arr[idx] + ", ", sos + arr[idx], tar);
        printTargetSumSubsets(arr, idx + 1, set, sos, tar);
    }
 
}