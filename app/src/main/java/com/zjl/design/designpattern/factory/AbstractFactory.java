package com.zjl.design.designpattern.factory;

/**
 * 抽象接口  可以构建多个子接口 构建不同的物种下不同的分类
 */
public class AbstractFactory {


    public static Rice getRiceInstance(String name) {
        Rice rice = null;
        try {
            rice = (Rice) Class.forName(name).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return rice;
    }

    public static Yumi getYumiInstance(String name) {
        Yumi rice = null;
        try {
            rice = (Yumi) Class.forName(name).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return rice;
    }


    public static void main(String[] astics) {
        AbstractFactory.getRiceInstance("com.zjl.design.designpattern.factory.Rice").name();
        AbstractFactory.getYumiInstance("com.zjl.design.designpattern.factory.Yumi").name();
    }
}
