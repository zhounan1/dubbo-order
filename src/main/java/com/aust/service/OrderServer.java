package com.aust.service;/*
 * Copyright © 2016 睿泰集团 版权所有
 */

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Autor zhouNan
 * @Date 2019/10/11 11:22
 * @Description OrderServer
 **/
public class OrderServer {
    public static void main(String[] args) {
        System.out.println("你好");
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:dubbo.xml");
        ctx.start();

        System.out.println("------------------------dubbo启动成功---------");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
