package com.example.rickb.week2test;

import java.util.Stack;

public class QueueUsingStack {
    // class of queue having two stacks
    static class Queue {
        Stack<Integer> stack1 = new Stack<>();
    }

    /* Function to push an item to stack*/
    static void push(Stack<Integer> top_ref, int new_data)
    {
        /* put in the data */
        top_ref.push(new_data);
    }

    /* Function to pop an item from stack*/
    static int pop(Stack<Integer> top_ref)
    {
        /*If stack is empty then error */
        if (top_ref == null) {
            System.out.println("Stack Underflow");
            System.exit(0);
        }
        // return element from stack
        return top_ref.pop();
    }

    /* Function to enqueue an item to queue */
    public void enQueue(Queue q, int x)
    {
        push(q.stack1, x);
    }

    /* Function to deQueue an item from queue */
    public int deQueue(Queue q)
    {
        int x, res = 0;
        /* If the stacks is empty then error */
        if (q.stack1.isEmpty()) {
            System.out.println("Q is Empty");
            System.exit(0);
        }
        // Check if it is a last element of stack
        else if (q.stack1.size() == 1) {
            return pop(q.stack1);
        }
        else {

            /* pop an item from the stack1 */
            x = pop(q.stack1);

            /* store the last deQueued item */
            res = deQueue(q);

            /* push everything back to stack1 */
            push(q.stack1, x);
            return res;
        }
        return 0;
    }


}
