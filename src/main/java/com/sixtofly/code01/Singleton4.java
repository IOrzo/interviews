package com.sixtofly.code01;

/**
 * 单例模式懒汉式-枚举类型
 * @author xie yuan bing
 * @date 2021-01-11 16:11
 * @description
 */
public enum  Singleton4 {

    INSTANCE;


    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                System.out.println(Singleton4.INSTANCE.hashCode());
            }).start();
        }
    }
}
