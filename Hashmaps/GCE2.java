// You are required to find the intersection of a1 and a2. To get an idea check the example below:
//  if a1 -> 1 1 2 2 2 3 5 and a2 -> 1 1 1 2 2 4 5 intersection is -> 1 1 2 2 5 Note -> Don't assume the arrays to be sorted. Check out the question video.


import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
	  //Write your code here
    Scanner scn=new Scanner(System.in);
    int n1=scn.nextInt();
    int a1[]=new int [n1];
    
    for(int i=0;i<n1;i++){
        a1[i]=scn.nextInt();
    }
    
    
    int n2=scn.nextInt();
    int a2[]=new int [n2];
    
    for(int i=0;i<n2;i++){
        a2[i]=scn.nextInt();
    }
    

    HashMap<Integer, Integer> map = new HashMap<>();


    for(int i=0; i<n1;i++){
      if(map.containsKey(a1[i])==true){
        int freq = map.get(a1[i]);
        freq+=1;
        map.put(a1[i],freq);
      }else{
        map.put(a1[i],1);
      }
    }

    for(int i=0;i<n2;i++){
      // if Hashmap already has the value then print it and decrease its frequency by one

      if(map.containsKey(a2[i])==true){
        System.out.println(a2[i]);

        int freq= map.get(a2[i]);
        freq-=1;
        // by decreasing freq if it becomes zero than we have to remove it as the hashmap looks at the keys first and even if its 
        // freq is zero it will consider it as a one value, so always remove it
        if(freq==0){
          map.remove(a2[i]);
        }else{
          map.put(a2[i], freq);
        }
      }
    }
    
  }

}