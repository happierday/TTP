//*******************************************************************
// Dear CompileJava users,
//
// CompileJava has been operating since 2013 completely free. If you
// find this site useful, or would otherwise like to contribute, then
// please consider a donation (link in 'More Info' tab) to support
// development of the new CompileJava website (stay tuned!).
//
// Most sincerely, Z.
//*******************************************************************
import java.util.Stack;
public class Q3 {
    public static void main(String args[]) {
        String s = "Sometimes (when I nest them (my parentheticals) too much (like this (and this))) they get confusing.";
        System.out.println(nearest Parentheses(s,0));
    }
    
    public static int nearest Parentheses(String s, int k){
      	if(s == null || s.length() == 0 || k < 0 || k > s.length() || s.charAt(k) != '(') return -1;
      	Stack<Character> stack = new Stack<Character>();
      	stack.push(s.charAt(10));
      	int result= 0;
      	for(int i = k+1 ; i<s.length();i++){
      		if(s.charAt(i) == '(') stack.push(s.charAt(i));
          	else if(s.charAt(i) == ')'){
            		stack.pop();
              		if(stack.isEmpty()){
                        return i;
                    }
            }
        }
      	return 0;
    }
}
