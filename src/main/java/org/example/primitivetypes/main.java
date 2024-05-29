package org.example.primitivetypes;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        byte a = 100;
        short b = 30_000;
        boolean flag = true;  // default value - false
        char c = 78; // N
        int i = 42;
        double d = 45.00D;
        float f = 4.27f;
        long l = 67;



        Integer con1 = Integer.valueOf(i);
        Double con2 = Double.valueOf(d);

        //Autoboxing & Unboxing

        // Autoboxing: Primitive int to Integer object
        List<Integer> list = new ArrayList<>();
        list.add(5); // int is automatically converted to Integer

        // Unboxing: Integer object to primitive int
        int num = list.get(0); // Integer is automatically converted to int

        System.out.println("Value: " + num); // Output: Value: 5

        int val = 8;
        // autoboxing
        Integer val1 = val;

        //unboxing
        int val2 = val1;
        // anf
        int val3 = list.get(0);



    }

}

















