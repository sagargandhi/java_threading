package demo.java.threading;

public class ExtRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("In ExtRunnable thread : " + i);
        }
    }

    public static void main(String[] args) {

        ExtRunnable myRunnable = new ExtRunnable();
        Thread th = new Thread(myRunnable);
        th.start();
        for(int i = 0; i < 10; i++){
            System.out.println("In main thread " + i);
        }

    }
}
