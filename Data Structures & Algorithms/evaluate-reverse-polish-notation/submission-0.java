class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String token: tokens){
            if(token.equals("+")){
                int top = stack.pop();
                int top2 = stack.pop();
                int sum = top + top2;
                stack.push(sum);
            }
            else if(token.equals("-")){
                int top = stack.pop();
                int top2 = stack.pop();
                int subtract = top2 - top;
                stack.push(subtract);
            }
            else if(token.equals("*")){
                int top = stack.pop();
                int top2 = stack.pop();
                int product = top * top2;
                stack.push(product);
            }
            else if(token.equals("/")){
                int top = stack.pop();
                int top2 = stack.pop();
                int divide = top2 / top;
                stack.push(divide);
            }
            else{
                int temp = Integer.parseInt(token);
                stack.push(temp);
            }
        }
        return stack.pop();
    }
}
