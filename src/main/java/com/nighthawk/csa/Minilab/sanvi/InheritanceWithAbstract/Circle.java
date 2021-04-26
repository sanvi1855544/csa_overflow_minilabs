package com.nighthawk.csa.Minilab.sanvi.InheritanceWithAbstract;

// Circle.java

public class Circle extends Shape //extends tells us that inheritance is happening
{
    private int radius;
    public Circle (int circleRadius, String shapeName)
    {
        super(shapeName);
        radius = circleRadius;
    }

    public int area(int l, int w) //method almost same as abstract method header
    {
        return (int) 3.14 * 2 * l;
    }
}