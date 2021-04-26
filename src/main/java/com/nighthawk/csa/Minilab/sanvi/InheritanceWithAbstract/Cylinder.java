package com.nighthawk.csa.Minilab.sanvi.InheritanceWithAbstract;

public class Cylinder extends Circle
{
    private double height;


    public Cylinder(double r, double h){
        super((int)r,"Cylinder"); //must give r and name bc giving parameter
        height = h;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double h){
        height = h;
    }


    public double findVolume(){
        return area(3, 4) * height;
    }

}
