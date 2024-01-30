import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Rpn {
    public static void main(String[] args) {
        String tokens[] = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(tokens));
    }
    public static int evalRPN(String[] tokens) {
        Stack<String> s=new Stack<>();
        for(String curr: tokens){
            if (curr.equals("+")||curr.equals("-")||curr.equals("*")||curr.equals("/")) {
                int b=Integer.parseInt(s.pop());
                int a=Integer.parseInt(s.pop());
                if (curr.equals("+")) {
                    s.push((a+b)+"");
                }else if(curr.equals("-")) {
                    s.push((a-b)+"");
                }
                else if(curr.equals("*")) {
                    s.push((a*b)+"");
                }
                else if(curr.equals("/")) {
                    s.push((a/b)+"");
                }
            }
            else s.push(curr);
        }
        return Integer.parseInt(s.pop());
    }
}
