package Main;
import java.util.Stack;
public class Balanced_Parentheses_problem {

    public boolean areBalanced(String expression) {
        Stack<Character> s = new Stack<Character>();
        for (int i = 0; i < expression.length(); i++) {
            if(expression.charAt(i) == '(' || expression.charAt(i) == '{' || expression.charAt(i) == '[') {
                s.push(expression.charAt(i));
            }
            else if (expression.charAt(i) == ')' || expression.charAt(i) == '}' || expression.charAt(i) == ']'){
                if(s.empty() || !arePair(s.peek(), expression.charAt(i)))
                    return false;
                else
                    s.pop();
            }
        }
        return s.empty();       //if stack empty return true else return false
    }

    public boolean arePair(char open, char close) {   // this methode use to check parenthesis pair ex : (), {}, [] ,,,,not : {),[), (}
        if(open == '(' && close == ')'){
            return true;
        }
        else if (open == '{' && close == '}') {
            return true;
        }
        else if (open == '[' && close == ']') {
            return true;
        }
        return false;
    }

}