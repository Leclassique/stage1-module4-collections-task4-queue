package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> result = new ArrayDeque<>();

        result.add(firstQueue.element());
        firstQueue.poll();
        result.add(firstQueue.element());
        firstQueue.poll();
        result.add(secondQueue.element());
        secondQueue.poll();
        result.add(secondQueue.element());
        secondQueue.poll();

        while (!firstQueue.isEmpty() || !secondQueue.isEmpty()) {
            firstQueue.add(result.getLast());
            result.removeLast();
            result.addLast(firstQueue.element());
            firstQueue.remove();
            result.addLast(firstQueue.element());
            firstQueue.remove();

            secondQueue.add(result.getLast());
            result.removeLast();
            result.addLast(secondQueue.element());
            secondQueue.remove();
            result.addLast(secondQueue.element());
            secondQueue.remove();
        }
        return result;
    }
}