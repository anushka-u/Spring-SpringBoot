package com.logger.demo.service.impl;

import com.logger.demo.service.LogServiceI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.logging.LogLevel;
import org.springframework.boot.logging.LoggingSystem;
import org.springframework.stereotype.Service;

@Service
public class LogServiceIImpl implements LogServiceI {

    private static final Logger logger = LoggerFactory.getLogger(LogServiceIImpl.class);

    private final LoggingSystem loggingSystem;

    @Autowired
    public LogServiceIImpl(LoggingSystem loggingSystem) {
        this.loggingSystem = loggingSystem;
    }

    @Override
    public void setLogLevel(String loggerName, String level) {
        LogLevel logLevel = LogLevel.valueOf(level.toUpperCase());
        loggingSystem.setLogLevel(loggerName, logLevel);
        logger.info("Log level for {} set to {}", loggerName, logLevel);
    }
}