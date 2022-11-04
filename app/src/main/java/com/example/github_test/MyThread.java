package com.example.github_test;

public class MyThread extends Thread{

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++) {
            System.out.println(this.getName()+" : "+i);
        }
        System.out.println("finish");
    }
}
