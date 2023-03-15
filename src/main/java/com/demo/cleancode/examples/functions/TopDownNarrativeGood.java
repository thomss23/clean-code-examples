package com.demo.cleancode.examples.functions;

public class TopDownNarrativeGood {

    void method1() {
        method2();
        method4();
    }

    void method2() {
        method3();
    }

    void method3() {
        method4();
    }
    void method4() {

    }
}
