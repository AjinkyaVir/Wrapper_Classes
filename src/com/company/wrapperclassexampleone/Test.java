package com.company.wrapperclassexampleone;

public class Test {

    public static void main(String[] args) {

        Integer integer1 = new Integer(10);
        Integer integer2 = new Integer("10");
        System.out.println(integer1 + integer2);

        Integer i1 = Integer.valueOf(100);
        Integer i2 = Integer.valueOf("100");
        System.out.println(i1 + i2);

    }

}
