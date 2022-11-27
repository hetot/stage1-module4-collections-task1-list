package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        int counter = 1;
        ArrayList<String> result = new ArrayList<>();
        for (String a : sourceList) {
            if (counter % 3 == 0) {
                result.add(a);
                result.add(a);
            }
            counter++;
        }
        return result;
    }
}
