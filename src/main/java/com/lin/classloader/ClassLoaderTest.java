package com.lin.classloader;

/**
 *
 * 测试热加载
 * @Auther: Lin tiangang
 * @Date: 2018/8/28 16:15
 * @Description:
 */
public class ClassLoaderTest {

    public static void main(String[] args) {
        new Thread(new MsgHandler()).start();
    }
}
