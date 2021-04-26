package com.nighthawk.csa.Minilab.sanvi.InheritanceWithAbstract;

// Square.java

public class Square extends Shape //extends tells us that inheritance is happening
{
    private int length;


    public Square (int l, String shapeName)
    {
        super(shapeName);
        length = l;
    }

    public int area(int l, int w) //method almost same as abstract method header
    {
        return l * w;
    }
}
