package com.log_to_kafka;

import org.apache.log4j.Logger;

public class LogGenertater {

    private static Logger logger = Logger.getLogger(LogGenertater.class.getName());


    public static void main(String[] args) throws InterruptedException {

        int index = 0;
        while (true) {
            Thread.sleep(500);
            logger.info("value : " + index++ + "");
        }
    }
}
