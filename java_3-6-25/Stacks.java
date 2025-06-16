class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(20);
        stack.push(25);
        stack.push(30);
        stack.push(45);
        stack.push(42);
        stack.print();
        stack.pop();
        stack.print();
        System.out.println("The peak value is :"+stack.peak());
        stack.push(12);
        stack.print();
        System.out.println(" is Stack full :"+stack.isFull());
    }
}
class Stack{
    int [] Stack;
    int size;
    int top;
    Stack(int size){
        this.size = size;
        this.Stack = new int [size];
        this.top = -1;
    }
    boolean isFull(){
        if(top == size-1){
            System.out.println("Stack is full");
            return true;
        }
        return false;
    }
    boolean isEmpty(){
        if(top == -1){
            System.out.println("Stack is Empty");
            return true;
        }
        return false;
    }
    void push(int val){
        if(isFull()){
            return;
        }
        top = top+1;
        Stack[top] = val;
    }
    int pop(){
        if(isEmpty()){
            return -1;
        }
        int val = Stack[top];
        top = top-1;
        return val;
    }
    int peak(){
        if(isEmpty()){
            return -1;
        }
        return Stack[top];
    }
    void print(){
        for(int i = top; i>=0; i--){
            System.out.println("|"+Stack[i]+"|");
        }
        System.out.println("_______");
    }
}