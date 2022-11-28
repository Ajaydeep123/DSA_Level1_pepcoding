import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();

        ArrayList<String> ans = getKPC(str);
        System.out.println(ans);

    }

    static String[]arr={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static ArrayList<String> getKPC(String str) {
        //base case
        if(str.length()==0){
            ArrayList<String>base=new ArrayList<>();
            base.add("");
            return base;
        }

        char ch=str.charAt(0); // picked the first value
        String ros=str.substring(1);  // stored all the values expect the first one
        ArrayList<String>rr=getKPC(ros); // rr aka recusrion result has the value obtained using function getKPC(for all values in ros)
        String code=arr[ch-'0'];  // code string me first value me jo string stored hai uski value aajaegi
        /* '6'is not = 6, '6' is a character whose ascii value is 54
        in order to change this code into integer we ch-'0' */
        ArrayList<String>myAns=new ArrayList<>();

        for(int i=0;i<code.length();i++){
            char c=code.charAt(i);
            for(int j=0;j<rr.size();j++){
                myAns.add(c+rr.get(j));
            }
        }
        return myAns;
    }

}