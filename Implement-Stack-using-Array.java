/*
Problem: Implement stack using Array
Time Complexity: O(1)
Space Complexity: O(n)
*/
class myStack {
    int top ;
    int[] stack;
    public myStack(int n) {
        // Define Data Structures
        top = -1;
        stack = new int[n];
    }

    public boolean isEmpty() {
        // check if the stack is empty
        if(top==-1) return true;
        return false;
    }

    public boolean isFull() {
        // check if the stack is full
        if(top==stack.length-1) return true;
        return false;
    }

    public void push(int x) {
        // Inserts x at the top of the stack
        stack[++top]=x;
    }

    public void pop() {
        // Removes an element from the top of the stack
        if(top==-1) return;
        top--;
    }

    public int peek() {
        // Returns the top element of the stack
        if(top==-1) return -1;
        return stack[top];
    }
}
