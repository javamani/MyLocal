package com.towerplus.java.exercise;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QueueImplementationTest {

    private QueueImplementation queue;

    @BeforeEach
    public void setUp() {
        queue = new QueueImplementation(3);
    }

    @Test
    public void testAddElementToQueue() {
        queue.addElementToQueue(10);
        assertEquals(1, queue.size(), "Queue size should be 1 after adding an element.");
        assertEquals(10, queue.front(), "The front element should be 10 after adding.");
    }

    @Test
    public void testRemoveElementToQueue() {
        queue.addElementToQueue(10);
        queue.addElementToQueue(20);
        int removedItem = queue.removeElementToQueue();
        assertEquals(10, removedItem, "Removed element should be 10.");
        assertEquals(1, queue.size(), "Queue size should be 1 after removing an element.");
    }

    @Test
    public void testRemoveElementFromEmptyQueue() {
        int removedItem = queue.removeElementToQueue();
        assertEquals(0, removedItem, "Removing from an empty queue should return 0.");
    }

    @Test
    public void testAddBeyondCapacity() {
        queue.addElementToQueue(10);
        queue.addElementToQueue(20);
        queue.addElementToQueue(30);
        queue.addElementToQueue(40); // This should not be added as the queue is full
        assertEquals(3, queue.size(), "Queue size should remain 3 after trying to add more elements.");
    }

    @Test
    public void testFront() {
        queue.addElementToQueue(10);
        queue.addElementToQueue(20);
        assertEquals(10, queue.front(), "The front element should be 10.");
    }

    @Test
    public void testIsEmpty() {
        assertTrue(queue.isEmpty(), "Queue should be empty initially.");
        queue.addElementToQueue(10);
        assertFalse(queue.isEmpty(), "Queue should not be empty after adding an element.");
        queue.removeElementToQueue();
        assertTrue(queue.isEmpty(), "Queue should be empty after removing the element.");
    }

    @Test
    public void testQueueSize() {
        assertEquals(0, queue.size(), "Queue size should be 0 initially.");
        queue.addElementToQueue(10);
        assertEquals(1, queue.size(), "Queue size should be 1 after adding one element.");
        queue.removeElementToQueue();
        assertEquals(0, queue.size(), "Queue size should be 0 after removing the only element.");
    }

    @Test
    public void testQueueCapacity() {
        assertEquals(3, queue.length(), "Queue capacity should be 3.");
    }
}
