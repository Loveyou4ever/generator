package com.demo.test;

import org.mybatis.generator.api.ShellRunner;

/**
 * author: Created  By  Caojiawei
 * date: 2018/2/1  12:54
 */
public class App {
    public static void main(String[] args) {
        args = new String[] { "-configfile", "src\\main\\resources\\mybatis-generator-config.xml", "-overwrite" };
        ShellRunner.main(args);
    }
}
