package com.bridgelabz;

import java.util.LinkedList;

public class Stack_n_Queue {
    static class MyStack {
        LinkedList<Integer> newlist =new LinkedList<Integer>();
        public void Push(Integer Data) {
            newlist.add(Data);
        }
        public void peek() {
            System.out.println(newlist.peek());
        }

        public void pop() {
            while(newlist.size()!=0) {
                newlist.pop();
            }
        }
        public void PrintStack() {
            System.out.println(newlist);
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Stack And Queue Program by Using LinkedList Operations");
        MyStack mystack = new MyStack();
        System.out.println("Elements of Stack are : ");
        mystack.Push(56);
        mystack.Push(30);
        mystack.Push(70);

        mystack.PrintStack();
        mystack.peek();
        mystack.pop();
        mystack.PrintStack();
    }
}
