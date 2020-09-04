package com.company;

public interface Stack {
        // most important methods
        void   push(Object n); // push an object onto top of the stack
        Object pop();    	  // pop an object from top of the stack

        Object  top();
        boolean isEmpty();     // true if stack is empty
        boolean isFull();  	  // true if stack is full (if it has limited storage)
    }

