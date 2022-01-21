package com.example.locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class MyClass {

    private ReentrantLock lock = new ReentrantLock();
    private int count;

    public void increament(){
        try {
            if (lock.tryLock(100, TimeUnit.MILLISECONDS)){
                count++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            if(lock.isLocked()){
                lock.unlock();
            }

        }

    }
}
