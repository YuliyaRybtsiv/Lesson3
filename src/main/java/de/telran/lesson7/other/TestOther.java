package de.telran.lesson7.other;

public class TestOther {
    int intDefault = 1;
    public int intPublic = 2;
    private int intPrivate = 3;
    protected int intProtected = 4;
    public void testMethod() {
        System.out.println("Я testMethod() в классу TestOther");
        System.out.println(intPrivate);
        System.out.println(intPublic);
        System.out.println(intPrivate);
        System.out.println(intProtected);
    }
}
