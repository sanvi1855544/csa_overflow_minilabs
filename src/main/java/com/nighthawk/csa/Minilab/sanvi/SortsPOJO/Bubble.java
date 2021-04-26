package com.nighthawk.csa.Minilab.sanvi.SortsPOJO;

public class Bubble extends Base {
    public Name[] sortArr(Name[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // comparing adjacent strings
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    Name temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
