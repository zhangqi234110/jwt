package com.example.jwt.xiancheng;

public class TestXian {
    public static void main(String[] args) throws InterruptedException {
        Axian axian = new Axian();
        Bxian bxian = new Bxian();
        Thread thread1 = new Thread(axian);
        Thread thread2 = new Thread(bxian);

            thread1.start();
            thread2.start();


    }
}
