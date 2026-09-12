class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        Boolean flag = false;
        int count = 0;
        boolean [] arr = new boolean[s.length()];
        for(int i = 0; i <s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                stack.push(i);
            }
            else if(ch == ')'){
                if(stack.isEmpty()){
                    arr[i] = true;
                }
                else{
                    stack.pop();
                }
            }
        }

        while(!stack.isEmpty()){
            arr[stack.pop()] = true;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
         if(!arr[i]){
            sb.append(s.charAt(i));
        }
    }
    return sb.toString();
    }
}