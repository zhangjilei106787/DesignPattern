package com.zjl.design.designpattern.strategymodel;

public class State2 implements Factory {
    @Override
    public void makeSomething() {
        System.out.println("我是策略模式2的方法");
    }
}
