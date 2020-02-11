package com.xqx.ych.common.util;

import java.util.UUID;

public class IDGenerator {
    public static String generatorUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static void main(String[] args) {
        System.out.println(generatorUUID());
    }
}
