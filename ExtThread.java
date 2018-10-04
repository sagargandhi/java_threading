package demo.java.threading;

public class ExtThread extends Thread {

    @Override
    public void run(){

        for(int i = 0; i < 10; i++){
            System.out.println("In Extend thread : " + i);
        }
    }

    public static void main(String[] args){

            Thread th = new ExtThread();

            th.start();
            for(int i = 0; i <10;i++){
                System.out.println("In Main Thread : " + i);
        }
    }
}
