package com.zjl.design.designpattern.state;

public class State1 implements StateInter {
    @Override
    public void eat() {
        System.out.println("我是状态1,我在做状态1模式下的工作1");
    }

    @Override
    public void shop() {
        System.out.println("我是状态1,我在做状态1模式下的工作2");
    }
}
