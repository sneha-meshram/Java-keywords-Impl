package com.stackroute.lambdaDemo;

public class LambdaMain {
    public static void main(String[] args){

            //Traditional Way
            new Thread(new RunnableDemo()).start();
            //By anonymous class
            new Thread(new RunnableDemo() {
                @Override
                public void run() {
                    System.out.println("Anonymous class");
                }
            });
            //By Lambda Expression
            new Thread(()->{
                System.out.println("Lambda");
                System.out.println("Lambda2");
                System.out.println("Lambda3");
            }
            ).start();
        }
    }
