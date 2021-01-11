package com.sixtofly.code01;

/**
 * 单例模式饿汉式
 * 程序加载就会实例化, 若对象不使用, 会造成内存浪费
 * @author xie yuan bing
 * @date 2021-01-11 16:11
 * @description
 */
public class Singleton1 {

    private static final Singleton1 INSTANCE = new Singleton1();

    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        return Singleton1.INSTANCE;
    }

    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                System.out.println(Singleton1.getInstance());
            }).start();
        }
    }
}
