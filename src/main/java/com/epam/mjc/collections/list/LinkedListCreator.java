package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> result = new LinkedList<>();
        for (int a : sourceList) {
            if (a % 2 == 0) {
                result.addLast(a);
                continue;
            }
            result.addFirst(a);
        }
        return result;
    }
}
