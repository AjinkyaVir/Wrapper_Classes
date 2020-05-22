package com.company.convertwrappertoprimitivetring;

public class Test {

    public static void main(String[] args) {

        // wrapper class to primitive and string conversion

        //Constructor Approach of wrapper class
        Integer integer1 = new Integer(100);
        Integer integer2 = Integer.valueOf(100);

        //convert wrapper object into primitive data
        int x = integer1.intValue();
        int y = integer2.intValue();
        System.out.println(x + y);

        //convert wrapper object to string
        String s1 = integer1.toString();
        String s2 = integer2.toString();
        System.out.println(s1 + s2);


    }

}
