package com.josephrice;

import static com.josephrice.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from Thread Two");
    }
}
