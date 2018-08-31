package com.lin.classloader;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 此类需要实现java类的热加载功能
 * @Auther: Lin tiangang
 * @Date: 2018/8/28 14:05
 * @Description:
 */
public class MyManager implements BaseManager {

    private static Logger log = LoggerFactory.getLogger(MyManager.class);
    public void logic() {
//        log.info("Java类热加载");
//        log.info("继续");
        System.out.println("Java类热加载继续");
        System.out.println("Java类热加载尔尔");
    }
}
