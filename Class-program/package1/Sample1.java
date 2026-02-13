package com.gla.package1;

public class Sample1 {
    private int varA;
    private static int varB;
    private void methodA(){

    }
    private static void methodB(){

    }
    int varC;
    static int varD;
    void methodC(){

    }
    static void methodD(){

    }

    static void main(String[] args) {
        System.out.println(varB);
        Sample1 obj = new Sample1();
        System.out.println(obj.varA);

        methodB();
        obj.methodC();
        System.out.println(varD);
        System.out.println(obj.varC);

        methodD();
        obj.methodC();
    }
}