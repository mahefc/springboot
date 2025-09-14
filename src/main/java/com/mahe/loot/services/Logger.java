package com.mahe.loot.services;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class Logger {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(Logger.class);

    public void info(String message) {
        logger.info(message);
    }

    public void error(String message) {
        logger.error(message);
    }

    public void warn(String message) {
        logger.warn(message);
    }

    public void debug(String message) {
        logger.debug(message);
    }
}