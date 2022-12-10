import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code

    /* To approach this problem we'll require two separate stacks for operator and operands
      1. Element at the top of the stack st1 will be operand2, and below it will be operand 1

      2. In the operator stack ST2, if any operator has the same preferance, in that case we evaluate from left to right and 
      put the one that occurs at first in the expression, put it inside the stack whereas we put the other operator on hold 

      3. all the operations are in the order : op1 (+-* / ) order.

      4. when we approach closing ")" bracket in the st2, we will pop operators until we find "(" in the st2.
            And after that we'll "(" too.

      5. After Evaluation when stack st2 is empty and whatever element is remaining in the stack st1, it will be the output.

    */
    
    Stack<Integer>st1=new Stack<>();// for operands
    Stack<Character>st2=new Stack<>();// for operator
    
    for(int i=0;i<exp.length();i++){
        char ch=exp.charAt(i);
        // if character is operand
        if(ch>='0' && ch<='9'){
            st1.push(ch-'0');  // converts the character into the same integer value
        }else if(ch=='('){
            st2.push(ch);
        }else if(ch=='+' || ch=='-' || ch=='*' ||ch=='/'){
            while(st2.size()>0 && precedence(st2.peek())>=precedence(ch)){
                char operator=st2.pop();
                int op2=st1.pop();
                int op1=st1.pop();
                
                int result=solve(op1,op2,operator);
                st1.push(result);
            }
            st2.push(ch);
            
        }else if(ch==')'){
            while(st2.peek()!='('){
                char operator=st2.pop();
                int op2=st1.pop();
                int op1=st1.pop();
                
                int result=solve(op1,op2,operator);
                st1.push(result);
            }
            st2.pop();
            
        }else{
            //do nothing
        }
    }
    while(st2.size()!=0){
        char operator=st2.pop();
        int op2=st1.pop();
        int op1=st1.pop();
        
        int result=solve(op1,op2,operator);
        st1.push(result);
        
    }
    System.out.println(st1.peek());
    
    
 }
 public static int solve(int op1,int op2,char operator){
    if(operator=='+'){
        return op1+op2;
    }else if(operator=='-'){
        return op1-op2;
    }else if(operator=='*'){
        return op1*op2;
    }else {
        return op1/op2;
    }
 }
 
 public static int precedence(char ch){
     
     if(ch=='+' || ch=='-'){
         return 1;
     }
     else if(ch=='*' || ch=='/'){
         return 2;
     }
     else {
         return 0;
     }
 }
}