package com.demo.cleancode.examples.functions;

public class TopDownNarrativeBad {

    //The StepDown rule


    //TODO add some relevat sout() that will make it more readable or method names
    void method4() {

    }
    void method3() {
        method4();
    }
    void method2() {
        method3();
    }

    void method1() {
        method2();
        method4();
    }
}
