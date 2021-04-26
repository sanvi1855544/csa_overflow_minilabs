package com.nighthawk.csa.Minilab.sanvi.Recursion;

//recursion mini-lab employs 3 recursion examples
//ex 1: prints number and decrementing by one until it is 1
//ex 2: prints asterisk and decrementing asterisks by one until 1


import java.util.Scanner;

public class SanviRecursion {
    public static void main(String[] args) {

        //input for test 1
        Scanner kboard = new Scanner(System.in);
        System.out.println("what is your input for the first recursion test?");
        int n1 = kboard.nextInt();
        test(n1); //test and test2 are recursive methods


        //input for test 2
        System.out.println("what is your input for the second recursion test?");
        int n2 = kboard.nextInt();
        test2(n2);

        //binary search
        int arr[] = {10, 12, 14, 15, 16, 20};
        int search = 16;

        int start = 0;
        int end = arr.length-1;

        findRecursively(arr, start, end, search);
    }

    //first example of recursion
    public static void test(int n)
    {
        if(n>0) //base case
        {
            System.out.println(n);
            test(n-1); // n - 1 = non-base case, getting closer to base case of 0
        }
    }

    //second example of recursion
    public static void test2(int n)
    {

        if (n > 0)// base case
        {
            for (int i =1; i <= n; i++)
            {
                System.out.print("*"); //print out n *s on a line
            }
            System.out.println(); //next row starts on a new line
            test2(n-1); //n-1 = non-base case
        }
    }

    //third example of recursion (binary search)
    public static void findRecursively(int arr[], int start, int end, int search) {

        if(start > end) {
            return;
        }

        int mid = (start + end)/2;

        if(arr[mid] == search) {
            System.out.println(mid);
            return;

        } else if(search > arr[mid]) {
            findRecursively(arr, mid+1, end, search);

        } else {
            findRecursively(arr, start, mid - 1, search);
        }

    }

    //fourth example of recursion (factorial)
    public static int factorial(int n) {

        if (n > 0) {
            return n*factorial(n-1);
        }
        else {
            return 1;
        }
    }
}