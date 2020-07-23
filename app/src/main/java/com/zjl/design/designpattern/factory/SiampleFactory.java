package com.zjl.design.designpattern.factory;

/**
 * 简单工厂模式
 */
public class SiampleFactory {

    public static Apple getAppIntance() {
        return new Apple();
    }

    public static Watermanler getWatermanterIntance() {
        return new Watermanler();
    }


    public static void main(String[] astics) {

        SiampleFactory.getAppIntance().name();
        SiampleFactory.getWatermanterIntance().name();


    }
}
