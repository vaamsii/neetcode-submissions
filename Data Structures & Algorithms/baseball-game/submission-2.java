class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int result = 0; // result should be the sum of the stack ops
        for(int i = 0; i< operations.length; i++){
            
            if(operations[i].equals("+")){
                int top = stack.pop(); // would be 2 here
                int secondTop = stack.peek();//would be 1
                int sum = top + secondTop;// 2 + 1 = 3

                stack.push(top); // push 2 first
                stack.push(sum); // push 3 next
                result+= sum; // result will be adding just the 3 (sum)
            }
            else if(operations[i].equals("D")){
                int doub = stack.peek(); // would be 5 here
                stack.push(doub * 2); // 5*2 is pushed
                result += (doub*2); // will be adding the double value
            }
            else if(operations[i].equals("C")){
                int removed = stack.pop(); // would be 3 here, removed
                result -= removed; // remove the value at the top
            }
            else{
                stack.push(Integer.parseInt(operations[i]));
                result+= Integer.parseInt(operations[i]);
            }
            
            // System.out.println(operations[i]);
            // System.out.println(stack);
            // System.out.println(result + "result");
            
        }
        return result;
    }
}