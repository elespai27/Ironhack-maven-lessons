package com.ironhack.w1.d4.BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        //Big Decimal
        //Numbers Accurate

        System.out.println(1.2 - 1.0);
        BigDecimal bd1 = new BigDecimal("1.48454545");
        BigDecimal bd2 = new BigDecimal("1.35569632");
        System.out.println(bd1.subtract(bd2));
        System.out.println(bd1.add(bd2));
        System.out.println(bd1.multiply(bd2));
        System.out.println(bd1.divide(bd2, RoundingMode.HALF_EVEN));
        System.out.println(bd1.setScale(3, RoundingMode.HALF_EVEN));
        System.out.println(bd2.compareTo(bd1));//result is like a boolean but
        //if the first is less than the right the result -1, if equal 0 if bigger than.. 1

        if (bd1.compareTo(bd2) > 0) System.out.println("bd1 is greater than bd2");
        else if (bd1.compareTo(bd2) < 0) System.out.println("bd1 is less than bd2");
        else if (bd1.compareTo(bd2) == 0) System.out.println("bd1 is equal than bd2");

    }
}
