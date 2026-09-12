class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i< tokens.length; i++){
            String token = tokens[i];

            if(!token.equals("+") &&
                !token.equals("-") &&
                !token.equals("*") &&
                !token.equals("/")){
                    stack.push(Integer.parseInt(token));
                }

            else{
                int num1 = stack.pop();
                int num2 = stack.pop();

                int result=0;
                
                if(token.equals("+")){
                    result = num2 + num1;
                }
                if(token.equals("-")){
                    result = num2 - num1;
                }
                if(token.equals("*")){
                    result = num2 * num1;
                }
                if(token.equals("/")){
                    result = num2 / num1;
                }
                stack.push(result);
            }
        }
        return stack.pop();
    }
}