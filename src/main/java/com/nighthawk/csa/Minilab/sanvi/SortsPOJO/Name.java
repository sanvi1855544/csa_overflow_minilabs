package com.nighthawk.csa.Minilab.sanvi.SortsPOJO;

public class Name implements Comparable<Name>{
    private int nameLength;
    private String name;
    public Name(String name){
        this.name = name;
        this.nameLength = name.length();
    }

    public int getNameLength() {
        return nameLength;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name{" +
                "nameLength=" + nameLength +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Name otherName) {
        int compVal = Integer.compare(getNameLength(), otherName.getNameLength());
        if (compVal == 0) {
            compVal = getName().compareTo(otherName.getName());
        }
        return compVal;
    }
}
