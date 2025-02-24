package com.towerplus.java.exercise;

public class QueueImplementation {

    private int[] queue;
    private int front, rear, size;

    public QueueImplementation(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void addElementToQueue(int item) {
        if (size < queue.length) {
            rear = (rear + 1) % queue.length;
            queue[rear] = item;
            size++;
            System.out.println(item + "Added successfully");
        }  else {
        	System.out.println("Queue Max size reached " + item + " so not Added successfully");
        }
    }

    public int removeElementToQueue() {
        if (size == 0) {
            return 0;
        }
        int item = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return item;
    }

    public int front() {
        if (size == 0) {
            return -1;
        }
        return queue[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public int length() {
        return queue.length;
    }


    public static void main(String[] args) {
    	QueueImplementation queue = new QueueImplementation(3);
    	System.out.println("Queue max size: " + queue.length());
    	
    	System.out.println("Adding elements");

        queue.addElementToQueue(25);
        queue.addElementToQueue(20);
        queue.addElementToQueue(30);
        queue.addElementToQueue(55);
        
       

        System.out.println("Removed: " + queue.removeElementToQueue());
        System.out.println("Removed: " + queue.removeElementToQueue());

        System.out.println("Front element: " + queue.front());
        System.out.println("Queue current size: " + queue.size());

        System.out.println("Removed: " + queue.removeElementToQueue());
        System.out.println("Queue current size: " + queue.size());
        System.out.println("Removed: " + queue.removeElementToQueue());
    }
}
