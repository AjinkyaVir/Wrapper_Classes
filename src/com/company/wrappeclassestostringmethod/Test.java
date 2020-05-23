package com.company.wrappeclassestostringmethod;

public class Test {

    public static void main(String[] args) {

        Test t = new Test();

        // toString() : Object Class: return String representation of Object

        System.out.println(t);
        System.out.println(t.toString());

        // Sting object

        String s = "Ajinkya";
        System.out.println(s);
        System.out.println(s.toString());

        // StringBuffer : overriding toSting(): to print content

        StringBuffer stringBuffer   = new StringBuffer("Morya");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.toString());

        // Wrapper classes toString() : returns content of the object
        Integer integer = new Integer(10);
        System.out.println(integer);
        System.out.println(integer.toString());


    }

}
