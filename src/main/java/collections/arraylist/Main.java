package collections.arraylist;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //The idea of array list is that a array list is more comfortable to use then primitive array.
        //Search element in ArrayList is good enough
        //But adding new element is a little problem when you have to add big part of data.
        //Because ArrayList store data in simple array,
        // if size will not specified it will be created with default size, and when max size will be reached it have to copy old array but with more sizing.
        List<Integer> arrayList = Arrays.asList(1,2,3,4,5,6);
    }
}
