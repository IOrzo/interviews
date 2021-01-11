package com.sixtofly.code01;

/**
 * 单例模式-错误写法
 * @author xie yuan bing
 * @date 2021-01-11 16:11
 * @description
 */
public class SingletonError {

    private static SingletonError INSTANCE = null;

    private SingletonError() {

    }

    /**
     * 这样会有线程安全问题, 可能会出现多个实例
     * @return
     */
    public static SingletonError getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonError();
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
                System.out.println(SingletonError.getInstance());
            }).start();
        }
    }
}
