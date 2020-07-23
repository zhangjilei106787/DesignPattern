package com.zjl.design.designpattern.strategymodel;

/**
 * 策略工厂  配合策略模式使用  进一步封装对外实现
 * <p>
 * 不需要创建策略  直接选择使用对应的策略
 */
public class StrategyFactory {

    public static void strategySwitch(String name) {
        StateModelHelper stateModelHelper = new StateModelHelper(name);
        stateModelHelper.doSomething();


    }

    public static void main(String[] astics) {
        StrategyFactory.strategySwitch("state1");
    }
}
