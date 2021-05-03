package com.nighthawk.csa.Minilab.sanvi.List;
import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListOps extends Base {
    private ArrayList<String> stringArrayList;

    public ArrayListOps(String[] listElems) {
        stringArrayList = new ArrayList<String>();
        for (String elem : listElems) {
            stringArrayList.add(elem);
        }
    }

    public String[] modifyList(){
        // Insert head middle tail - 100 times
        for (int i = 0; i < 100; i++) {
            stringArrayList.add(0, "head" + i);
            stringArrayList.add(stringArrayList.size()/2, "middle" + i);
            stringArrayList.add("tail" + i);
        }

        // Sort
        stringArrayList.sort(Comparator.naturalOrder());

        // Delete head middle tail - 100 times
        for (int i = 0; i < 100; i++) {
            stringArrayList.remove(0);
            stringArrayList.remove (stringArrayList.size()/2);
            stringArrayList.remove(stringArrayList.size() - 1);
        }

        return stringArrayList.toArray((new String[stringArrayList.size()]));
    }
}
