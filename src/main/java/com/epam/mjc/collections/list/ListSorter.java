package com.epam.mjc.collections.list;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        ListComparator listComparator = new ListComparator();
        sourceList.sort(listComparator);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int first = Integer.parseInt(a);
        int second = Integer.parseInt(b);
        double val1 = 5 * Math.pow(first, 2) + 3;
        double val2 = 5 * Math.pow(second, 2) + 3;
        return val1 > val2 ? 1 : val2 > val1 ? -1 : Integer.compare(first, second);
    }
}
