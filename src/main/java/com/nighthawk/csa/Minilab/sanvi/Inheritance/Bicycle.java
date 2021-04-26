package com.nighthawk.csa.Minilab.sanvi.Inheritance;

//Bicycle.java


public class Bicycle
{
    private int gear; //these are our private instance variable of int type
    private int speed;

    public Bicycle() //constructor because method name is class name, invoked when we create object
    {
        gear = 0;
        speed = 0;
    }

    public Bicycle(int startGear, int startSpeed) //parameterized constructor
    {
        gear = startGear;  //gives value to private instance variable
        speed = startSpeed;
    }

    public int getGear() //public so subclass or other classes can access, returns integer, accessor method
    {
        return gear;
    }

    public void setGear(int g) //mutator or setter method
    {
        gear = g;
    }

    public int getSpeed() //another accesor
    {
        return speed;
    }

    public void setSpeed(int s) //another setter
    {
        speed = s;
    }

    public void slowDown(int decrement) //custom methods
    {
        speed -= decrement; //decreasing value of speed
    }

    public void speedUp (int increment)
    {
        speed += increment; //increasing value of speed
    }
}