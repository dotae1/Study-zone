package org.com.thread;

public class Dog extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("dog sound 멍멍");

            try {
                /* 스레드를 일시 정지 시키는 메소드 */
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
