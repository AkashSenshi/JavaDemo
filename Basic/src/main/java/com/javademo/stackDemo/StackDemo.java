package com.javademo.stackDemo;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Insert elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Remove element
        int removedElement = stack.pop();
        System.out.println("Removed element: " + removedElement);

        // Peek at the top element
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // Print all elements
        System.out.println("All elements:");
        stack.forEach(System.out::println);

        // Iterate over elements using forEach
        System.out.println("Iterate over elements using forEach:");
        stack.forEach(System.out::println);
        // Iterate over elements using Stream API and lambda expression
        System.out.println("Iterating over elements using Stream API:");
        stack.stream().forEach(System.out::println);

        // Use Stream API to sum all elements
        int sum = stack.stream().reduce(0, Integer::sum);
        System.out.println("Sum of all elements: " + sum);

        // Use Stream API to find the maximum element
        int max = stack.stream().max(Integer::compare).get();
        System.out.println("Maximum element: " + max);
    }
}
