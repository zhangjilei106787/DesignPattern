package com.zjl.design.designpattern.strategymodel;

/**
 * 策略模式    多用于替换实现类  第三方框架的替换  定义统一接口
 *
 * 替换需要手动创建对应的实现策略
 */
public class StateModelHelper {

    public Factory factory;

    public StateModelHelper(Factory factory) {
        this.factory = factory;
    }

    public StateModelHelper(String name) {
        if(name.equals("state1")){
            this.factory = new State1();
        }else if(name.equals("state2")){
            this.factory = new State2();
        }
    }


    public void doSomething() {
        factory.makeSomething();
    }

    public static void main(String[] astics) {

//        StateModelHelper stateModelHelper = new StateModelHelper(new State1());
        StateModelHelper stateModelHelper = new StateModelHelper(new State2());

        stateModelHelper.doSomething();
    }

}
