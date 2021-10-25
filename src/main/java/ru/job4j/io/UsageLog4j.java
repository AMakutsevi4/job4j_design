package ru.job4j.io;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UsageLog4j {

    private static final Logger LOG = LoggerFactory.getLogger(UsageLog4j.class.getName());

    public static void main(String[] args) {
        BasicConfigurator.configure();
        String name = "Alexander Makutsevich";
        int age = 30;
        LOG.debug("User info name : {}, age : {}", name, age);
        boolean booleanVariable = true;
        byte byteVariable = 127;
        short shortVariable = 32767;
        int intVariable = 21474;
        long longVariable = 100L;
        double doubleVariable = 2.5;
        float floatVariable = 12.3f;
        char charVariable = 'Q';
        LOG.info("Variable example:");
        LOG.debug("boolean {}", booleanVariable);
        LOG.debug("byte {}", byteVariable);
        LOG.debug("short {}", shortVariable);
        LOG.debug("int {}", intVariable);
        LOG.debug("long {}", longVariable);
        LOG.debug("double {}", doubleVariable);
        LOG.debug("float {}", floatVariable);
        LOG.debug("char {}", charVariable);
    }
}