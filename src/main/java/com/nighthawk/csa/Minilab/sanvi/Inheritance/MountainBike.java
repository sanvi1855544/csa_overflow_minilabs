package com.nighthawk.csa.Minilab.sanvi.Inheritance;

// MountainBike.java

public class MountainBike extends Bicycle //tells computer we are inheriting Bicycle class
{
    private int seatHeight; //extra instance variable not part of bicycle class

    public MountainBike()
    {
        super(); //accesses constructor of Bicycle class
        seatHeight = 0; //must give seat height value of 0
    }

    public MountainBike(int startGear, int startSpeed, int startHeight)
    {
        super (startGear, startSpeed); //executing a constructor with two args, computer goes to bicycle class and gives gear and speed a specific value; super keyowrd in first line
        // can't say gear = startFear becuase gear instance variable is private, subclass doesn't have direct access
        setGear(startGear); //setter and getter accesses private instance variables implicitly
        seatHeight = startHeight; //seatHeight not a value of super class and must give value
    }

    public int getHeight()
    {
        return seatHeight;
    }

    public void setHeight (int h)
    {
        seatHeight = h;
    }

    public void slowDown(int decrement) //we have exact same methods in superclass, method overrriding, subclass replacing exisitng method in bicycle class
    {
        setSpeed( getSpeed() - (decrement / 2));
    }

    public void speedUp(int increment)
    {
        setSpeed( getSpeed() + (increment / 2 ));
    }
}
