package Multithreading;

class MyThread implements Runnable {
    public void run(){
        System.out.println("Thread is running");
    }
}

public class CreateThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.start();
    }
}
