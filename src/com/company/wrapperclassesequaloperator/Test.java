package com.company.wrapperclassesequaloperator;

public class Test {

    public static void main(String[] args) {
       // Constructor Approach
        Integer integer = new Integer(10);
        Integer integer1 = new Integer(10);

        /* This method always cache value in the range -128 to 128
        *
        * */

        // == operator : reference comparison
        System.out.println(integer == integer1);
        System.out.println(integer.equals(integer1)); // equals() method check content only

        Integer i1 = Integer.valueOf(200);
        Integer i2 = Integer.valueOf(200);

        // == operator : reference comparison
        System.out.println(i1 == i2);  // false // i1 & i2 value is out range
        System.out.println(i1.equals(i2)); // false

    }

}
