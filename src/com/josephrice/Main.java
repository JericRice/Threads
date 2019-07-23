package com.josephrice;

import static com.josephrice.ThreadColor.*;


public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Welcome from the Main Thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        new Thread(() -> System.out.println(ANSI_GREEN + "And hi from Anonymous Thread")).start();

        System.out.println(ANSI_PURPLE + "This is also from the Main Thread");

    }
}
