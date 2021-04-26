package com.nighthawk.csa.Minilab.dhruvS.Recursion;
import java.util.*;
import java.lang.*;
public class Euclid {

        public static int gcd(int a, int b)
        {
            if (a == 0)
                return b;

            return gcd(b % a, a);
        }

        // Driver Program

    }
