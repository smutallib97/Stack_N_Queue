package com.bridgelabz;

import java.util.LinkedList;

public class Stack_n_Queue2 {
    LinkedList<Integer> newlist = new LinkedList<Integer>();

    public void enQueue(Integer Data) {
        newlist.addLast(Data);
    }
    public void deQueue() {
        newlist.remove();
    }

    public void PrintQueue() {
        System.out.println(newlist);
    }

    public static void main(String[] args) {
        //UC3 - Ability to create a Queue
        Stack_n_Queue2 myQueue = new Stack_n_Queue2();

        myQueue.enQueue(56);
        myQueue.enQueue(30);
        myQueue.enQueue(70);

        myQueue.PrintQueue();
        //UC4 - Ability to dequeue
        myQueue.deQueue();
        myQueue.PrintQueue();
    }
}
