package stack;

public class Stack {

    int size = 0;
    int[] data;
    int capacity = 5;
         
    Stack() {
        data = new int [capacity];
    }
         
    void push(int value) {
        try {
            data[size++] = value;
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
         
    int pop() {
        return data[--size];
    }
    
    public static void main(String[] args) {
        Stack stack = new Stack();
        for (int i = 0; i < 6; i++)
            stack.push(i);
        for (int i = 0; i < 5; i++)
            stack.pop();
    }
}
