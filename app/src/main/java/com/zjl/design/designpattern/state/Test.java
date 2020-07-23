package com.zjl.design.designpattern.state;

/**
 * 测试状态模式
 * 策略模式：策略模式的Strategy类层次为Context定义了一系列的可供重用的算法或行为。
 * 继承有助于析取出这些算法中的公共功能。在实践中，我们发现可以用它来封装几乎任何类型的规则，
 * 只要在分析过程中听到需要在不同时间应用不同的业务规则，就可以考虑使用策略模式处理这种变化的可能性。
 *
 * -------------
 * 多实用一些全局的框架 算法 方案替换
 *
 *
 *
 * <p>
 * 状态模式：状态模式主要解决的是当控制一个对象状态转换的条件表达式过于复杂时的情况。
 * 把状态的判断逻辑转移到表示不同状态的一系列类当中，可以把复杂的判断逻辑简化。
 * ------------------------------------------------------------------------------
 * 当一个对象的行为取决于它的状态，并且它必须在运行时刻根据状态改变它的行为时，就可以考虑使用状态模式了。
 * -------------------------------------------------------------------------------
 */
public class Test {
    public StateInter stateInter;

    public void setState(StateInter stateInter) {
        this.stateInter = stateInter;
    }


    public void work1() {
        stateInter.eat();
        stateInter.shop();
    }

    public void work2() {
        stateInter.eat();
        stateInter.shop();
    }

    public static void main(String[] args) {
        Test test = new Test();
        //切换到第一种状态
        test.setState(new State1());
        test.work1();

       // 切换状态
        test.setState(new State2());
        test.work2();
    }

}
