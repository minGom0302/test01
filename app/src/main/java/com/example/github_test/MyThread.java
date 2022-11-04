package com.example.github_test;

public class MyThread extends Thread{
    private String threadName;
    // 생성자 : Thread 만들 때 값들을 설정할 수 있다.
    public MyThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    // .start() 시 실행되는 부분이다.
    public void run() {
        for(int i=0; i<10; i++) {
            System.out.println(threadName + " : " + i);
        }
        System.out.println("finish");
    }
}


class ThreadTest {
    public static void main(String[] args) {
        System.out.println("start");
        new MyThread("ThreadTest").start();
    }
}