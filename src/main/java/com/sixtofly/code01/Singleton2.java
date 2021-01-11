package com.sixtofly.code01;

/**
 * 单例模式懒汉式-双重检查
 * @author xie yuan bing
 * @date 2021-01-11 16:11
 * @description
 */
public class Singleton2 {

    private static volatile Singleton2 INSTANCE = null;

    private Singleton2() {

    }

    public static Singleton2 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton2.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton2();
                }
            }
        }
        return INSTANCE;
    }

    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                System.out.println(Singleton2.getInstance());
            }).start();
        }
    }
}
