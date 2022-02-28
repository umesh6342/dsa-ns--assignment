package com.stack;

import java.util.Stack;

public class StaxckQuestion {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(9);
        s.push(8);
        s.push(12);
        s.push(3);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

    }
}
