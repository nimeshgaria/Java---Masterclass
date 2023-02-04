package com.company.JAVA8.functionalinterface;

public class RunnableExample implements Runnable{
    public static void main(String[] args) {
startRunnable();
    }
    private static void startRunnable(){
      /**Runnable using lambda function**/
        // interface refVar = method -> {impl}
        Runnable runnable = () -> {
            int count=0;
            while(count<10){
                System.out.println("starting thread - "+ Thread.currentThread().getName());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("ending thread - "+ Thread.currentThread().getName());
                count++;
            }
        };
        Thread thread = new Thread(runnable);
        System.out.println("starting main thread - " + Thread.currentThread().getName());
        thread.start();
        /**Runnable using traditional approach **/
        Runnable runnable1 = new RunnableExample();
        Thread t = new Thread(runnable1);
        t.start();

        /**Anonymous function: implementation class which doesn't have name **/
        Runnable run = new Runnable() {
            @Override
            public void run() {
                int count=0;
                while(count<10){
                    System.out.println("starting thread - "+ Thread.currentThread().getName());
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("ending thread - "+ Thread.currentThread().getName());
                    count++;
                }
            }
            };
        Thread t1 = new Thread(runnable);
        t1.start();

    }

    @Override
    public void run() {
        int count=0;
        while(count<10){
            System.out.println("starting thread - "+ Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("ending thread - "+ Thread.currentThread().getName());
            count++;
        }
    }
}

@FunctionalInterface
interface A{
    void a();
    /** 1. FI, can have only 1 abstract method, but can have n no of default/static methods
     *  2. This default is not an access modifier, this is keyword
     * **/
    default void b(){}
    static void c(){}
}


