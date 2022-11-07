public static int solve(int op1, int op2, char operator){
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

public static int precedence(char){
    if(ch=='+'|| ch=='-'){
        return 1;
    }else if(ch=='*' || ch=='/'){
         return 2;
     }
     else {
         return 0;
     }
}