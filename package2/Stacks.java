package package2;

import java.util.Stack;

public class Stacks {
    private int maxSize;
    private int[] stackArray;
    private int top;
    Stacks(int size){
        maxSize = size;
        top = -1;
        stackArray = new int [maxSize];
    }
void push(int data){
        if(maxSize-1 > top){
            stackArray[++top] = data;
        }
}

    public static void main(String[] args) {
        Stack n = new Stack(4);
        n.push(20);
        n.push(30);
        n.push(40);
        for(int i = 0; i < n.maxSize; i++){
            System.out.println(n.stackArray);
        }

    }
}
