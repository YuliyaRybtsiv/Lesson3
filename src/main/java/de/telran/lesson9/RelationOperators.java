package de.telran.lesson9;

public class RelationOperators {
    public static void main(String[] args) {
        int val1 = 10, val2 = 15, val3 = -5, val4 = 10;

        System.out.println("val1 == val2 " + (val1 == val2)); //10 == 15
        System.out.println("val1 == val4" + (val1 == val4)); //10 == 10

        System.out.println("val1 != val2 " + (val1 != val2)); //10 != 15
        System.out.println("val1 != val4" + (val1 != val4)); //10 != 10

        System.out.println("val1 > val2 " + (val1 > val2)); //10 > 15
        System.out.println("val1 > val4" + (val1 > val4)); //10 > 10
        System.out.println("val1 > val3" + (val1 > val3)); //10 > -5

        System.out.println("val1 < val2 " + (val1 < val2)); //10 < 15
        System.out.println("val1 < val4" + (val1 < val4)); //10 < 10
        System.out.println("val1 < val3" + (val1 < val3)); //10 < -5

        System.out.println("val1 >= val2 " + (val1 >= val2)); //10 >= 15
        System.out.println("val1 >= val4" + (val1 >= val4)); //10 >= 10
        System.out.println("val1 >= val3" + (val1 >= val3)); //10 >= -5

        System.out.println("val1 <= val2 " + (val1 <= val2)); //10 >= 15
        System.out.println("val1 <= val4" + (val1 <= val4)); //10 >= 10
        System.out.println("val1 <= val3" + (val1 <= val3)); //10 >= -5

        double dblVal = 10.5;
        System.out.println("");
        System.out.println("val1 >= dblVal " + (val1>=dblVal)); //10 >= 10.5
        System.out.println("val1 <= dblVal " + (val1<=dblVal)); //10 <= 10.5

        System.out.println("val1 >= (int)dblVal " + (val1>=(int)dblVal)); //10 >= 10.5

        System.out.println("Округление double dblvAL = "+Math.round(dblVal));
        System.out.println("Преобразование double dblvAL = "+(int)dblVal);
    }
}
