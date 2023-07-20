import java.util.Stack;

public class ParenthesesChecker {

    public static void main(String[] args) {
        String testString = "this should (hopefully) work";
        System.out.println(checkParentheses(testString));
    }


    public static boolean checkParentheses(String testString){
        // LIFO Stack function to check whether the String
        //  have the corresponding open and closing parentheses
        Stack<Character> stack = new Stack<>();

        // Traverse over the expression

        for (int i = 0; i < testString.length(); i++){

            // Get the current character
            char ch = testString.charAt(i);

            // If the stack is empty, push the current character into the stack

            if (stack.isEmpty()){
                stack.push(ch);
            }

            // Otherwise if the current character is a closing bracket and on the top of the stack contains an opening bracket of the same type then remove the top of the stack

            else if((ch==')' && stack.peek() == '(')||(ch=='}' && stack.peek() == '{')||(ch==']' && stack.peek() == '[')) {
                stack.pop();

            } else stack.push(ch);

        }








//            if (x == "(" || x == "[" || x== "{"){
//                stack.push(x);
//                continue;
//            }
//
//            if(stack.isEmpty())
//                return false;
//            char check;
//            switch (x){
//                case ")":
//                    check = stack.pop();
//                    if (check == "{" || check == "[")
//                        return false;
//                    break;
//                case "}":
//                    check = stack.pop();
//                    if (check == "(" || check == "{")
//                        return false;
//                    break;
//            }
//
//
//        }
//        return (stack.isEmpty());
//
//
////        while (!testString.isEmpty()){
////            testString.pop();

        return (stack.isEmpty());
        }










//        for (char : testString ){
//
//        }
//
//        if (testString.contains("") || testString.contains("()") || testString.contains("(())")) {
//
//            return true;
//
//        } else if (testString.contains("(")){
//            return false;
//        }
//        return false;








    }


// Reference: https://www.prepbytes.com/blog/stacks/check-for-balanced-parentheses-in-an-expression/