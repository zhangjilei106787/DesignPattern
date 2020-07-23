package com.zjl.design.designpattern.strategymodel;

public class State1 implements Factory {
    @Override
    public void makeSomething() {
        System.out.println("我是策略模式1的方法");
    }
}
