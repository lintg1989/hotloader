package com.lin.classloader;

/**
 * 后台起动一条线程不断刷新重新加载实现了热加载的类
 * @Auther: Lin tiangang
 * @Date: 2018/8/28 16:09
 * @Description:
 */
public class MsgHandler implements Runnable {
    public void run() {
        while (true) {
            BaseManager manager = ManagerFactory.getManager(ManagerFactory.MY_MANAGER);
            manager.logic();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
