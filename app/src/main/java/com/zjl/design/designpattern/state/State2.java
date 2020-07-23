package com.zjl.design.designpattern.state;

public class State2 implements StateInter {
    @Override
    public void eat() {
        System.out.println("我是状态2,我在做状态2模式下的工作1");
    }

    @Override
    public void shop() {
        System.out.println("我是状态2,我在做状态2模式下的工作2");
    }
}
