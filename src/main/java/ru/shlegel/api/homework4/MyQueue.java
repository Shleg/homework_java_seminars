package ru.shlegel.api.homework4;

import java.util.LinkedList;

class MyQueue<T> {

    public static void main(String[] args) {

        MyQueue<String> queue = new MyQueue<>();
        System.out.println(queue.elements);
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        queue.enqueue("D");
        System.out.println(queue.elements);

        System.out.println(queue.first());
        System.out.println(queue.elements);
        System.out.println(queue.dequeue());
        System.out.println(queue.elements);
        System.out.println(queue.dequeue());
        System.out.println(queue.elements);
        System.out.println(queue.first());
        System.out.println(queue.elements);

    }
    private LinkedList<T> elements = new LinkedList<>();

    public void enqueue(T element) {
        elements.addLast(element);
    }

    public T dequeue() {
        if (elements.isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        return elements.removeFirst();
    }

    public T first() {
        if (elements.isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        return elements.getFirst();
    }
}

