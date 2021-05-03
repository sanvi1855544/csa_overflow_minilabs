package com.nighthawk.csa.Minilab.sanvi.List;
import java.util.LinkedList;
import java.util.Comparator;

public class LinkedListOps extends Base {
    private LinkedList<String> stringLinkedList;

    public LinkedListOps(String[] listElems) {
        stringLinkedList = new LinkedList<String>();
        for (String elem : listElems) {
            stringLinkedList.add(elem);
        }
    }

    public String[] modifyList(){
        // Insert head middle tail - 100 times
        for (int i = 0; i < 100; i++) {
            stringLinkedList.add(0, "head" + i);
            stringLinkedList.add(stringLinkedList.size()/2, "middle" + i);
            stringLinkedList.addLast("tail" + i);
        }

        // Sort
        stringLinkedList.sort(Comparator.naturalOrder());

        // Delete head middle tail - 100 times
        for (int i = 0; i < 100; i++) {
            stringLinkedList.removeFirst();
            stringLinkedList.remove (stringLinkedList.size()/2);
            stringLinkedList.removeLast();
        }

        return stringLinkedList.toArray((new String[stringLinkedList.size()]));
    }
}
