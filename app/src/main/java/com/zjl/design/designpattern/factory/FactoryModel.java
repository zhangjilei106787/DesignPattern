package com.zjl.design.designpattern.factory;


/**
 * 工厂模式
 */
public class FactoryModel {

    public static Fruit getInstance(String name) {
        if (name.equals("apple")) {
            return new Apple();
        } else if (name.equals("wartermanter")) {
            return new Watermanler();
        }
        return null;
    }

    public static void main(String[] astics) {
        Apple apple = (Apple) FactoryModel.getInstance("apple");
        apple.name();
        Watermanler watermanler = (Watermanler) FactoryModel.getInstance("wartermanter");
        watermanler.name();
    }

}
