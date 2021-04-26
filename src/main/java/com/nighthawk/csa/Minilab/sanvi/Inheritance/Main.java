package com.nighthawk.csa.Minilab.sanvi.Inheritance;

//Bicycle


class Main {
    public static void main(String[] args) {
        MountainBike b = new MountainBike(2,10,3); //polymorphism ex w/ method overloading
        MountainBike m = new MountainBike();
        Bicycle s = new Bicycle(2,10);

        System.out.println(b.getSpeed()); // 10
        System.out.println(s.getSpeed()); // 10

        b.speedUp(10);
        s.speedUp(10);

        System.out.println(b.getSpeed()); // 15
        System.out.println(s.getSpeed()); // 20
    }

}