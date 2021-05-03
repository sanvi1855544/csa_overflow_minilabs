package com.nighthawk.csa.Minilab.gautam.LinkedLists;

import java.util.*;


public class GLinkedList extends Base {
    private LinkedList<String> csList;
    public GLinkedList(String[] arr) {
        csList = new LinkedList<String>();
        csList.addAll(Arrays.asList(arr));
    }

    public String[] add() {
        csList.sort(Comparator.naturalOrder());
        return csList.toArray(new String[csList.size()]);
    }
}
