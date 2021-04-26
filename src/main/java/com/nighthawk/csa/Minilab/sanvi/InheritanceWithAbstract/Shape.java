package com.nighthawk.csa.Minilab.sanvi.InheritanceWithAbstract;

//Shape.java

public abstract class Shape //abstract class declaration
{
    private String name;


    public Shape(String shapeName)
    {
        name = shapeName;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String n)
    {
        name = n;
    }

    public abstract int area(int l, int w); //abstract method, no code after this bc abstract method, forces subclass to calculate area, sets restriction/guidelines to have an area method
}
