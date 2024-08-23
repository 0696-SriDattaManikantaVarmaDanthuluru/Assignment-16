package Singleton;

public class Main {
    public static void main(String[] args) {
        Task t1 = new Task();
        Task t2 = new Task();
        Task t3 = new Task();
        Task t4 = new Task();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
class Task extends Thread {
    @Override
    public void run() {
        Singleton s = Singleton.getInstance(Thread.currentThread().getName());
        System.out.println(s.name);
    }
}