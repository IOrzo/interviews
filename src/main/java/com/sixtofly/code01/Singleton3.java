package com.sixtofly.code01;

/**
 * 单例模式懒汉式-静态内部类
 * @author xie yuan bing
 * @date 2021-01-11 16:11
 * @description
 */
public class Singleton3 {

    private Singleton3() {

    }

    public static class Singleton3Holder {
        private static final Singleton3 INSTANCE = new Singleton3();
    }

    public static Singleton3 getInstance() {
        return Singleton3Holder.INSTANCE;
    }

    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                System.out.println(Singleton3.getInstance());
            }).start();
        }
    }
}
