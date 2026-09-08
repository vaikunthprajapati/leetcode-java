class CustomStack {
    private int[] arr;
    private int top;
    private int maxSize;
    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];

        top = -1;
    }
    
    public void push(int x) {
        if(top == maxSize - 1){
            return;
        }
        arr[++top] = x;
    }
    
    public int pop() {
        if( top == - 1){
            return -1;
        }
        int value = arr[top];
        top--;
        return value;
    }
    
    public void increment(int k, int val) {
        int limit;
        if(k > top+1){
            limit = top+1;
        }
        else{
            limit = k;
        }
        for(int i = 0; i<limit; i++){
            arr[i] += val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */