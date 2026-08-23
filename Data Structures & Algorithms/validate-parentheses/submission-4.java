class Solution {
    public boolean isValid(String s) {
        // System.out.println(s);

        Stack<Character> stack = new Stack<>();

        char[] chars = s.toCharArray();
        for(char ch : chars){
            // System.out.println(ch);

            if (ch == '('){
                // System.out.println("c");
                stack.push(ch);
            }
            else if(ch == '{'){
                stack.push(ch);
            }
            else if(ch == '['){
                stack.push(ch);
            }
            else if(ch == ')'){
                if(stack.isEmpty()){
                    return false;
                }
                char c = stack.peek();
                if(c != '('){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
            else if(ch == '}'){
                if(stack.isEmpty()){
                    return false;
                }
                char c = stack.peek();
                if(c != '{'){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
            else if(ch == ']'){
                if(stack.isEmpty()){
                    return false;
                }
                char c = stack.peek();
                if(c != '['){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
