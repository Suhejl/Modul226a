package ch.tbz.modul404.exception_exercise;

import java.util.Scanner;

public class Stack {
    final int anz_elemente = 5;
    int[] stack = new int[anz_elemente];
    int top = 0;


    public int pop() throws StackUnderflow {
        if (empty()) {
            throw new StackUnderflow("Underflow (Stack is Empty)");
        }else{
            Scanner scan = new Scanner(System.in);
            System.out.println("Which value do you want to get? (Index begins with 0)");
            int index = Integer.parseInt(scan.nextLine());
            return stack[index];
        }

    }

    public void push(int value) throws  StackOverflow {
        if (full()) {
            throw new StackOverflow("Overflow (Stack is Full)");
        }else{
            stack[top] = value;
            top++;
        }
    }

    private boolean full() {
        for (int i = 0; i < anz_elemente; i++) {
            if (stack[i] == 0) {
                return false;
            }
        }
        return true;
    }

    private boolean empty() {
        for (int i = 0; i < stack.length; i++) {
            if (stack[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public void display() {
        for (int i = 0; i < size(); i++) {
            System.out.println(stack[i]);
        }
    }

    public int size() {
        return stack.length;
    }
}

